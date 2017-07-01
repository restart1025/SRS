<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>guitar</title>
<script src="//cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<link
	href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	rel="stylesheet">
<link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.css">
<script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>
<script>
	$(function() {
		var rows = parent.$('#table').bootstrapTable('getSelections');
		$('#table').bootstrapTable({
			url : '${basePath}/queryEnrolledStudents',
			queryParams:function(params) {
				params.sectionNo = rows[0].sectionNo;
				return params;
			},
			pagination : true,
			onlyInfoPagination:true,//仅显示总数据数
// 			sidePagination : 'server',
			striped : true,
			showColumns : true,
			showRefresh : true,
			showToggle : true,
			showPaginationSwitch : true,
			idField : 'id',
			clickToSelect : true,
			singleSelect : true,
// 			pageNumber : 0,
// 			pageSize : 5,
// 			pageList : [ 5, 10, 15, 'ALL' ],
			dataField : 'rows',
			totalField : 'total',
			columns : [ 
	            {field:'ssn',title:'学号',width:100}, 
		        {field:'name',title:'姓名',width:100},
		        {field:'degree',title:'年级',width:100}, 
		        {field:'major',title:'专业',width:100} 
			]
		});
	})
</script>
</head>
<body>
	<div class="container-fluid">
		<table id="table"></table>
	</div>
</body>
</html>