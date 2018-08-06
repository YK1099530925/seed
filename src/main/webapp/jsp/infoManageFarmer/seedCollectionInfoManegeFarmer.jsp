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
	<jsp:include page="../home/farmerHead.jsp"></jsp:include>
	<div class="container" style="margin-top: 75px;">
	    <div class="row">
	        <div class="col-md-2">
	            <div class="list-group">
	                <a href="landInfoManegeFarmer.jsp" class="list-group-item">土地信息管理</a>
	                <a href="seedInfoManegeFarmer.jsp" class="list-group-item">种子信息管理</a>
	                <a href="seedCollectionInfoManegeFarmer.jsp" class="list-group-item active">种子生长采集管理</a>
	            </div>
	        </div>
	        <div class="col-md-10">
	            <div class="page-header">
	                <h1>种子生长采集管理</h1>
	            </div>
	            <ul class="nav nav-tabs">
	                <li>
	                    <a href="landInfoManegeFarmer.jsp">土地信息管理</a>
	                </li>
	                <li>
	                    <a href="seedInfoManegeFarmer.jsp">种子信息管理</a>
	                </li>
	                <li class="active">
	                    <a href="seedCollectionInfoManegeFarmer.jsp">种子生长采集管理</a>
	                </li>
	            </ul>
	            <div>
	            	<br>
	            	<div class="row col-md-12">
	            		<div class="col-md-3">
	            			<label for="seedName">种子名称</label>
	            			<select class="form-control" id="seedName" name="seedName">
							</select>
	            		</div>
	            		<div class="col-md-6">
	            			<label for="seedCode">种子代码</label>
	            			<select class="form-control" id="seedCode" name="seedCode">
							</select>
	            		</div>
	            		<div class="col-md-3">
	            			<label for="farmersId">农户编号</label>
	            			<input type="text" id="farmersId" name="farmersId" class="form-control">
	            		</div>
	            	</div>
	            	
	            	<div class="row col-md-12">
	            		<div class="col-md-12">
							<table id="seedGrowInfoForm" class="table">
								<thead>
									<tr>
										<th>顺序</th>
										<th>处理类型</th>
										<th>所用物品</th>
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
	//1 获取农户所有种子信息
	showSeedInfo();
});

function showSeedInfo(){
	$("#seedName").empty();
	$.ajax({
		url:"${appPath }/getSeedInfoByFarmerId",
		type:"get",
		success:function(e){
			$("#farmersId")[0].value = "${sessionScope.farmer.farmersId }";
			$.each(e,function(){
				var seedName = $("<option></option>").append(this.seedName).attr("value",this.seedName);
				seedName.appendTo("#seedName");
				var seedCode = $("<option></option>").append(this.seedCode).attr("value",this.seedCode);
				seedCode.appendTo("#seedCode");
			});
			//2 根据种子信息获取种子生长过程信息
			showSeedGrowInfo($("#seedName")[0].value);
		},
		error:function(e){
			alert("种子信息获取失败");
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

function showSeedGrowInfo(seedName){
 	$.ajax({
		url:"${appPath }/getseedGrowInfoByFarmerIdAndSeedName/" + seedName,
		type:"get",
		success:function(e){
			$("#seedGrowInfoForm tbody").empty();
			if(e == ""){
				$("<tr><td>无</td></tr>").appendTo("#seedGrowInfoForm tbody");
			}
			var count = 0;
 			$.each(e,function(index,item){
				count++;
				var order = $("<td></td>").append(count);
				var eventType = $("<td></td>").append(item.eventType);
				var eventInfo = $("<td></td>").append(item.eventInfo);
				var eventTime = $("<td></td>").append(dateFormat(item.eventTime));
				var remarks = $("<td></td>").append(item.remarks);
						
				$("<tr></tr>")
					.append(order)
					.append(eventType)
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