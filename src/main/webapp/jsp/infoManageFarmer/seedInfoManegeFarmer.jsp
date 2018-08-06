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
	                <a href="seedInfoManegeFarmer.jsp" class="list-group-item active">种子信息管理</a>
	                <a href="seedCollectionInfoManegeFarmer.jsp" class="list-group-item">种子生长采集管理</a>
	            </div>
	        </div>
	        <div class="col-md-10">
	            <div class="page-header">
	                <h1>种子信息管理</h1>
	            </div>
	            <ul class="nav nav-tabs">
	                <li>
	                    <a href="landInfoManegeFarmer.jsp">土地信息管理</a>
	                </li>
	                <li class="active">
	                    <a href="seedInfoManegeFarmer.jsp">种子信息管理</a>
	                </li>
	                <li>
	                    <a href="seedCollectionInfoManegeFarmer.jsp">种子生长采集管理</a>
	                </li>
	            </ul>
	            <table id="seedInfoForm" class="table">
	                <thead>
	                    <tr>
	                        <th>ID</th>
	                        <th>种子名称</th>
	                        <th>种子代码</th>
	                        <th>入库时间</th>
	                        <th>农户编号</th>
	                    </tr>
	                </thead>
	                <tbody>
	     
	                </tbody>
	            </table>
	            <div class="row">
					<div id="seedInfo_page_Info" class="col-md-5 col-md-offset-4"></div>
					<div id="seedInfo_page_nav" class="col-md-6 col-md-offset-4">
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
		url:"${appPath }/getSeedInfoByFarmerId/" + pageNum,
		type:"get",
		success:function(e){
			addSeedInfoList(e);
			addpageInfo(e, seedInfo_page_Info);
			addPageNav(e, seedInfo_page_nav);
		}
	});
}

function addSeedInfoList(e){
	$("#seedInfoForm tbody").empty();
	var seedInfo = e.info.list.reverse();
	$.each(seedInfo,function(index,item){
		var b=0;
		 var ID = $("<td></td>").append(item.id);
		var seedName = $("<td></td>").append(item.seedName);
		var seedCode = $("<td></td>").append(item.seedCode);
		var storageTime = $("<td></td>").append(dateFormat(item.storageTime));
		var farmerId = $("<td></td>").append(item.farmerId);
				
		$("<tr></tr>")
			.append(ID)
			.append(seedName)
			.append(seedCode)
			.append(storageTime)
			.append(farmerId)
			.prependTo("#seedInfoForm tbody");
	});
}

</script>

</html>