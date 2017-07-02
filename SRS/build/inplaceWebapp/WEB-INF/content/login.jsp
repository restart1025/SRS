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
		<title>登录</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
		<meta content="alumni,record" name="description"/>
		<meta content="restart1025" name="author"/>
		<meta name="MobileOptimized" content="320">
		<!-- BEGIN GLOBAL MANDATORY STYLES -->
		<link href="${pageContext.request.contextPath}/assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
		<link href="${pageContext.request.contextPath}/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<link href="${pageContext.request.contextPath}/assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
		<!-- END GLOBAL MANDATORY STYLES -->
		<!-- BEGIN PAGE LEVEL STYLES -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/plugins/select2/select2_metro.css"/>
		<!-- END PAGE LEVEL SCRIPTS -->
		<!-- BEGIN THEME STYLES -->
		<link href="${pageContext.request.contextPath}/assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
		<link href="${pageContext.request.contextPath}/assets/css/style.css" rel="stylesheet" type="text/css"/>
		<link href="${pageContext.request.contextPath}/assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
		<link href="${pageContext.request.contextPath}/assets/css/plugins.css" rel="stylesheet" type="text/css"/>
		<link href="${pageContext.request.contextPath}/assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
		<link href="${pageContext.request.contextPath}/assets/css/pages/login-soft.css" rel="stylesheet" type="text/css"/>
		<link href="${pageContext.request.contextPath}/assets/css/custom.css" rel="stylesheet" type="text/css"/>
		<!-- END THEME STYLES -->
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico"/>
	</head>
	<!-- END HEAD -->
	<!-- BEGIN BODY -->
	<body class="login">
	
		<!-- BEGIN LOGO -->
		<div class="logo">
			<img src="${pageContext.request.contextPath}/assets/img/logo-big.png" alt=""/>
		</div>
		<!-- END LOGO -->
		
		<!-- BEGIN LOGIN -->
		<div class="content">
			<!-- BEGIN LOGIN FORM -->
			<form class="login-form" action="loginForm" method="post">
				<h3 class="form-title">输入账号登录</h3>
				<div class="alert alert-danger display-hide">
					<button class="close" data-close="alert"></button>
					<span>
						 请输入账号密码
					</span>
				</div>
				<div class="form-group">
					<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
					<label class="control-label visible-ie8 visible-ie9">账号</label>
					<div class="input-icon">
						<i class="fa fa-user"></i>
						<input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="账号" name="ssn"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label visible-ie8 visible-ie9">密码</label>
					<div class="input-icon">
						<i class="fa fa-lock"></i>
						<input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="密码" name="password"/>
					</div>
				</div>
				<div class="form-actions">
					<label class="checkbox">
					<input type="checkbox" name="remember" value="1"/> 记住密码 </label>
					<button type="submit" class="btn blue pull-right">
					登录 <i class="m-icon-swapright m-icon-white"></i>
					</button>
				</div>
				<div class="forget-password">
					<h4>忘记密码 ?</h4>
					<p>
						 不用担心, 点击 <a href="javascript:;" id="forget-password">这里</a>
						找回密码.
					</p>
				</div>
			</form>
			<!-- END LOGIN FORM -->
			
			<!-- BEGIN FORGOT PASSWORD FORM -->
			<form class="forget-form" action="index.html" method="post">
				<h3>忘记密码 ?</h3>
				<p>
					 请输入你的邮箱来找回密码.
				</p>
				<div class="form-group">
					<div class="input-icon">
						<i class="fa fa-envelope"></i>
						<input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="Email" name="email"/>
					</div>
				</div>
				<div class="form-actions">
					<button type="button" id="back-btn" class="btn">
					<i class="m-icon-swapleft"></i> 返回 </button>
					<button type="submit" class="btn blue pull-right">
					提交 <i class="m-icon-swapright m-icon-white"></i>
					</button>
				</div>
			</form>
			<!-- END FORGOT PASSWORD FORM -->
		</div>
		<!-- END LOGIN -->
		
		<!-- BEGIN COPYRIGHT -->
		<div class="copyright">
			 2017 &copy; 管理学院电子商务专业选课系统.
		</div>
		<!-- END COPYRIGHT -->
		
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
		<script src="${pageContext.request.contextPath}/assets/plugins/jquery-validation/dist/jquery.validate.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/assets/plugins/backstretch/jquery.backstretch.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/select2/select2.min.js"></script>
		<!-- END PAGE LEVEL PLUGINS -->
		
		<!-- BEGIN PAGE LEVEL SCRIPTS -->
		<script src="${pageContext.request.contextPath}/assets/scripts/app.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/assets/scripts/login-soft.js" type="text/javascript"></script>
		<!-- END PAGE LEVEL SCRIPTS -->
		
		<script>
			jQuery(document).ready(function() {     
			  App.init();
			  Login.init();
			});
		</script>
		<!-- END JAVASCRIPTS -->
	</body>
	<!-- END BODY -->
</html>