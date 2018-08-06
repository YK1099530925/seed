<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%
	pageContext.setAttribute("appPath", request.getContextPath());
%>
<link rel="stylesheet" href="${appPath }/css/bootstrap-maizi1.css" />
<title>农作物收获</title>
</head>
<body>
	<jsp:include page="../home/farmerHead.jsp"></jsp:include>
	<div class="container" style="margin-top: 75px;">
		<div class="row">
			<div class="col-md-2">
				<div class="list-group">
					<a href="landInfoCollection.jsp" class="list-group-item">添加土地信息</a> 
					<a href="seedInRoomCollection.jsp" class="list-group-item">种子入库</a> 
					<a href="seeding.jsp" class="list-group-item">播种</a>
					<a href="seedGrow.jsp" class="list-group-item">种子生长过程</a>
					<a href="harvest.jsp" class="list-group-item active">农作物收获</a>
				</div>
			</div>
			<div class="col-md-10">
				<div class="page-header">
					<h1>农作物收获</h1>
				</div>
				<ul class="nav nav-tabs">
					<li><a href="landInfoCollection.jsp">添加土地信息</a></li>
					<li><a href="seedInRoomCollection.jsp">种子入库</a></li>
					<li><a href="seeding.jsp">播种</a></li>
					<li><a href="seedGrow.jsp">种子生长过程</a></li>
					<li class="active"><a href="harvest.jsp">农作物收获</a></li>
				</ul>
				<form action="#" id="seedingForm" class="uesr_search col-md-10">
					<div class="alert alert-info" role="alert">
						<strong>提示：</strong> 收获，即农作物成熟丰收
					</div>
					<div class="form-group">
						<label for="landId" class="control-label">选择土地</label>
						<div class="">
							<select class="form-control" id="landId" name="landId">
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="seedName">农作物名称</label> 
						<div>
							<input type="text" id="seedName" name="seedName" class="form-control" placeholder="" disabled="disabled">
						</div>
					</div>
					<div class="form-group">
						<label for="seedCode">农作物种子的信息</label> 
						<div>
							<input type="text" id="seedCode" name="seedCode" class="form-control" placeholder="" disabled="disabled">
						</div>
					</div>
					<div class="form-group">
						<label for="eventType" class="col-sm-2 control-label">类型</label>
						<input type="text" class="form-control" id="eventType" name="eventType" value="收获" disabled="disabled">
					</div>
					<div class="form-group">
						<label for="eventInfo">选用物品（若无，则无需添加）</label> 
						<div>
							<input type="text" id="eventInfo" name="eventInfo" class="form-control" placeholder="" value="收获">
						</div>
					</div>
					<div class="form-group">
						<label for="farmersId">农户编号</label> 
						<div>
							<input type="text" id="farmersId" name="farmersId" class="form-control" placeholder="" value="${sessionScope.farmer.farmersId }" disabled="disabled">
						</div>
					</div>
					<div class="form-group">
						<label for="remarks">备注</label> 
						<div>
							<input type="text" id="remarks" name="remarks" class="form-control" placeholder="">
						</div>
					</div>
					<center><button type="button" id="seedingSubmit" class="btn btn-default">提交</button></center>
				</form>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">

//显示土地编号
$(function(){
	$("#landId").empty();
	$.ajax({
		url:"${appPath }/getLandId",
		type:"GET",
		success:function(e){
			$.each(e,function(){
				var optionEle = $("<option></option>").append(this.landId).attr("value",this.landId);
				optionEle.appendTo("#landId");
			});
			addInfo();	
		}
	});
	
});

//输入框事件改变监听：改变土地编号，查询对应土地种植的信息
$("#landId").change(function(){
	addInfo();
});

function addInfo(){
	var landId = $("#landId")[0].value;
	$.ajax({
		url:"${appPath }/getSeedInfoByLandId/" + landId,
		type:"get",
		success:function(e){
			if(e == ""){
				$("#seedName")[0].value = "此田无种子信息";
				$("#seedCode")[0].value = "此田无种子信息";
			}else{
				$("#seedName")[0].value = e.seedName;
				$("#seedCode")[0].value = e.seedCode;
			}
		},
		error:function(e){
		}
	});
}

/* function addInfo(){
	$("#seedName").empty();
	$("#seedCode").empty();
	$.ajax({
		url:"${appPath }/getSeedName",
		type:"GET",
		success:function(e){
			$.each(e,function(){
				var optionEle = $("<option></option>").append(this.seedName).attr("value",this.seedName);
				optionEle.appendTo("#seedName");
				var optionEle1 = $("<option></option>").append(this.seedCode).attr("value",this.seedCode);
				optionEle1.appendTo("#seedCode");
			});
		}
	});
} */

/* $("#seedName").change(function(){
	$("#seedCode")[0].selectedIndex = this.selectedIndex;
});
$("#seedCode").change(function(){
	$("#seedName")[0].selectedIndex = this.selectedIndex;
}); */

$("#seedingSubmit").click(function(){
	if($("#seedName")[0].value == "此田无种子信息"){
		alert("此田无信息，不可收获");
		return;
	}
	$("#seedName").removeAttr("disabled");
	$("#seedCode").removeAttr("disabled");
	$("#eventType").removeAttr("disabled");
	$("#farmersId").removeAttr("disabled");
	$.ajax({
		url:"${appPath }/seedGrow",
		type:"post",
		data:$("#seedingForm").serialize(),
		success:function(e){
			if(e){
				//收获之后将事件表中种子对应的田地删掉
				harvest();
			}
			
		},
		error:function(e){
			alert("记录失败");
		}
	});
});

function harvest(){
	$.ajax({
		url:"${appPath }/harvest",
		type:"post",
		data:$("#seedingForm").serialize(),
		success:function(e){
			$("#seedName").attr("disabled","disabled");
			$("#seedCode").attr("disabled","disabled");
			$("#eventType").attr("disabled","disabled");
			$("#farmersId").attr("disabled","disabled");
			if(e){
				alert("收获成功");
			}
		},
		error:function(e){
			alert("收获删除失败");
		}
	});
}

</script>

</html>