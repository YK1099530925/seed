<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%
	pageContext.setAttribute("appPath", request.getContextPath());
%>
<script type="text/javascript" src="${appPath }/js/navInfo.js"></script>
<link rel="stylesheet" href="${appPath }/css/bootstrap-maizi1.css" />

<title>合作农户信息</title>
</head>
<body>
	<jsp:include page="../home/companyHead.jsp"></jsp:include>
	<div class="container" style="margin-top: 75px;">
	    <div class="row">
	        <div class="col-md-2">
	            <div class="list-group">
	                <a href="companyCooperationFarmer.jsp" class="list-group-item active">合作农户信息</a>
	                <a href="companyCooperationFarmerSeedInfo.jsp" class="list-group-item">种子采集信息</a>
	            </div>
	        </div>
	        <div class="col-md-10">
	            <div class="page-header">
	                <h1>合作农户信息</h1>
	            </div>
	            <ul class="nav nav-tabs">
	                <li class="active">
	                    <a href="companyCooperationFarmer.jsp">合作农户信息</a>
	                </li>
	                <li>
	                    <a href="companyCooperationFarmerSeedInfo.jsp">种子采集信息</a>
	                </li>
	            </ul>
	            <table id="landInfoForm" class="table">
	                <thead>
	                    <tr>
	                        <th>ID</th>
	                        <th>农户姓名</th>
	                        <th>农户编号</th>
	                        <th>农户地址</th>
	                        <th>农户电话</th>
	                    </tr>
	                </thead>
	                <tbody>
	     
	                </tbody>
	            </table>
	            <div class="row">
					<div id="landInfo_page_Info" class="col-md-5 col-md-offset-4"></div>
					<div id="landInfo_page_nav" class="col-md-6 col-md-offset-4">
					</div>
				</div>
	        </div>
	    </div>
	</div>
</body>

<script type="text/javascript">

$(function(){
	showInfo(1);
});

function showInfo(pageNum){
	$.ajax({
		url:"${appPath }/getFarmerInfo/" + pageNum,
		type:"get",
		success:function(e){
			addLandInfoList(e);
			addpageInfo(e, landInfo_page_Info);
			addPageNav(e, landInfo_page_nav);
		}
	});
}

function addLandInfoList(e){
	$("#landInfoForm tbody").empty();
	var landInfo = e.info.list.reverse();
	$.each(landInfo,function(index,item){
 		var ID = $("<td></td>").append(item.id);
		var farmersName = $("<td></td>").append(item.farmersName);
		var farmersId = $("<td></td>").append(item.farmersId);
		var farmersAddress = $("<td></td>").append(item.farmersAddress);
		var farmersTelephone = $("<td></td>").append(item.farmersTelephone);	
		$("<tr></tr>")
			.append(ID)
			.append(farmersName)
			.append(farmersId)
			.append(farmersAddress)
			.append(farmersTelephone)
			.prependTo("#landInfoForm tbody");
	}); 
}

</script>

</html>