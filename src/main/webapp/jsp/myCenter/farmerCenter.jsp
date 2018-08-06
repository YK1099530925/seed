<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%
	pageContext.setAttribute("appPath", request.getContextPath());
%>
<script type="text/javascript" src="${appPath }/js/jquery-1.12.4.min.js"></script>
<link href="${appPath }/js/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="${appPath }/css/bootstrap-maizi.css" />
<link rel="stylesheet" href="${appPath }/css/bootstrap-maizi1.css" />
<script src="${appPath }/js/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="${appPath }/css/tips.css">
<script src="${appPath }/js/tips.js"></script>
<title>农户首页</title>
</head>
<body>
	<jsp:include page="../home/farmerHead.jsp"></jsp:include>
	
	<div class="container" style="margin-top: 75px;">
		<div class="row">
			<div class="col-md-2">
				<div class="list-group">
					<a href="farmerCenter.jsp" class="list-group-item active">农户信息</a> <a
						href="farmerPassword.jsp" class="list-group-item">修改密码</a>
				</div>
			</div>
			<div class="col-md-10">
				<div class="page-header">
					<h1>农户信息</h1>
				</div>
				<ul class="nav nav-tabs">
					<li class="active"><a href=" farmerCenter.jsp">农户信息</a></li>
					<li><a href="farmerPassword.jsp">修改密码</a></li>
				</ul>
				<form action="#" id="farmerInfoForm" class="uesr_search col-md-10">
					<div class="alert alert-info" role="alert">
						<strong>提示：</strong> 点击修改按钮，进行修改
					</div>
					<div class="form-group">
						<label for="farmersName">姓名</label> 
						<div>
							<input type="text" id="farmersName" name="farmersName" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label for="farmersId">编号</label> 
						<div>
							<input type="text" id="farmersId" name="farmersId" class="form-control" disabled="disabled">
						</div>
					</div>
					<div class="form-group">
						<label for="farmersAddress">住址</label> 
						<div>
							<input type="text" id="farmersAddress" name="farmersAddress" class="form-control">
						</div>
					</div>
					<div id="farmerConfirmTelephone" class="form-group">
						<label for="farmersTelephone">电话</label> 
						<div>
							<input type="text" id="farmersTelephone" name="farmersTelephone" class="form-control">
						</div>
					</div>
					<center><button type="button" id="farmerInfoChange" class="btn btn-default" disabled="disabled">修改信息</button></center>
				</form>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">

$(function(){
	showFarmerInfo();
});

function showFarmerInfo(){
	var farmersId = "${sessionScope.farmer.farmersId }";
	$.ajax({
		url:"${appPath }/getfarmerInfo/" + farmersId,
		type:"get",
		success:function(e){
			$("#farmersName")[0].value = e.farmersName;
			$("#farmersId")[0].value = e.farmersId;
			$("#farmersAddress")[0].value = e.farmersAddress;
			$("#farmersTelephone")[0].value = e.farmersTelephone;
		},
		error:function(e){
		}
	});
}

$("#farmerInfoChange").click(function(){
	$("#farmersId").removeAttr("disabled");
	$.ajax({
		url:"${appPath }/updateFarmerInfo",
		type:"post",
		data:$("#farmerInfoForm").serialize(),
		success:function(e){
			$("#farmersId").attr("disabled","disabled");
			$("#farmerInfoChange").attr("disabled","disabled");
			alert("修改成功");
		}
	});
});

$("#farmersName").change(function(){
	$("#farmerInfoChange").removeAttr("disabled");
});

$("#farmersAddress").change(function(){
	$("#farmerInfoChange").removeAttr("disabled");
});

$("#farmersTelephone").change(function(){
	$("#farmerInfoChange").removeAttr("disabled");
});

$("#farmersTelephone").change(function(){
	var phone = $("#farmersTelephone")[0].value.trim();
	var pattern = /^1[34578]\d{9}$/; 
	if(pattern.test(phone)){
		addSuccessTips("#farmerConfirmTelephone", "#farmersTelephone", "电话格式正确");
		$("#farmerInfoChange").removeAttr("disabled");
	}else{
		addErrorTips("#farmerConfirmTelephone", "#farmersTelephone", "电话格式有误");
		$("#farmerInfoChange").attr("disabled", "disabled");
	}
});

</script>

</html>