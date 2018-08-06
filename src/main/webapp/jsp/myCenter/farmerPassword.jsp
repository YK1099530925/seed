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
<link rel="stylesheet" href="${appPath }/css/tips.css" />
<script src="${appPath }/js/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${appPath }/js/tips.js"></script>
<title>农户首页</title>
</head>
<body>
	<jsp:include page="../home/farmerHead.jsp"></jsp:include>
	
	<div class="container" style="margin-top: 75px;">
		<div class="row">
			<div class="col-md-2">
				<div class="list-group">
					<a href="farmerCenter.jsp" class="list-group-item">农户信息</a> <a
						href="farmerPassword.jsp" class="list-group-item active">修改密码</a>
				</div>
			</div>
			<div class="col-md-10">
				<div class="page-header">
					<h1>修改密码</h1>
				</div>
				<ul class="nav nav-tabs">
					<li><a href=" farmerCenter.jsp">农户信息</a></li>
					<li class="active"><a href="farmerPassword.jsp">修改密码</a></li>
				</ul>
				<form action="#" id="farmerPasswordForm" class="uesr_search col-md-10">
					<div class="alert alert-info" role="alert">
						<strong>提示：</strong> 点击修改按钮，进行修改
					</div>
					<div id="farmerOldPassword" class="form-group">
						<label for="oldPassword">原密码</label> 
						<div>
							<input type="password" id="oldPassword" name="oldPassword" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label for="newPassword">新密码</label> 
						<div>
							<input type="password" id="newPassword" name="newPassword" class="form-control" disabled="disabled">
						</div>
					</div>
					<div id="farmerConfirmPassword" class="form-group">
						<label for="confirmPassword">确认密码</label> 
						<div>
							<input type="password" id="confirmPassword" name="confirmPassword" class="form-control" disabled="disabled">
						</div>
					</div>
					<center><button type="button" id="farmerPasswordChange" class="btn btn-default" disabled="disabled">修改密码</button></center>
				</form>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">

var farmersId = "${sessionScope.farmer.farmersId }";

$("#farmerPasswordChange").click(function(){
	var newPassword = $("#newPassword")[0].value;
	$.ajax({
		url:"${appPath }/farmerPasswordChange",
		type:"post",
		data:{"newPassword" : newPassword},
		success:function(e){ 
			if(e){
				alert("修改成功");
			}
		}
	});  
});

$("#oldPassword").change(function(){
	var password = this.value.trim(); 
	$.ajax({
		url:"${appPath }/passwordIsTrue/" + farmersId + "/" + password,
		type:"get",
		success:function(e){
			if(e){
				$("#newPassword").removeAttr("disabled");
				addSuccessTips("#farmerOldPassword", "#oldPassword", "密码正确");
			}else{
				$("#newPassword").attr("disabled", "disabled");
				addErrorTips("#farmerOldPassword", "#oldPassword", "密码错误，请重新输入...");
			}
		}
	});
});

$("#newPassword").change(function(){
	if(this.value.trim() == ""){
		return;
	}
	var password1 = $("#confirmPassword")[0].value.trim();
	 if(password1 != ""){
		if(this.value.trim() != password1){
			addErrorTips("#farmerConfirmPassword", "#confirmPassword", "两次输入密码不一致");
			$("#farmerPasswordChange").attr("disabled", "disabled");
		}else{
			addSuccessTips("#farmerConfirmPassword", "#confirmPassword", "输入密码一致");
			$("#farmerPasswordChange").removeAttr("disabled");
		}
	} 
	$("#confirmPassword").removeAttr("disabled");
});

$("#confirmPassword").change(function(){
	var newPassword = $("#newPassword")[0].value;
	var confirmPassword = $("#confirmPassword")[0].value;
	if(newPassword != confirmPassword){
		addErrorTips("#farmerConfirmPassword", "#confirmPassword", "两次输入密码不一致，请重新输入...");
		$("#farmerPasswordChange").attr("disabled", "disabled");
		return;
	}
	addSuccessTips("#farmerConfirmPassword", "#confirmPassword", "密码一致");
	$("#farmerPasswordChange").removeAttr("disabled");
});
</script>
</html>