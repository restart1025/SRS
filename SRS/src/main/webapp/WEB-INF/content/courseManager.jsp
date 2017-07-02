<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>课程管理</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta content="" name="description"/>
<meta content="" name="author"/>
<meta name="MobileOptimized" content="320">
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="${pageContext.request.contextPath}/assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/plugins/select2/select2_metro.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/data-tables/DT_bootstrap.css"/>
<link href="${pageContext.request.contextPath}/assets/plugins/bootstrap-modal/css/bootstrap-modal-bs3patch.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/plugins/bootstrap-modal/css/bootstrap-modal.css" rel="stylesheet" type="text/css"/>
<!-- END PAGE LEVEL STYLES -->
<!-- BEGIN THEME STYLES -->
<link href="${pageContext.request.contextPath}/assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/css/style.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
<link href="${pageContext.request.contextPath}/assets/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->

<!-- sweetalert弹出框的css样式 -->
<link href="https://cdn.bootcss.com/sweetalert/1.1.3/sweetalert.min.css" rel="stylesheet">

<link href="https://cdn.bootcss.com/jqueryui/1.12.1/jquery-ui.min.css" rel="stylesheet">

<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
<!-- BEGIN HEADER -->
<div class="header navbar navbar-inverse navbar-fixed-top">
	<!-- BEGIN TOP NAVIGATION BAR -->
	<div class="header-inner">
		<!-- BEGIN LOGO -->
		<a class="navbar-brand" href="/index">
		<img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="logo" class="img-responsive"/>
		</a>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
		<img src="${pageContext.request.contextPath}/assets/img/menu-toggler.png" alt=""/>
		</a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN TOP NAVIGATION MENU -->
		<ul class="nav navbar-nav pull-right">
		<!-- BEGIN USER LOGIN DROPDOWN -->
			<li class="dropdown user">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
					<img alt="" src="${pageContext.request.contextPath}/assets/img/avatar1_small.jpg"/>
					<span class="username">
						${ sessionScope.student.name }
					</span>
					<i class="fa fa-angle-down"></i>
				</a>
				<ul class="dropdown-menu">
					<li>
						<a href="#"><i class="fa fa-user"></i> 个人信息</a>
					</li>
					<li>
						<a href="#"><i class="fa fa-envelope"></i> 我的消息
						<span class="badge badge-danger">
							3
						</span>
						</a>
					</li>
					<li>
						<a href="#"><i class="fa fa-tasks"></i> 我的任务
						<span class="badge badge-success">
							7
						</span>
						</a>
					</li>
					<li class="divider">
					</li>
					<li>
						<a href="login"><i class="fa fa-key"></i> 安全退出</a>
					</li>
				</ul>
			</li>
			<!-- END USER LOGIN DROPDOWN -->
		</ul>
		<!-- END TOP NAVIGATION MENU -->
	</div>
	<!-- END TOP NAVIGATION BAR -->
</div>
<!-- END HEADER -->
<div class="clearfix">
</div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
	<!-- BEGIN SIDEBAR -->
	<div class="page-sidebar-wrapper">
		<div class="page-sidebar navbar-collapse collapse">
			<!-- BEGIN SIDEBAR MENU -->
			<ul class="page-sidebar-menu">
				<li class="sidebar-toggler-wrapper">
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
					<div class="sidebar-toggler hidden-phone">
					</div>
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
				</li>
				<li class="start">
					<a href="/index">
					<i class="fa fa-home"></i>
					<span class="title">
						学生选课
					</span>
					<span class="selected">
					</span>
					</a>
				</li>
				<li class="">
					<a href="/transcript">
					<i class="fa fa-bar-chart-o"></i>
					<span class="title">
						成绩查询
					</span>
					</a>
				</li>
				<li class="">
					<a href="/planOfStudy">
					<i class="fa fa-table"></i>
					<span class="title">
						教学计划
					</span>
					</a>
				</li>
				<li class="">
					<a href="/professorManager">
					<i class="fa fa-user"></i>
					<span class="title">
						教师管理
					</span>
					</a>
				</li>
				<li class="last active">
					<a href="/courseManager">
					<i class="fa fa-file-text"></i>
					<span class="title">
						课程管理
					</span>
					</a>
				</li>
			</ul>
			<!-- END SIDEBAR MENU -->
		</div>
	</div>
	<!-- END SIDEBAR -->
	<!-- BEGIN CONTENT -->
	<div class="page-content-wrapper">
		<div class="page-content">
		
			<!-- BEGIN PAGE HEADER-->
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN PAGE TITLE & BREADCRUMB-->
					<h3 class="page-title">
					 管理学院电子商务专业选课系统
					</h3>
					<ul class="page-breadcrumb breadcrumb">
						<li>
							<i class="fa fa-home"></i>
							<a href="/index">主页</a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li>
							<a href="/courseManager">课程管理</a>
						</li>
						<li class="pull-right">
							<div id="dashboard-report-range" class="dashboard-date-range tooltips" data-placement="top" data-original-title="Change dashboard date range">
								<i class="fa fa-calendar"></i>
								<span>
								</span>
								<i class="fa fa-angle-down"></i>
							</div>
						</li>
					</ul>
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			<!-- BEGIN DASHBOARD STATS -->
			<div class="row">
				<div class="col-md-12">
					<table id="table"></table>
				</div>
			</div>
			<!-- END DASHBOARD STATS -->
			<div class="clearfix">
			</div>
			<div id="btn">
				<a id="btn-add" type="button" data-toggle="modal" href="#responsive" class="btn btn-primary">添加</a>
				<button id="btn-remove" type="button" class="btn btn-primary" onclick="deleteCourse()">删除</button>
			</div>
			<!-- responsive -->
			<div id="responsive" class="modal fade" tabindex="-1" data-width="760">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">添加课程</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<!-- BEGIN FORM-->
						<form id="courseForm" class="form-horizontal form-row-seperated">
							<div class="form-body">
								<div class="form-group">
									<label class="control-label col-md-3">课程编号：</label>
									<div class="col-md-9">
										<input type="text" id="number" name="number" placeholder="请输入课程编号" class="form-control"/>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-3">课程名称：</label>
									<div class="col-md-9">
										<input id="name" name="name" type="text" placeholder="请输入课程名称" class="form-control"/>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-3">学分：</label>
									<div class="col-md-9">
										<input id="credits" name="credits" type="text" placeholder="请输入学分" class="form-control"/>
									</div>
								</div>
							</div>
						</form>
						<!-- END FORM-->
					</div>
				</div>
				<div class="modal-footer">
					<button id="cancelCourse" type="button" data-dismiss="modal" class="btn btn-default">取消</button>
					<button id="addCourse" type="button" class="btn blue">保存</button>
				</div>
			</div>
		</div>
	</div>
	<!-- END CONTENT -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<div class="footer">
	<div class="footer-inner">
		 2017 &copy; 管理学院电子商务专业选课系统.
	</div>
	<div class="footer-tools">
		<span class="go-top">
			<i class="fa fa-angle-up"></i>
		</span>
	</div>
</div>
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="${pageContext.request.contextPath}/assets/plugins/respond.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/excanvas.min.js"></script> 
<![endif]-->
<script src="${pageContext.request.contextPath}/assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/select2/select2.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-modal/js/bootstrap-modalmanager.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-modal/js/bootstrap-modal.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="${pageContext.request.contextPath}/assets/scripts/app.js"></script>
<script src="${pageContext.request.contextPath}/assets/scripts/ui-extended-modals.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>

<!-- Latest compiled and minified Locales -->
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>

<!-- sweetalert弹出框的js样式 -->
<script src="https://cdn.bootcss.com/sweetalert/1.1.3/sweetalert.min.js"></script>

<script src="https://cdn.bootcss.com/jquery.form/4.2.1/jquery.form.min.js"></script>

<script>
	jQuery(document).ready(function() {    
	   App.init(); // initlayout and core plugins
	   UIExtendedModals.init();
	});
	$(function(){
		$('#table').bootstrapTable({
			url:"${pageContext.request.contextPath}/queryCourse",
			method:'post',
            toolbar:'#btn',
			striped:true,		//隔行变色
			singleSelect:true,	//禁止多选
			clickToSelect:true,	//点击行时，自动选择
			showToggle : true,	//切换试图的图标
// 			undefinedText:"无",	//数据为undefined时显示的字符
			showRefresh:true,	//刷新按钮
			pagination:true,	//显示分页条
			onlyInfoPagination:true,//仅显示总数据数
// 			sidePagination:'server',//在哪里进行分页
// 			showPaginationSwitch:true,//数据条数选择框
// 			pageNumber:1,			//首页页码
// 			pageSize:10,			//页面数据条数
// 			pageList:[10, 25, 50, 100, 'All'],
			dataField : 'rows',
			totalField : 'total',
			columns: [
		    	{checkbox: true},
		        {field:'number',title:'课程编号',width:100,align:'center'},
		        {field:'name',title:'课程名称',width:100,align:'center'},
		        {field:'credits',title:'学分',width:100,align:'center'}
			]
		});
		$('#addCourse').bind("click", function(){
			var name=$("#name").val();
    		var number = $("#number").val();
    		var credits=$("#credits").val();
    		if(name==""){
    			swal("系统提示", "名称不可为空")
    		}else if(number==""){
    			swal("系统提示", "编号不可为空")
    		}else if(credits==""){
    			swal("系统提示", "学分不可为空")
    		}else{
                $("#courseForm").ajaxSubmit({
                	url: '${pageContext.request.contextPath}/addCourse', 
                    type: "post", 
                    dataType: "json",
                    success: function () {
                    	$('#cancelCourse').click();
                    	swal("系统提示", "添加成功！")
                    	$('#table').bootstrapTable('refresh');
                    	document.getElementById("courseForm").reset(); 
                    }
                   
                });
    		}
		});
	
	});
	function deleteCourse()
	{
		var row = $('#table').bootstrapTable('getSelections');
		if( row.length == 1 )
		{
			swal({
				  title: "系统提示",
				  text: "你确定要删除课程吗？",
				  type: "info",
				  showCancelButton: true,
				  closeOnConfirm: false,
				  confirmButtonText: "确定",
				  cancelButtonText: "取消",
				  showLoaderOnConfirm: true,
				},
				function()
				{
					$.ajax({
					      url:'${pageContext.request.contextPath}/deleteCourse',
					      data:{'number':row[0].number},
					      method:'POST',
					      success:function(){
					    	  $('#table').bootstrapTable('refresh');
					    	  swal('提示信息','删除成功');
					      }						    
					})
			});
		}
		else
		{
			swal('请选择一行数据！');
		}
	};
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>