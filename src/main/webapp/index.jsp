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
<script src="${appPath }/js/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="./Wopop_files/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/style.css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/userpanel.css">
<link rel="stylesheet" type="text/css" href="./css/tips.css">
<script src="${appPath }/js/tips.js"></script>
<title>登陆</title>
</head>
<body class="login" mycollectionplug="bind">

<div class="login_m">
<div class="login_logo"><img src="./Wopop_files/logo.png" width="196" height="46"></div>
<div class="login_boder">

<form class="login_padding" id="login_model">

  <h2>用户名</h2>
  <label>
    <input type="text" name="name" class="txt_input txt_input2">
  </label>
  <h2>密码</h2>
  <label>
    <input type="password" name="password" class="txt_input">
  </label>
  
  <br>
  
  <div class="form-group">
     <div class="col-sm-10" id="chooseType">
       <label class="radio-inline">
		   <input type="radio" name="chooseType" value="company" checked="checked"> 公司
	   </label>
	   <label class="radio-inline">
		   <input type="radio" name="chooseType" value="farmer"> 农户
	   </label>
     </div>
 </div>
 
 <br>
 
  <!-- <p class="forgot"><a id="iforget" href="javascript:void(0);">忘记密码</a></p> -->
  <div class="rem_sub">
  <div class="rem_sub_l">
  <input type="checkbox" name="checkbox" id="save_me">
   <label for="checkbox">记住密码</label>
   </div>
    <label>
	  <input type="button" class="sub_button" name="button" id="register" value="注册" style="opacity: 0.7;">
      <input type="button" class="sub_button" name="button" id="submitButton" value="登陆" style="opacity: 0.7;">
    </label>
  </div>
</form>

<!-- Modal -->
<div class="modal fade" id="farmerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">注册用户</h4>
            </div>
            <div class="modal-body">
                <form action="#">
                    <div class="form-group">
                        <label for="farmersName">用户名</label>
                        <input type="text" id="farmersName" name="farmersName" class="form-control" placeholder="用户名">
                    </div>
                    <div class="form-group">
                        <label for="farmersPassword">用户密码</label>
                        <input type="password" id="farmersPassword" name="password" class="form-control" placeholder="密码">
                    </div>
                    <div id="farmerConfirmPassword" class="form-group">
                        <label for="farmersPassword1">确认用户密码</label>
                        <input type="password" id="farmersPassword1" name="farmersPassword1" class="form-control" placeholder="请确密码">
                    </div>
                    <div class="form-group">
                        <label for="farmersAddress">请输入用户地址</label>
                        <input type="text" id="farmersAddress" name="farmersAddress" class="form-control" placeholder="地址">
                    </div>
                    <div id="farmerConfirmTelephone" class="form-group">
                        <label for="farmersTelephone">请输入用户电话</label>
                        <input type="text" id="farmersTelephone" name="farmersTelephone" class="form-control" placeholder="电话">
                    </div>
                    
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button id="registerFarmer" type="button" class="btn btn-primary">注册</button>
            </div>
        </div>
    </div>
</div>

<!-- Modal1 -->
<div class="modal fade" id="companyModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel1">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel1">注册公司</h4>
            </div>
            <div class="modal-body">
                <form action="#">
                    <div class="form-group">
                        <label for="companyName">公司名</label>
                        <input type="text" id="companyName" name="companyName" class="form-control" placeholder="用户名">
                    </div>
                    <div class="form-group">
                        <label for="companyPassword">密码</label>
                        <input type="password" id="companyPassword" name="password" class="form-control" placeholder="密码">
                    </div>
                    <div id="companyConfirmPassword" class="form-group">
                        <label for="companyPassword1">确认密码</label>
                        <input type="password" id="companyPassword1" name="password1" class="form-control" placeholder="请确密码">
                    </div>
                    <div class="form-group">
                        <label for="companyAddress">公司地址</label>
                        <input type="text" id="companyAddress" name="companyAddress" class="form-control" placeholder="地址">
                    </div>
                    <div id="companyConfirmTelephone" class="form-group">
                        <label for="companyTelephone">公司电话</label>
                        <input type="text" id="companyTelephone" name="companyTelephone" class="form-control" placeholder="电话">
                    </div>
                    
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button id="registerCompany" type="button" class="btn btn-primary">注册</button>
            </div>
        </div>
    </div>
</div>

<!-- Modal2 -->
<div class="modal fade" id="farmerModalChoose" tabindex="-1" role="dialog" aria-labelledby="myModalLabelChoose">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabelChoose">注册</h4>
            </div>
            <div class="modal-body">
                <center>
                	<button id="chooseCompany" class="btn btn-info">公司</button>
                	<button id="chooseFarmer" class="btn btn-info">农户</button>
                </center>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>

</body>

<script type="text/javascript">

	//全局变量，用于用户密码判断
	var farmerPasswordBoolean = false;
	var companyPasswordBoolean = false;

	var farmerTelephone = false;
	var companyTelephone = false;

	$("#register").click(function(){
		//弹出模态框
		$("#farmerModalChoose").modal({
			backdrop:"static"
		});
	});

	$("#chooseCompany").click(function(){
		$("#farmerModalChoose").modal('hide');
		
		$("#companyModal").modal({
			backdrop:"static"
		});
		
	});

	$("#chooseFarmer").click(function(){
		$("#farmerModalChoose").modal('hide');
		
		$("#farmerModal").modal({
			backdrop:"static"
		});
	});

	//农户密码校验
	$("#farmersPassword").change(function(){
		var password1 = $("#farmersPassword1")[0].value.trim();
		
		if(password1 != ""){
			if(this.value.trim() != password1){
				farmerPasswordBoolean = false;
				addErrorTips("#farmerConfirmPassword", "#farmersPassword1", "两次输入密码不一致");
			}else{
				farmerPasswordBoolean = true;
				addSuccessTips("#farmerConfirmPassword", "#farmersPassword1", "输入密码一致");
			}
		}
	});

	$("#farmersPassword1").change(function(){
		if(this.value.trim() != $("#farmersPassword")[0].value.trim()){
			farmerPasswordBoolean = false;
			addErrorTips("#farmerConfirmPassword", "#farmersPassword1", "两次输入密码不一致");
		}else{
			farmerPasswordBoolean = true;
			addSuccessTips("#farmerConfirmPassword", "#farmersPassword1", "输入密码一致");
		}
	});

	//公司密码校验
	$("#companyPassword").change(function(){
		var password1 = $("#companyPassword1")[0].value.trim();
		if(password1 != ""){
			if($("#companyPassword")[0].value.trim() != password1){
				companyPasswordBoolean = false;
				addErrorTips("#companyConfirmPassword", "#companyPassword1", "两次输入密码不一致");
			}else{
				companyPasswordBoolean = true;
				addSuccessTips("#companyConfirmPassword", "#companyPassword1", "输入密码一致");
			}
		}
	});

	$("#companyPassword1").change(function(){
		if($("#companyPassword1")[0].value.trim() != $("#companyPassword")[0].value.trim()){
			companyPasswordBoolean = false;
			addErrorTips("#companyConfirmPassword", "#companyPassword1", "两次输入密码不一致");
		}else{
			companyPasswordBoolean = true;
			addSuccessTips("#companyConfirmPassword", "#companyPassword1", "输入密码一致");
		}
	});

	//验证手机号
	$("#farmersTelephone").change(function(){
		var phone = $("#farmersTelephone")[0].value.trim();
		var pattern = /^1[34578]\d{9}$/; 
		if(pattern.test(phone)){
			farmerTelephone = true;
			addSuccessTips("#farmerConfirmTelephone", "#farmersTelephone", "电话格式正确");
		}else{
			farmerTelephone = false;
			addErrorTips("#farmerConfirmTelephone", "#farmersTelephone", "电话格式有误");
		}
	});
	
	$("#companyTelephone").change(function(){
		var phone = $("#companyTelephone")[0].value.trim();
		var pattern = /^1[34578]\d{9}$/; 
		if(pattern.test(phone)){
			companyTelephone = true;
			addSuccessTips("#companyConfirmTelephone", "#companyTelephone", "电话格式正确");
		}else{
			companyTelephone = false;
			addErrorTips("#companyConfirmTelephone", "#companyTelephone", "电话格式有误");
		}
	});
	
	/*注册公司*/
 	$("#registerCompany").click(function(){
 	 	if(!companyPasswordBoolean){
 	 	 	alert("两次密码有误，请正确输入...");
 	 	 	return;
 	 	 }
	 	 if(!companyTelephone){
	 		alert("电话输入有误，请正确输入...");
		 	 return;
		 }
		$.ajax({
			url:"${appPath }/companyRegister",
			type:"POST",
			data:$("#companyModal form").serialize(),
			success:function(e){
				if(e){
					$("#companyModal").modal('hide');
					alert("注册成功");
				}
			},
			error:function(e){
				alert("注册失败");
				$("#companyModal").modal('hide');
			}
		});
	});

	/*注册农户*/
 	$("#registerFarmer").click(function(){
 		if(!farmerPasswordBoolean){
 	 	 	alert("两次密码有误，请正确输入...");
 	 	 	return;
 	 	 }
 		if(!farmerTelephone){
 	 	 	alert("电话输入有误，请正确输入...");
 	 	 	return;
 	 	 }
		$.ajax({
			url:"${appPath }/farmerRegister",
			type:"POST",
			data:$("#farmerModal form").serialize(),
			success:function(e){
				$("#farmerModal").modal('hide');
				alert("注册成功");
			},
			error:function(e){
				alert("注册失败");
				$("#farmerModal").modal('hide');
			}
		});
	});
	
	$("#submitButton").click(function() {
		//获取选中按钮的值
		var val = $('#chooseType input[name="chooseType"]:checked').val();
		if(val == "company"){
			$.ajax({
				url:"${appPath }/companyLogin",
				type:"GET",
				data:$("#login_model").serialize(),
				success:function(e){
					if(e == "success"){
						window.location.href = "${appPath }/jsp/home/companyHome.jsp";
					}else if(e == "false"){
						alert("登陆失败");
					}
				},
				error:function(e){
					alert("登陆失败");
				}
			});
		}else if(val == "farmer"){
			$.ajax({
				url:"${appPath }/farmerLogin",
				type:"POST",
				data:$("#login_model").serialize(),
				success:function(e){
					if(e == "success"){
						window.location.href = "${appPath }/jsp/home/farmerHome.jsp";
					}else if(e == "false"){
						alert("登陆失败");
					}
				},
				error:function(e){
					alert("登陆失败");
				}
			});
		}
	});
</script>

</html>