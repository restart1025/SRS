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
<title>选课系统</title>
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
						蒋宇森
					</span>
					<i class="fa fa-angle-down"></i>
				</a>
				<ul class="dropdown-menu">
					<li>
						<a href="extra_profile.html"><i class="fa fa-user"></i> 个人信息</a>
					</li>
					<li>
						<a href="inbox.html"><i class="fa fa-envelope"></i> 我的消息
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
					<a href="charts.html">
					<i class="fa fa-table"></i>
					<span class="title">
						教学计划
					</span>
					</a>
				</li>
				<li class="active">
					<a href="/professorManager">
					<i class="fa fa-user"></i>
					<span class="title">
						教师管理
					</span>
					</a>
				</li>
				<li class="last ">
					<a href="charts.html">
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
							<a href="/professorManager">教师管理</a>
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
				<button id="btn-add" type="button" data-toggle="modal" href="#responsive" class="btn btn-primary">添加</button>
				<button id="btn-remove" type="button" class="btn btn-primary" onclick="deleteProfessor()">删除</button>
				<button id="btn-edit" type="button" class="btn btn-primary" onclick="editProfessor()">修改</button>
			</div>
			<!-- responsive -->
			<div id="responsive" class="modal fade" tabindex="-1" data-width="760">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">添加教师</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<!-- BEGIN FORM-->
						<form id="professorForm" class="form-horizontal form-row-seperated">
							<div class="form-body">
								<div class="form-group">
									<label class="control-label col-md-3">姓名：</label>
									<div class="col-md-9">
										<input type="text" id="name" name="name" placeholder="请输入姓名" class="form-control"/>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-3">教师编号：</label>
									<div class="col-md-9">
										<input id="ssn" name="ssn" type="text" placeholder="请输入教师编号" class="form-control"/>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-3">职称：</label>
									<div class="col-md-9">
										<select id="title" class="form-control" name="title">
											<option value="教授">教授</option>   
										    <option>副教授</option>   
										    <option>讲师</option>   
										    <option>助教</option>
										</select>
									</div>
								</div>
								<div class="form-group last">
									<label class="control-label col-md-3">所属学院：</label>
									<div class="col-md-9">
										<select id="department" class="form-control" name="department">
										    <option value="管理学院">管理学院</option>
											<option>能源、材料与物理学部</option>   
										    <option>矿业工程学院</option>   
										    <option>安全工程学院</option>   
										    <option>力学与土木工程学院</option>
										    <option>机电工程学院</option>
										    <option>信息与控制工程学院</option>
										    <option>资源与地球科学学院</option>
										    <option>化工学院</option>
										    <option>环境与测绘学院</option>
										    <option>电气与动力工程学院</option>
										    <option>数学学院</option>
										    <option>计算机科学与技术学院</option>
										    <option>公共管理学院</option>
										    <option>马克思主义学院</option>
										    <option>外国语言文化学院</option>
						    				<option>建筑与设计学院</option>
						    				<option>体育学院</option>
						    				<option>孙越崎学院</option>
						    				<option>国际学院  </option>
										</select>
									</div>
								</div>
							</div>
						</form>
						<!-- END FORM-->
					</div>
				</div>
				<div class="modal-footer">
					<button id="cancelTeacher" type="button" data-dismiss="modal" class="btn btn-default">取消</button>
					<button id="addTeacher" type="button" class="btn blue">保存</button>
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

<script>
	jQuery(document).ready(function() {    
	   App.init(); // initlayout and core plugins
	   UIExtendedModals.init();
	});
	$(function(){
		$('#table').bootstrapTable({
			url:"${pageContext.request.contextPath}/queryProfessor",
			method:'post',
			idField:'ssn',
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
		    	{field:'ssn',title:'编号',width:100,align:'center'},  
		        {field:'name',title:'教师名称',width:100,align:'center'},    
		        {field:'title',title:'职称',width:100,align:'center'} ,
		        {field:'department',title:'学院',width:100,align:'center'}
			]
		});
		$('#addTeacher').bind("click", function(){
			var name=$("#name").val();
    		var ssn = $("#ssn").val();
    		var title=$("#title").val();
    		var department=$("#department").val();
    		if(name==""){
    			swal("系统提示", "姓名不可为空")
    		}else if(ssn==""){
    			swal("系统提示", "工号不可为空")
    		}else if(title==""){
    			swal("系统提示", "职称不可为空")
    		}else if(department==""){
    			swal("系统提示", "学院不可为空")
    		}else{
    			
                $("#professorForm").ajaxSubmit({
                	url: 'addProfessor', 
                    type: "post", 
                    dataType: "json",
                    success: function () {
                    	$('#cancelTeacher').click();
                    	swal("系统提示", "添加成功！")
                    	$('#table').bootstrapTable('refresh');
                    }
                   
                });
    		}
		});
	
	})
	function selectSection(sectionNo,name){
		var textValue="你确定选择"+name+"这门课程吗？"
		swal({
			  title: "系统提示",
			  text: textValue,
			  type: "info",
			  showCancelButton: true,
			  closeOnConfirm: false,
			  confirmButtonText: "确定",
			  cancelButtonText: "取消",
			  showLoaderOnConfirm: true,
			},
			function(){
				$.ajax({
				      url:'${pageContext.request.contextPath}/selectSection',
				      data:{'sectionNo':sectionNo}, 
				      method:'POST',
				      success:function(res){
				    	  $('#table').bootstrapTable('refresh');
				    	  swal(res);
				      }						    
				})
		});
	};
	function queryEnrolledStudents(sectionNo){
		var url = "${pageContext.request.contextPath}/queryEnrolledStudents";
		$('#showSectionStudent').bootstrapTable('refresh',{url: url, query: {sectionNo: sectionNo}});
		$( "#dialog" ).dialog( "open" );
	};
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>