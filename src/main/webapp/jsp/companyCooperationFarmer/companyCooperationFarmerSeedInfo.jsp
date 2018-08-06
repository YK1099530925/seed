<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%
	pageContext.setAttribute("appPath", request.getContextPath());
%>
<script type="text/javascript" src="${appPath }/js/dateFormat.js"></script>
<link rel="stylesheet" href="${appPath }/css/bootstrap-maizi1.css" />
<title>信息管理</title>
</head>
<body>
	<jsp:include page="../home/companyHead.jsp"></jsp:include>
	<div class="container" style="margin-top: 75px;">
	    <div class="row">
	        <div class="col-md-2">
	            <div class="list-group">
	                <a href="companyCooperationFarmer.jsp" class="list-group-item">合作农户信息</a>
	                <a href="companyCooperationFarmerSeedInfo.jsp" class="list-group-item active">种子采集信息</a>
	            </div>
	        </div>
	        <div class="col-md-10">
	            <div class="page-header">
	                <h1>种子生长采集管理</h1>
	            </div>
	            <ul class="nav nav-tabs">
	                <li>
	                    <a href="companyCooperationFarmer.jsp">合作农户信息</a>
	                </li>
	                <li class="active">
	                    <a href="companyCooperationFarmerSeedInfo.jsp">种子采集信息</a>
	                </li>
	            </ul>
	            <div>
	            	<br>
	            	<div class="row col-md-12">
	            		<div class="col-md-3">
	            			<label for="farmersName">农户名称</label>
	            			<select class="form-control" id="farmersName" name="farmersName">
							</select>
	            		</div>
	            		<div class="col-md-3">
	            			<label for="seedName">种子名称</label>
	            			<select class="form-control" id="seedName" name="seedName">
							</select>
	            		</div>
	            		<div class="col-md-3">
	            			<label for="seedCode">种子代码</label>
	            			<select class="form-control" id="seedCode" name="seedCode">
							</select>
	            		</div>
	            	</div>
	            	
	            	<div class="row col-md-12">
	            		<div class="col-md-12">
							<table id="seedGrowInfoForm" class="table">
								<thead>
									<tr>
										<th>顺序</th>
										<th>种子经历的过程</th>
										<th>处理的时间</th>
										<th>备注</th>
									</tr>
								</thead>
								<tbody>
								</tbody>
							</table>
						</div>
	            	</div>
	            </div>
	           
	        </div>
	    </div>
	</div>
</body>

<script type="text/javascript">

$(function(){
	showInfo();
});

function showInfo(){
	$("#farmersName").empty();
	$.ajax({
		url:"${appPath }/getFarmerInfoList",
		type:"get",
		success:function(e){
			$.each(e,function(){
				var farmersName = $("<option></option>").append(this.farmersName).attr("value",this.farmersId);
				farmersName.appendTo("#farmersName");
			});
			//根据农户信息获取种子信息
			showSeedInfo($("#farmersName")[0].value);
		},
		error:function(e){
			alert("合作用户信息获取失败");
		}
	});
}

$("#seedName").change(function(){
	$("#seedCode")[0].selectedIndex = this.selectedIndex;
	showSeedGrowInfo(this.value);
});


$("#seedCode").change(function(){
	$("#seedName")[0].selectedIndex = this.selectedIndex;
	var seedName = $("#seedName")[0].value;
	showSeedGrowInfo(seedName);
});

$("#farmersName").change(function(){
	var farmersId = $("#farmersName")[0].value;
	showSeedInfo(farmersId);
});

function showSeedInfo(farmersId){
	$("#seedName").empty();
	$("#seedCode").empty();
 	$.ajax({
		url:"${appPath }/getseedInfoByFarmersId/" + farmersId,
		type:"get",
		success:function(e){
 			$.each(e,function(index,item){
 				var seedName = $("<option></option>").append(this.seedName).attr("value",this.seedName);
 				seedName.appendTo("#seedName");
 				var seedCode = $("<option></option>").append(this.seedCode).attr("value",this.seedCode);
 				seedCode.appendTo("#seedCode");
			});
			//查询当前显示的种子生长信息
 			showSeedGrowInfo($("#seedName")[0].value);
		},
		error:function(e){
			alert("种子信息查询失败");
		}
	}); 
}

function showSeedGrowInfo(seedName){
	var farmerId = $("#farmersName")[0].value;
 	$.ajax({
		url:"${appPath }/getseedGrowInfoByFarmerIdAndSeedName/" + farmerId + "/" + seedName,
		type:"get",
		success:function(e){
			$("#seedGrowInfoForm tbody").empty();
			var count = 0;
 			$.each(e,function(index,item){
				count++;
				var order = $("<td></td>").append(count);
				var eventInfo = $("<td></td>").append(item.eventInfo);
				var eventTime = $("<td></td>").append(dateFormat(item.eventTime));
				var remarks = $("<td></td>").append(item.remarks);
						
				$("<tr></tr>")
					.append(order)
					.append(eventInfo)
					.append(eventTime)
					.append(remarks)
					.appendTo("#seedGrowInfoForm tbody");
			});
		},
		error:function(e){
			alert("种子生长信息查询失败");
		}
	}); 
}

</script>

</html>