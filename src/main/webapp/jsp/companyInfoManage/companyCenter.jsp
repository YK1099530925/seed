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
	<jsp:include page="../home/companyHead.jsp"></jsp:include>
	
	<div class="container" style="margin-top: 75px;">
		<div class="row">
			<div class="col-md-2">
				<div class="list-group">
					<a href="companyCenter.jsp" class="list-group-item active">农户信息</a> <a
						href="companyPassword.jsp" class="list-group-item">修改密码</a>
				</div>
			</div>
			<div class="col-md-10">
				<div class="page-header">
					<h1>农户信息</h1>
				</div>
				<ul class="nav nav-tabs">
					<li class="active"><a href=" companyCenter.jsp">农户信息</a></li>
					<li><a href="companyPassword.jsp">修改密码</a></li>
				</ul>
				<form action="#" id="companyInfoForm" class="uesr_search col-md-10">
					<div class="alert alert-info" role="alert">
						<strong>提示：</strong> 点击修改按钮，进行修改
					</div>
					<div class="form-group">
						<label for="companyName">公司名称</label> 
						<div>
							<input type="text" id="companyName" name="companyName" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label for="companyId">编号</label> 
						<div>
							<input type="text" id="companyId" name="companyId" class="form-control" disabled="disabled">
						</div>
					</div>
					<div class="form-group">
						<label for="companyAddress">住址</label> 
						<div>
							<input type="text" id="companyAddress" name="companyAddress" class="form-control">
						</div>
					</div>
					<div id="companyConfirmTelephone" class="form-group">
						<label for="companyTelephone">电话</label> 
						<div>
							<input type="text" id="companyTelephone" name="companyTelephone" class="form-control">
						</div>
					</div>
					<center><button type="button" id="companyInfoChange" class="btn btn-default" disabled="disabled">修改信息</button></center>
				</form>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">

$(function(){
	showCompanyInfo();
});

function showCompanyInfo(){
	var companyId = "${sessionScope.company.companyId }";
	$.ajax({
		url:"${appPath }/getCompanyInfo/" + companyId,
		type:"get",
		success:function(e){
			$("#companyName")[0].value = e.companyName;
			$("#companyId")[0].value = e.companyId;
			$("#companyAddress")[0].value = e.companyAddress;
			$("#companyTelephone")[0].value = e.companyTelephone;
		},
		error:function(e){
		}
	});
}

$("#companyInfoChange").click(function(){
	$("#companyId").removeAttr("disabled");
	$.ajax({
		url:"${appPath }/updateFarmerInfo",
		type:"post",
		data:$("#companyInfoForm").serialize(),
		success:function(e){
			$("#companyId").attr("disabled","disabled");
			$("#companyInfoChange").attr("disabled","disabled");
			alert("修改成功");
		}
	});
});

$("#companyName").change(function(){
	$("#companyInfoChange").removeAttr("disabled");
});

$("#companyAddress").change(function(){
	$("#companyInfoChange").removeAttr("disabled");
});

$("#companyTelephone").change(function(){
	$("#companyInfoChange").removeAttr("disabled");
});

//手机验证
$("#companyTelephone").change(function(){
	var phone = $("#companyTelephone")[0].value.trim();
	var pattern = /^1[34578]\d{9}$/; 
	if(pattern.test(phone)){
		addSuccessTips("#companyConfirmTelephone", "#companyTelephone", "电话格式正确");
		$("#companyInfoChange").removeAttr("disabled");
	}else{
		addErrorTips("#companyConfirmTelephone", "#companyTelephone", "电话格式有误");
		$("#companyInfoChange").attr("disabled", "disabled");
	}
});

</script>

</html>