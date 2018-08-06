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
<title>公司首页</title>
</head>
<body>
	<jsp:include page="companyHead.jsp"></jsp:include>
	<!--home-->
	<section id="home">
	<div class="lvjing">
		<div class="container">
			<div class="row">
				<div class="col-md-1"></div>
				<div class="col-md-10">
					<h1>种子溯源追溯-追踪种子播种到成长！</h1>
					<p>
						种子信息：可以获得种子的基本信息<br />
						追溯信息：可以查看种子成长过程信息
					</p>
					<img src="${appPath }/img/homeSeed.jpg" class="img-responsive" alt="php" />
				</div>
				<div class="col-md-1"></div>
			</div>
		</div>
	</div>
	</section>
	<!--home-->
</body>
</html>