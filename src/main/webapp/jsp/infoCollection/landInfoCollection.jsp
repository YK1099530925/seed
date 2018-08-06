<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1 , user-scalable=no">
<%
	pageContext.setAttribute("appPath", request.getContextPath());
%>
<link rel="stylesheet" href="${appPath }/css/bootstrap-maizi1.css" />
<title>种子信息查询</title>
</head>
<body>
	<jsp:include page="../home/farmerHead.jsp"></jsp:include>
	<div class="container"  style="margin-top: 75px;">
		<div class="row">
			<div class="col-md-2">
				<div class="list-group">
					<a href="landInfoCollection.jsp" class="list-group-item active">添加土地信息</a> 
					<a href="seedInRoomCollection.jsp" class="list-group-item">种子入库</a> 
					<a href="seeding.jsp" class="list-group-item">播种</a>
					<a href="seedGrow.jsp" class="list-group-item">种子生长过程</a>
					<a href="harvest.jsp" class="list-group-item">农作物收获</a>
				</div>
			</div>
			<div class="col-md-10">
				<div class="page-header">
					<h1>添加土地信息</h1>
				</div>
				<ul class="nav nav-tabs">
					<li class="active"><a href="landInfoCollection.jsp">添加土地信息</a></li>
					<li><a href="seedInRoomCollection.jsp">种子入库</a></li>
					<li><a href="seeding.jsp">播种</a></li>
					<li><a href="seedGrow.jsp">种子生长过程</a></li>
					<li><a href="harvest.jsp">农作物收获</a></li>
				</ul>
				<form action="#" id="landInfoAllForm" class="uesr_search col-md-6">
					<div class="alert alert-info" role="alert">
						<strong>提示：</strong> 一键添加，其他信息由系统自动填入
					</div>
					<div class="form-group">
						<label for="landAllMember">土地总量（输入示例：54）</label> 
						<div>
							<input type="text" id="landAllMember" name="landAllMember" class="form-control" placeholder="">
						</div>       
					</div>
					<div class="form-group">
						<label for="landAddress">土地地址（例：**省**市**区**镇**村）</label> 
						<div>
							<input type="text" id="landAddress" name="landAddress" class="form-control" placeholder="">
						</div>
					</div>
					<center><button type="button" id="landInfoAllSubmit" class="btn btn-default">一键添加</button></center>
				</form>
				<form action="#" id="landInfoForm" class="uesr_search col-md-6">
					<div class="alert alert-info" role="alert">
						<strong>提示：</strong> 手动输入
					</div>
					<div class="form-group">
						<label for="landId">土地编号（输入示例：1）</label> 
						<div>
							<input type="texte" id="landId" name="landId" class="form-control" placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="landAddress1">土地地址（例：**省**市**区**镇**村）</label> 
						<div>
							<input type="text" id="landAddress1" name="landAddress" class="form-control" placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="farmerId">农户编号</label> 
						<div>
							<input type="text" id="farmerId" name="farmerId" class="form-control" placeholder="" value="${sessionScope.farmer.farmersId }" disabled="disabled">
						</div>
					</div>
					<center><button type="button" id="landInfoSubmit" class="btn btn-default">提交</button></center>
				</form>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">

$("#landInfoAllSubmit").click(function(){

	if($("#landAllMember")[0].value.trim == ""){
		alert("土地总量不能为空");
		return;
	}

	if($("#landAddress")[0].value.trim == ""){
		alert("土地地址不能为空");
		return;
	}
	
	$.ajax({
		url:"${appPath }/landInfoAll",
		type:"post",
		data:$("#landInfoAllForm").serialize(),
		success:function(e){
			alert("添加成功");
		},
		error:function(){
			alert("添加失败");
		}
	});
});

$("#landInfoSubmit").click(function(){

	if($("#landId")[0].value.trim == ""){
		alert("土地编号不能为空");
		return;
	}

	if($("#landAddress1")[0].value.trim == ""){
		alert("土地地址不能为空");
		return;
	}

	$("#farmerId").removeAttr("disabled");
	
	$.ajax({
		url:"${appPath }/landInfo",
		type:"post",
		data:$("#landInfoForm").serialize(),
		success:function(e){
			$("#farmerId").attr("disabled","disabled");
			alert("添加成功");
		},
		error:function(e){
			alert("添加失败");
		}
	});
});

</script>
</html>