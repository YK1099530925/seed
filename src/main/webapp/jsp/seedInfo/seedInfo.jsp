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
<%-- <link rel="stylesheet" href="${appPath }/css/bootstrap-maizi.css" /> --%>
<script src="${appPath }/js/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<title>种子信息查询</title>
</head>
<body>
	<jsp:include page="../home/companyHead.jsp"></jsp:include>
	<div>
		
	</div>
</body>
</html>