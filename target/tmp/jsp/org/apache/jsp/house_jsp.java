/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.11.v20160721
 * Generated at: 2016-08-17 03:20:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class house_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/Users/USER/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425949870000L));
    _jspx_dependants.put("file:/Users/USER/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1471256029000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link href=\"https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"/public/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script src=\"http://apps.bdimg.com/libs/angular.js/1.4.6/angular.min.js\"></script>\r\n");
      out.write("\t<title>易居网络平台</title>\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body width= screen.width>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"nav-wrap\"></div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<div class=\"searchs\">\r\n");
      out.write("\t\t<div class=\"search-area\">\r\n");
      out.write("\t\t\t<form>\r\n");
      out.write("\t\t\t\t<div class=\"search-txt\">\r\n");
      out.write("\t\t\t\t\t<input class=\"left txt autoSuggest\" name=\"keyword\" autoComplete=\"off\" placeholder=\"请输入区域、商圈或小区名开始找房\" id=\"keyword-box\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" data-bl=\"search\" data-el=\"search\" target=\"_blank\" class=\"btn ico-search act-search\">搜索</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"intro\"></div>\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<!--标题行内容-->\r\n");
      out.write("\t\t<div class=\"title-line\">\r\n");
      out.write("\t\t\t<div class=\"line01\">\r\n");
      out.write("\t\t\t\t<h1 class=\"title-box\">西郡香林稀缺内跃带双花园，套三幻变套四，08年电梯</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"view-label\">\r\n");
      out.write("\t\t\t\t<span class=\"span-discount\">　满五年唯一　</span>\r\n");
      out.write("\t\t\t\t<span class=\"span-visit\">　随时看房　</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--房屋信息区域-->\r\n");
      out.write("\t\t<section class=\"panel-box panel-box-info clear\">\r\n");
      out.write("\t\t\t<!--相册相关信息-->\r\n");
      out.write("\t\t\t<div class=\"album-box\" id=\"album-box\">\r\n");
      out.write("\t\t\t\t<div id=\"myCarousel\" class=\"carousel slide\"> \r\n");
      out.write("\t\t\t\t   <!-- 轮播（Carousel）项目 -->\r\n");
      out.write("\t\t\t\t   <div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t      <div class=\"item active\">\r\n");
      out.write("\t\t\t\t         <img src=\"/public/img/house00.jpg\" alt=\"First slide\">\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t      <div class=\"item\">\r\n");
      out.write("\t\t\t\t         <img src=\"/public/img/house01.jpg\" alt=\"Second slide\">\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t      <div class=\"item\">\r\n");
      out.write("\t\t\t\t         <img src=\"/public/img/house02.jpg\" alt=\"Third slide\">\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t      <div class=\"item\">\r\n");
      out.write("\t\t\t\t         <img src=\"/public/img/house03.jpg\" alt=\"Third slide\">\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t      <div class=\"item\">\r\n");
      out.write("\t\t\t\t         <img src=\"/public/img/house04.jpg\" alt=\"Third slide\">\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t   <!-- 轮播（Carousel）导航 -->\r\n");
      out.write("\t\t\t\t   <a class=\"carousel-control left\" href=\"#myCarousel\" \r\n");
      out.write("\t\t\t\t      data-slide=\"prev\"><span>&lsaquo;</span></a>\r\n");
      out.write("\t\t\t\t   <a class=\"carousel-control right\" href=\"#myCarousel\" \r\n");
      out.write("\t\t\t\t      data-slide=\"next\"><span>&rsaquo;</span></a>\r\n");
      out.write("\t\t\t\t   <!-- 轮播（Carousel）指标 -->\r\n");
      out.write("\t\t\t\t   <div class=\"carousel-idc\">\r\n");
      out.write("\t\t\t\t\t   <ol class=\"carousel-indicators\" id=\"\">\r\n");
      out.write("\t\t\t\t\t      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"><img src=\"Public/img/house00.jpg\"></li>\r\n");
      out.write("\t\t\t\t\t      <li data-target=\"#myCarousel\" data-slide-to=\"1\"><img src=\"Public/img/house01.jpg\"></li>\r\n");
      out.write("\t\t\t\t\t      <li data-target=\"#myCarousel\" data-slide-to=\"2\"><img src=\"Public/img/house02.jpg\"></li>\r\n");
      out.write("\t\t\t\t\t      <li data-target=\"#myCarousel\" data-slide-to=\"3\"><img src=\"Public/img/house03.jpg\"></li>\r\n");
      out.write("\t\t\t\t\t      <li data-target=\"#myCarousel\" data-slide-to=\"4\"><img src=\"Public/img/house04.jpg\"></li>\r\n");
      out.write("\t\t\t\t\t   </ol>\r\n");
      out.write("\t\t\t\t   </div> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--房屋相关信息-->\r\n");
      out.write("\t\t\t<div class=\"info-box\" id=\"info-box\">\r\n");
      out.write("\t\t\t\t<div class=\"desc-text\">\r\n");
      out.write("\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t<dt>售价:</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"em-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.prize}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>万</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<i>/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.area}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("㎡</i>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t<dt>单价:</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd class=\"short\">11198 元/平米</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t<dt>首付:</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd class=\"short\">33 万</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t<dt>月供：</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd class=\"short\">4087 元</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t<dt>户型：</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>3室2厅</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t<dt>朝向：</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>南</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t<dt>楼层：</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>高楼层(共11层)</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t<dl class=\"clear\">\r\n");
      out.write("\t\t\t\t\t\t<dt>小区：</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>西郡香林五大花园</dd>\r\n");
      out.write("\t\t\t\t\t\t<p>　</p>\r\n");
      out.write("\t\t\t\t\t\t<span>2006</span>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"countact-panel\">\r\n");
      out.write("\t\t\t\t\t<img src=\"Public/img/PhoneNum.png\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--中介相关信息-->\r\n");
      out.write("\t\t\t<div class=\"agent-box\" id=\"agent-box\">\r\n");
      out.write("\t\t\t\t<div class=\"agent-info\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agent-del\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"iframe-img\" src=\"Public/img/agent.jpg\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"p-del\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"p-01\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">杜千</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\" alt=\"在线咨询\"><img src=\"Public/img/query.png\"></a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"p-02\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>店经理</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"p-03\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"bold\">从业年限:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span>2-3年</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"p-04\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"bold\">月总带看:</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span>19次</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"agent-comment\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"promise\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"unic-label\"></div>\r\n");
      out.write("\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t<section class=\"panel-box panel-box-content clear\">\r\n");
      out.write("\t\t\t<article class=\"content-main\">\r\n");
      out.write("\t\t\t\t<ul class=\"panel-tab\" id=\"panel-tab\">\r\n");
      out.write("\t\t\t\t\t<li class=\"on\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#detail-content\">房源描述</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#detail-album\">房源图片</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"detail-content\" id=\"detail-content\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"detail-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>房源描述</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"detail-contents\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"items\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>正读晋阳小学 内跃精装套三可改套四 带入户花园</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"time\">2016-08-05 20:18:49 更新</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"text-comment\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t特别提醒：诚心出售！\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         1.房子我看过很多次了，户型是内跃套二带两个书房，可改套三。\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         2.进门有一个入户花园，可以摆一个很大的鞋柜，还可以放一些盆栽的绿色植物，视野看起来非常开阔。\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         3.入户花园推拉门进去是客厅，右手边是厨房和卫生间，厨房是拉长型的，空间挺大，而且明亮带生活阳台；左手边是卧室，对着卧室的是一个书房，也可以作为另外一个卧室；...\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"actShowMore\">阅读全部</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"text-comment-all\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t特别提醒：诚心出售！\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t1.房子我看过很多次了，户型是内跃套二带两个书房，可改套三。\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t2.进门有一个入户花园，可以摆一个很大的鞋柜，还可以放一些盆栽的绿色植物，视野看起来非常开阔。\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t3.入户花园推拉门进去是客厅，右手边是厨房和卫生间，厨房是拉长型的，空间挺大，而且明亮带生活阳台；左手边是卧室，对着卧室的是一个书房，也可以作为另外一个卧室；\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t4.两卧室中间的楼梯上去是二楼，二楼是一个很大的主卧，带独立的卫生间。旁边有一个小书房，左边门打开出去是十多个平方的屋顶花园，可以在上面远眺看书喝茶，夏天可以纳凉看星星，冬天可以享受日光浴。\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t房源描述： \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t房屋卖点：精装套二，带入户花园，顶楼带平台花园，临近地铁7号线\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t户型：内跃套二，带一个书房、一个储物间，可改套三，一厨两卫，带入户花园，带屋顶花园\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t朝向：坐东朝西\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t装修：精装，拎包入住 \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t学区：有名额、可落户。可上学校：成都市晋阳小学\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t税费：房子满五唯一，没有增值税和个税。契税按实际情况缴纳\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t看房：房屋空置，有钥匙，随时可看\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t小区介绍：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t地理位置：武侯区中央花园晋阳路215号\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t总建面：39507平方米（中型小区）\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t开发商：汉派实业\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t物业公司：好人家\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t物业费用：1.6元/平米·月\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t容积率：3.4\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t绿化率：30%（绿化率高）\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t其他：小区总共有3栋，一栋有5个单元；二栋有2个单元；三栋有3个单元。电梯11楼到顶\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t小区里面带游泳池，带小孩娱乐设备，有地下停车场\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"people\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>经纪人</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"agent-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"agent-del\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"iframe-img\" src=\"Public/img/agent.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"p-del\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"p-01\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"\">杜千</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"\" alt=\"在线咨询\"><img src=\"Public/img/query.png\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"p-04\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"bold\">月总带看:</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>19次</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"p-05\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"bold\">好评率:</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>100%</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"contactted\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t 4008752017转3695\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"detail-album\" class=\"detail-album\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"detail-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>房源图片</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"detail-album-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"actShowImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Public/img/house03.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"/public/img/house03.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"actShowImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Public/img/house00.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"public/img/house00.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"actShowImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Public/img/house01.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"Public/img/house01.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"actShowImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Public/img/house02.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"Public/img/house02.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><span class=\"sub-text\" id=\"btn-expand-album\" href=\"#\">查看更多图片>></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"album-more\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"actShowImg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Public/img/house04.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"Public/img/house04.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</article>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t<div class=\"f-title\">\r\n");
      out.write("\t\t\t\t<div class=\"fl\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">了解易居网</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">关于易居</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">联系我们</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">加入我们</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">隐私声明</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">经纪人登录</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">友情链接</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"fr\">官方客服 1010 9666</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"bottom\">\r\n");
      out.write("\t\t\t\t<div class=\"copyright\">北京易居房地产经纪有限公司 | 网络经营许可证 京ICP备11024601号-12 | © Copyright©2010-2016 链家网Lianjia.com版权所有</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<script src=\"http://libs.baidu.com/jquery/2.0.0/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
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
