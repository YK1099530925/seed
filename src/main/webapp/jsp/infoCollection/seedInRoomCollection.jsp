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
<title>土地信息</title>
</head>
<body>
	<jsp:include page="../home/farmerHead.jsp"></jsp:include>
	<div class="container" style="margin-top: 75px;">
		<div class="row">
			<div class="col-md-2">
				<div class="list-group">
					<a href="landInfoCollection.jsp" class="list-group-item">添加土地信息</a> <a
						href="seedInRoomCollection.jsp" class="list-group-item active">种子入库</a> 
						<a href="seeding.jsp" class="list-group-item">播种</a>
						<a href="seedGrow.jsp" class="list-group-item">种子生长过程</a>
						<a href="harvest.jsp" class="list-group-item">农作物收获</a>
				</div>
			</div>
			<div class="col-md-10">
				<div class="page-header">
					<h1>种子入库</h1>
				</div>
				<ul class="nav nav-tabs">
					<li><a href="landInfoCollection.jsp">添加土地信息</a></li>
					<li class="active"><a href="seedInRoomCollection.jsp">种子入库</a></li>
					<li><a href="seeding.jsp">播种</a></li>
					<li><a href="seedGrow.jsp">种子生长过程</a></li>
					<li><a href="harvest.jsp">农作物收获</a></li>
				</ul>
				<form action="#" id="seedCollectionForm" class="uesr_search col-md-10">
					<div class="alert alert-info" role="alert">
						<strong>提示：</strong> 手动添加，种子信息需要扫描枪扫描填入
					</div>
					<div class="form-group">
						<label for="seedName">种子名称</label> 
						<div>
							<input type="text" id="seedName" name="seedName" class="form-control" placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="seedCode">种子信息（扫描添加）</label> 
						<div>
							<input type="text" id="seedCode" name="seedCode" class="form-control" placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="farmerId">农户编号</label> 
						<div>
							<input type="text" id="farmerId" name="farmerId" class="form-control" placeholder="" value="${sessionScope.farmer.farmersId }" disabled="disabled">
						</div>
					</div>
					<center><button type="button" id="seedCollectionSubmit" class="btn btn-default">提交</button></center>
				</form>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">

$("#seedCollectionSubmit").click(function(){

	if($("#seedName")[0].value.trim() == ""){
		alert("种子名称不能为空");
		return;
	}

	if($("#seedCode")[0].value.trim() == ""){
		alert("种子信息不能为空");
		return;
	}

	$("#farmerId").removeAttr("disabled");
	
	$.ajax({
		url:"${appPath }/seedCollection",
		type:"post",
		data:$("#seedCollectionForm").serialize(),
		success:function(e){
			if(e){
				$("#farmerId").attr("disabled","disabled");
				alert("添加成功");
			}else{
				alert("添加失败");
			}
		},
		error:function(e){
			alert("无法添加");
		}
	});
});

</script>

</html>