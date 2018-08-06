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
<title>种子生长过程信息</title>
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
					<a href="seedGrow.jsp" class="list-group-item active">种子生长过程</a>
					<a href="harvest.jsp" class="list-group-item">农作物收获</a>
				</div>
			</div>
			<div class="col-md-10">
				<div class="page-header">
					<h1>种子生长过程</h1>
				</div>
				<ul class="nav nav-tabs">
					<li><a href="landInfoCollection.jsp">添加土地信息</a></li>
					<li><a href="seedInRoomCollection.jsp">种子入库</a></li>
					<li><a href="seeding.jsp">播种</a></li>
					<li class="active"><a href="seedGrow.jsp">种子生长过程</a></li>
					<li><a href="harvest.jsp">农作物收获</a></li>
				</ul>
				<form action="#" id="seedGrowForm" class="uesr_search col-md-10">
					<div class="alert alert-info" role="alert">
						<strong>按钮选择提示：</strong> 
						<br>
<!-- 						本土地：只对编号对应土地进行所选操作
						<br>
						同类型种植土地：选择的种子，所种的土地都进行所选操作
						<br>
						所有土地：所有土地都进行此操作 -->
					</div>
					<div class="form-group">
						<label for="landId" class="control-label">选择土地</label>
						<div class="">
							<select class="form-control" id="landId" name="landId">
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="seedName">种子名称</label> 
						<div>
							<input type="text" id="seedName" name="seedName" class="form-control" placeholder="" disabled="disabled">
						</div>
					</div>
					<div class="form-group">
						<label for="seedCode">种子信息</label> 
						<div>
							<input type="text" id="seedCode" name="seedCode" class="form-control" placeholder="" disabled="disabled">
						</div>
					</div>
					<div class="form-group">
						<label for="eventType" class="col-sm-2 control-label">类型选择</label>
						<div>
							<select class="form-control" id="eventType" name="eventType">
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="eventInfo">用品信息（扫描用品添加）</label> 
						<div>
							<input type="text" id="eventInfo" name="eventInfo" class="form-control" placeholder="">
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
							<input type="text" id="remarks" name="remarks"
								class="form-control">
						</div>
					</div>
					
<!-- 					<div class="form-group">
						<div class="col-sm-10" id="chooseType">
							<label class="radio-inline"> <input type="radio"
								name="chooseType" value="one" checked="checked"> 本土地
							</label> 
							<label class="radio-inline"> <input type="radio"
								name="chooseType" value="some"> 同类型种植土地
							</label>
							<label class="radio-inline"> <input type="radio"
								name="chooseType" value="all"> 所有土地
							</label>
						</div>
					</div> -->
					<center><button type="button" id="seedGrowSubmit" class="btn btn-default">提交</button></center>
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
			addType();
			addInfo();
		}
	})
});

//添加操作的类型
function addType(){
	$("#eventType").empty();
	$.ajax({
		url:"${appPath }/getEventType",
		type:"get",
		success:function(e){
			$.each(e,function(){
				var optionEle = $("<option></option>").append(this.eventType).attr("value",this.eventType);
				optionEle.appendTo("#eventType");
			});
		}
	});
}

//改变土地编号，查询对应土地种植的信息
$("#landId").change(function(){
	addInfo();
});

//自动添加信息
function addInfo(){
	var landId = $("#landId").val()
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

$("#seedGrowSubmit").click(function(){
	if($("#seedName")[0].value == "此田无种子信息"){
		alert("无信息可记录");
		return;
	}

	if($("#eventInfo")[0].value == ""){
		alert("没有用品的信息");
		return;
	}

	$("#seedName").removeAttr("disabled");
	$("#seedCode").removeAttr("disabled");
	$("#farmersId").removeAttr("disabled");
	$.ajax({
		url:"${appPath }/seedGrow",
		type:"post",
		data:$("#seedGrowForm").serialize(),
		success:function(e){
			$("#seedName").attr("disabled","disabled");
			$("#seedCode").attr("disabled","disabled");
			$("#farmersId").attr("disabled","disabled");
			alert("记录成功");
		},
		error:function(e){
			alert("记录失败");
		}
	});
});

</script>

</html>