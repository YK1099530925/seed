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
<title>播种</title>
</head>
<body>
	<jsp:include page="../home/farmerHead.jsp"></jsp:include>
	<div class="container" style="margin-top: 75px;">
		<div class="row">
			<div class="col-md-2">
				<div class="list-group">
					<a href="landInfoCollection.jsp" class="list-group-item">添加土地信息</a> 
					<a href="seedInRoomCollection.jsp" class="list-group-item">种子入库</a> 
					<a href="seeding.jsp" class="list-group-item active">播种</a>
					<a href="seedGrow.jsp" class="list-group-item">种子生长过程</a>
					<a href="harvest.jsp" class="list-group-item">农作物收获</a>
				</div>
			</div>
			<div class="col-md-10">
				<div class="page-header">
					<h1>播种</h1>
				</div>
				<ul class="nav nav-tabs">
					<li><a href="landInfoCollection.jsp">添加土地信息</a></li>
					<li><a href="seedInRoomCollection.jsp">种子入库</a></li>
					<li class="active"><a href="seeding.jsp">播种</a></li>
					<li><a href="seedGrow.jsp">种子生长过程</a></li>
					<li><a href="harvest.jsp">农作物收获</a></li>
				</ul>
				<form action="#" id="seedingForm" class="uesr_search col-md-10">
					<div class="alert alert-info" role="alert">
						<strong>提示：</strong> 播种过程，所有农作物都从播种这一步开始进行记录
					</div>
					<div class="form-group">
						<label for="landId" class="control-label">选择土地</label>
						<div class="">
							<select class="form-control" id="landId" name="landId">
							</select>
						</div>
					</div>
						<div class="form-group">
						<label for="seedName">选择种子名称</label> 
						<div>
							<select class="form-control" id="seedName" name="seedName">
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="seedCode">种子的信息</label> 
						<div>
							<select class="form-control" id="seedCode" name="seedCode">
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="eventType" class="col-sm-2 control-label">类型</label>
						<input type="text" class="form-control" id="eventType" name="eventType" value="播种" disabled="disabled">
					</div>
					<div class="form-group">
						<label for="eventInfo">选用物品（若无，则无需添加）</label> 
						<div>
							<input type="text" id="eventInfo" name="eventInfo" class="form-control" placeholder="" value="播种">
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
		}
	});

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
});

$("#seedName").change(function(){
	$("#seedCode")[0].selectedIndex = this.selectedIndex;
});
$("#seedCode").change(function(){
	$("#seedName")[0].selectedIndex = this.selectedIndex;
});

$("#seedingSubmit").click(function(){
	$("#eventType").removeAttr("disabled");
	$("#farmersId").removeAttr("disabled");
	$.ajax({
		url:"${appPath }/seedGrow",
		type:"post",
		data:$("#seedingForm").serialize(),
		success:function(e){
			$("#eventType").attr("disabled","disabled");
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