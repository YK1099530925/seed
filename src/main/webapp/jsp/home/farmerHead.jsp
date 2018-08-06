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
<script src="${appPath }/js/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<title>农户首页</title>
</head>
<body>
	<!--导航-->
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<!--小屏幕导航按钮和logo-->
		<div class="navbar-header">
			<button class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a href="${appPath }/jsp/home/farmerHome.jsp" class="navbar-brand">农作物种子溯源系统</a>
		</div>
		<!--小屏幕导航按钮和logo-->
		<!--导航-->
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="${appPath }/jsp/home/farmerHome.jsp">首页</a></li>
				<li><a href="${appPath }/jsp/infoCollection/landInfoCollection.jsp">信息采集</a></li>
				<li><a href="${appPath }/jsp/infoManageFarmer/landInfoManegeFarmer.jsp">信息管理与维护</a></li>
				<li><a href="${appPath }/jsp/myCenter/farmerCenter.jsp">农户中心(${sessionScope.farmer.farmersName })</a></li>
				<%-- <li><a href="${appPath }/jsp/sellOut/sellOut.jsp">农作物卖出</a></li> --%>
				<li><a href="${appPath }/jsp/contactUs/contactUs.jsp">联系我们</a></li>
				<li><a href="${appPath }/index.jsp" id="exitSeed">退出系统</a></li>
			</ul>
		</div>
		<!--导航-->
	</div>
	</nav>
	<!--导航-->
</body>
<script type="text/javascript">

$("#exitSeed").click(function(){
	$.ajax({
		url:"${appPath }/exitSeed",
		type:"get",
		success:function(e){
			if(e){
				alert("恭喜您，成功退出...");
			}else{
				alert("您还未登录，请您请登录...");
			}
		}
	});
	
});

</script>
</html>