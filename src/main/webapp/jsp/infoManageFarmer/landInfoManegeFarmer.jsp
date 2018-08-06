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

<title>信息管理</title>
</head>
<body>
	<jsp:include page="../home/farmerHead.jsp"></jsp:include>
	<div class="container" style="margin-top: 75px;">
	    <div class="row">
	        <div class="col-md-2">
	            <div class="list-group">
	                <a href="landInfoManegeFarmer.jsp" class="list-group-item active">土地信息管理</a>
	                <a href="seedInfoManegeFarmer.jsp" class="list-group-item">种子信息管理</a>
	                <a href="seedCollectionInfoManegeFarmer.jsp" class="list-group-item">种子生长采集管理</a>
	            </div>
	        </div>
	        <div class="col-md-10">
	            <div class="page-header">
	                <h1>土地信息管理</h1>
	            </div>
	            <ul class="nav nav-tabs">
	                <li class="active">
	                    <a href="landInfoManegeFarmer.jsp">土地信息管理</a>
	                </li>
	                <li>
	                    <a href="seedInfoManegeFarmer.jsp">种子信息管理</a>
	                </li>
	                <li>
	                    <a href="seedCollectionInfoManegeFarmer.jsp">种子生长采集管理</a>
	                </li>
	            </ul>
	            <table id="landInfoForm" class="table">
	                <thead>
	                    <tr>
	                        <th>ID1</th>
	                        <th>土地编号</th>
	                        <th>土地地址</th>
	                        <th>农户编号</th>
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
		url:"${appPath }/getLandInfoByFarmerId/" + pageNum,
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
		//var checkBox = $("<td><input type='checkbox' class='check_item_user' /></td>");
		var ID = $("<td></td>").append(item.id);
		var landId = $("<td></td>").append(item.landId);
		var landAddress = $("<td></td>").append(item.landAddress);
		var farmerId = $("<td></td>").append(item.farmerId);
				
		$("<tr></tr>")
			.append(ID)
			.append(landId)
			.append(landAddress)
			.append(farmerId)
			.prependTo("#landInfoForm tbody");
	});
}

</script>

</html>