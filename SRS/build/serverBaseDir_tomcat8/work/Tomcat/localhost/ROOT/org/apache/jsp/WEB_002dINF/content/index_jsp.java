/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-01 12:01:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8 no-js\"> <![endif]-->\r\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9 no-js\"> <![endif]-->\r\n");
      out.write("<!--[if !IE]><!-->\r\n");
      out.write("<html lang=\"en\" class=\"no-js\">\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("<!-- BEGIN HEAD -->\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\"/>\r\n");
      out.write("<title>选课系统</title>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\"/>\r\n");
      out.write("<meta content=\"\" name=\"description\"/>\r\n");
      out.write("<meta content=\"\" name=\"author\"/>\r\n");
      out.write("<meta name=\"MobileOptimized\" content=\"320\">\r\n");
      out.write("<!-- BEGIN GLOBAL MANDATORY STYLES -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/uniform/css/uniform.default.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<!-- END GLOBAL MANDATORY STYLES -->\r\n");
      out.write("<!-- BEGIN PAGE LEVEL STYLES -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/select2/select2_metro.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/data-tables/DT_bootstrap.css\"/>\r\n");
      out.write("<!-- END PAGE LEVEL STYLES -->\r\n");
      out.write("<!-- BEGIN THEME STYLES -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/style-metronic.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/plugins.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/themes/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\"/>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/custom.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<!-- END THEME STYLES -->\r\n");
      out.write("\r\n");
      out.write("<!-- sweetalert弹出框的css样式 -->\r\n");
      out.write("<link href=\"https://cdn.bootcss.com/sweetalert/1.1.3/sweetalert.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://cdn.bootcss.com/jqueryui/1.12.1/jquery-ui.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/favicon.ico\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- END HEAD -->\r\n");
      out.write("<!-- BEGIN BODY -->\r\n");
      out.write("<body class=\"page-header-fixed\">\r\n");
      out.write("<!-- BEGIN HEADER -->\r\n");
      out.write("<div class=\"header navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\t<!-- BEGIN TOP NAVIGATION BAR -->\r\n");
      out.write("\t<div class=\"header-inner\">\r\n");
      out.write("\t\t<!-- BEGIN LOGO -->\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"/index\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/logo.png\" alt=\"logo\" class=\"img-responsive\"/>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<!-- END LOGO -->\r\n");
      out.write("\t\t<!-- BEGIN RESPONSIVE MENU TOGGLER -->\r\n");
      out.write("\t\t<a href=\"javascript:;\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/menu-toggler.png\" alt=\"\"/>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<!-- END RESPONSIVE MENU TOGGLER -->\r\n");
      out.write("\t\t<!-- BEGIN TOP NAVIGATION MENU -->\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav pull-right\">\r\n");
      out.write("\t\t<!-- BEGIN USER LOGIN DROPDOWN -->\r\n");
      out.write("\t\t\t<li class=\"dropdown user\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-close-others=\"true\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/avatar1_small.jpg\"/>\r\n");
      out.write("\t\t\t\t\t<span class=\"username\">\r\n");
      out.write("\t\t\t\t\t\t蒋宇森\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-angle-down\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"extra_profile.html\"><i class=\"fa fa-user\"></i> 个人信息</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"inbox.html\"><i class=\"fa fa-envelope\"></i> 我的消息\r\n");
      out.write("\t\t\t\t\t\t<span class=\"badge badge-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t3\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-tasks\"></i> 我的任务\r\n");
      out.write("\t\t\t\t\t\t<span class=\"badge badge-success\">\r\n");
      out.write("\t\t\t\t\t\t\t7\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"divider\">\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"login\"><i class=\"fa fa-key\"></i> 安全退出</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<!-- END USER LOGIN DROPDOWN -->\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<!-- END TOP NAVIGATION MENU -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- END TOP NAVIGATION BAR -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- END HEADER -->\r\n");
      out.write("<div class=\"clearfix\">\r\n");
      out.write("</div>\r\n");
      out.write("<!-- BEGIN CONTAINER -->\r\n");
      out.write("<div class=\"page-container\">\r\n");
      out.write("\t<!-- BEGIN SIDEBAR -->\r\n");
      out.write("\t<div class=\"page-sidebar-wrapper\">\r\n");
      out.write("\t\t<div class=\"page-sidebar navbar-collapse collapse\">\r\n");
      out.write("\t\t\t<!-- BEGIN SIDEBAR MENU -->\r\n");
      out.write("\t\t\t<ul class=\"page-sidebar-menu\">\r\n");
      out.write("\t\t\t\t<li class=\"sidebar-toggler-wrapper\">\r\n");
      out.write("\t\t\t\t\t<!-- BEGIN SIDEBAR TOGGLER BUTTON -->\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-toggler hidden-phone\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- BEGIN SIDEBAR TOGGLER BUTTON -->\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"start active \">\r\n");
      out.write("\t\t\t\t\t<a href=\"/index\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-home\"></i>\r\n");
      out.write("\t\t\t\t\t<span class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t学生选课\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"selected\">\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/transcript\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-bar-chart-o\"></i>\r\n");
      out.write("\t\t\t\t\t<span class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t成绩查询\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"\">\r\n");
      out.write("\t\t\t\t\t<a href=\"charts.html\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-table\"></i>\r\n");
      out.write("\t\t\t\t\t<span class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t教学计划\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/professorManager\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-user\"></i>\r\n");
      out.write("\t\t\t\t\t<span class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t教师管理\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"last \">\r\n");
      out.write("\t\t\t\t\t<a href=\"charts.html\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-file-text\"></i>\r\n");
      out.write("\t\t\t\t\t<span class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t课程管理\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<!-- END SIDEBAR MENU -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- END SIDEBAR -->\r\n");
      out.write("\t<!-- BEGIN CONTENT -->\r\n");
      out.write("\t<div class=\"page-content-wrapper\">\r\n");
      out.write("\t\t<div class=\"page-content\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- BEGIN PAGE HEADER-->\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<!-- BEGIN PAGE TITLE & BREADCRUMB-->\r\n");
      out.write("\t\t\t\t\t<h3 class=\"page-title\">\r\n");
      out.write("\t\t\t\t\t 管理学院电子商务专业选课系统\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t<ul class=\"page-breadcrumb breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-home\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/index\">主页</a>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/index\">学生选课</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"dashboard-report-range\" class=\"dashboard-date-range tooltips\" data-placement=\"top\" data-original-title=\"Change dashboard date range\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-calendar\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-down\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<!-- END PAGE TITLE & BREADCRUMB-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- END PAGE HEADER-->\r\n");
      out.write("\t\t\t<!-- BEGIN DASHBOARD STATS -->\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<table id=\"table\"></table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- END DASHBOARD STATS -->\r\n");
      out.write("\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"dialog\">\r\n");
      out.write("\t\t\t\t<table id=\"showSectionStudent\"></table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- END CONTENT -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- END CONTAINER -->\r\n");
      out.write("<!-- BEGIN FOOTER -->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class=\"footer-inner\">\r\n");
      out.write("\t\t 2017 &copy; 管理学院电子商务专业选课系统.\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"footer-tools\">\r\n");
      out.write("\t\t<span class=\"go-top\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-angle-up\"></i>\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- END FOOTER -->\r\n");
      out.write("<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\r\n");
      out.write("<!-- BEGIN CORE PLUGINS -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/respond.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/excanvas.min.js\"></script> \r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery-migrate-1.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery.blockui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery.cokie.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/uniform/jquery.uniform.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!-- END CORE PLUGINS -->\r\n");
      out.write("<!-- BEGIN PAGE LEVEL PLUGINS -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/select2/select2.min.js\"></script>\r\n");
      out.write("<!-- END PAGE LEVEL PLUGINS -->\r\n");
      out.write("<!-- BEGIN PAGE LEVEL SCRIPTS -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/scripts/app.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified Locales -->\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- sweetalert弹出框的js样式 -->\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/sweetalert/1.1.3/sweetalert.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jqueryui/1.12.1/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tjQuery(document).ready(function() {    \r\n");
      out.write("\t   App.init(); // initlayout and core plugins\r\n");
      out.write("\t});\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$( \"#dialog\" ).dialog({\r\n");
      out.write("\t\t    autoOpen: false,\r\n");
      out.write("\t\t    width: 400,\r\n");
      out.write("\t\t    height: 500,\r\n");
      out.write("\t\t\ttitle : '已选学生',\r\n");
      out.write("\t\t    modal: true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#table').bootstrapTable({\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/querySection\",\r\n");
      out.write("\t\t\tmethod:'post',\r\n");
      out.write("\t\t\tidField:'sectionSn',\r\n");
      out.write("\t\t\tstriped:true,\t\t//隔行变色\r\n");
      out.write("\t\t\tsingleSelect:true,\t//禁止多选\r\n");
      out.write("\t\t\tclickToSelect:true,\t//点击行时，自动选择\r\n");
      out.write("\t\t\tshowToggle : true,\t//切换试图的图标\r\n");
      out.write("// \t\t\tundefinedText:\"无\",\t//数据为undefined时显示的字符\r\n");
      out.write("\t\t\tshowRefresh:true,\t//刷新按钮\r\n");
      out.write("\t\t\tpagination:true,\t//显示分页条\r\n");
      out.write("\t\t\tonlyInfoPagination:true,//仅显示总数据数\r\n");
      out.write("// \t\t\tsidePagination:'server',//在哪里进行分页\r\n");
      out.write("// \t\t\tshowPaginationSwitch:true,//数据条数选择框\r\n");
      out.write("// \t\t\tpageNumber:1,\t\t\t//首页页码\r\n");
      out.write("// \t\t\tpageSize:10,\t\t\t//页面数据条数\r\n");
      out.write("// \t\t\tpageList:[10, 25, 50, 100, 'All'],\r\n");
      out.write("\t\t\tdataField : 'rows',\r\n");
      out.write("\t\t\ttotalField : 'total',\r\n");
      out.write("\t\t\tcolumns: [{\r\n");
      out.write("\t\t\t\tcheckbox: true\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield: 'sectionNo',\r\n");
      out.write("\t\t\t\ttitle: '课程编号'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield: 'name',\r\n");
      out.write("\t\t\t\ttitle: '课程'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield: 'teacher',\r\n");
      out.write("\t\t\t\ttitle: '教师'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield: 'time',\r\n");
      out.write("\t\t\t\ttitle: '时间'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield: 'day',\r\n");
      out.write("\t\t\t\ttitle: '周次'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield: 'room',\r\n");
      out.write("\t\t\t\ttitle: '教室'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield: 'capacity',\r\n");
      out.write("\t\t\t\ttitle: '容量'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield: 'credits',\r\n");
      out.write("\t\t\t\ttitle: '学分'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield: 'select_btn',\r\n");
      out.write("\t\t\t\ttitle: '选课',\r\n");
      out.write("\t\t\t\talign: 'center',\r\n");
      out.write("\t\t\t\tformatter: function(value, row, index){\r\n");
      out.write("\t\t\t\t\treturn \"<button type='button' class='btn btn-primary' onclick=selectSection(\"+row.sectionNo+\",'\"+row.name+\"'\"+\")>选课</button>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield: 'query_btn',\r\n");
      out.write("\t\t\t\ttitle: '查看已选学生',\r\n");
      out.write("\t\t\t\talign: 'center',\r\n");
      out.write("\t\t\t\tformatter: function(value, row, index){\r\n");
      out.write("\t\t\t\t\treturn \"<button type='button' class='btn btn-primary' onclick=queryEnrolledStudents(\"+row.sectionNo+\")>查看</button>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#showSectionStudent').bootstrapTable({\r\n");
      out.write("\t\t\tmethod:'post',\r\n");
      out.write("\t\t\tidField:'ssn',\r\n");
      out.write("\t\t\tcontentType:'application/x-www-form-urlencoded',\r\n");
      out.write("\t\t\tstriped:true,\t\t//隔行变色\r\n");
      out.write("\t\t\tsingleSelect:true,\t//禁止多选\r\n");
      out.write("\t\t\tdataField : 'rows',\r\n");
      out.write("\t\t\ttotalField : 'total',\r\n");
      out.write("\t\t\tcolumns: [\r\n");
      out.write("\t\t\t\t{field:'ssn',title:'学号',width:100}, \r\n");
      out.write("\t\t\t\t{field:'name',title:'姓名',width:100},\r\n");
      out.write("\t\t\t\t{field:'degree',title:'年级',width:100}, \r\n");
      out.write("\t\t\t\t{field:'major',title:'专业',width:100}\r\n");
      out.write("\t\t\t]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t})\r\n");
      out.write("\tfunction selectSection(sectionNo,name){\r\n");
      out.write("\t\tvar textValue=\"你确定选择\"+name+\"这门课程吗？\"\r\n");
      out.write("\t\tswal({\r\n");
      out.write("\t\t\t  title: \"系统提示\",\r\n");
      out.write("\t\t\t  text: textValue,\r\n");
      out.write("\t\t\t  type: \"info\",\r\n");
      out.write("\t\t\t  showCancelButton: true,\r\n");
      out.write("\t\t\t  closeOnConfirm: false,\r\n");
      out.write("\t\t\t  confirmButtonText: \"确定\",\r\n");
      out.write("\t\t\t  cancelButtonText: \"取消\",\r\n");
      out.write("\t\t\t  showLoaderOnConfirm: true,\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tfunction(){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t      url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/selectSection',\r\n");
      out.write("\t\t\t\t      data:{'sectionNo':sectionNo}, \r\n");
      out.write("\t\t\t\t      method:'POST',\r\n");
      out.write("\t\t\t\t      success:function(res){\r\n");
      out.write("\t\t\t\t    \t  $('#table').bootstrapTable('refresh');\r\n");
      out.write("\t\t\t\t    \t  swal(res);\r\n");
      out.write("\t\t\t\t      }\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction queryEnrolledStudents(sectionNo){\r\n");
      out.write("\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/queryEnrolledStudents\";\r\n");
      out.write("\t\t$('#showSectionStudent').bootstrapTable('refresh',{url: url, query: {sectionNo: sectionNo}});\r\n");
      out.write("\t\t$( \"#dialog\" ).dialog( \"open\" );\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("<!-- END JAVASCRIPTS -->\r\n");
      out.write("</body>\r\n");
      out.write("<!-- END BODY -->\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
