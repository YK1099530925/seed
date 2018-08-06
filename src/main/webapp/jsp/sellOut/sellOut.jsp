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
<title>农作物卖出</title>
</head>
<body>
	<jsp:include page="../home/farmerHead.jsp"></jsp:include>
	<div class="container" style="margin-top: 75px;">
		<div class="row">
			<div class="col-md-10">
				<div class="page-header">
					<h1>农作物收获</h1>
				</div>
				<ul class="nav nav-tabs">
					<li class="active"><a href="sellOut.jsp">农作物卖出</a></li>
				</ul>
				<form action="#" id="seedingForm" class="uesr_search col-md-10">
					<div class="alert alert-info" role="alert">
						<strong>提示：</strong> 卖出给某公司
					</div>
					<div class="form-group">
						<label for="landId" class="col-sm-2 control-label">土地编号</label>
						<div class="">
							<select class="form-control" id="landId" name="landId">
							</select>
						</div>
					</div>
						<div class="form-group">
						<label for="seedName">农作物名称</label> 
						<div>
							<select class="form-control" id="seedName" name="seedName">
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="seedCode">农作物种子的信息</label> 
						<div>
							<select class="form-control" id="seedCode" name="seedCode">
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="eventInfo">过程</label> 
						<div>
							<input type="text" id="eventInfo" name="eventInfo" class="form-control" placeholder="" value="收获">
						</div>
					</div>
					<div class="form-group">
						<label for="farmersId">农户编号</label> 
						<div>
							<input type="text" id="farmersId" name="farmersId" class="form-control" placeholder="" value="${sessionScope.farmer.farmersId }">
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
	$.ajax({
		url:"${appPath }/seedGrow",
		type:"post",
		data:$("#seedingForm").serialize(),
		success:function(e){
			alert("记录成功");
		},
		error:function(e){
			alert("记录失败");
		}
	});
});

</script>

</html>