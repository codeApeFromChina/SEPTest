<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Struts2与JSON测试</title>
		<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
	</head>
	<body>
		<a href="<%=basePath %>JSON" title="测试从Servlet获取JSON数据">测试从Servlet获取JSON数据</a><br/>
		<a href="<%=basePath %>JSON.jsp" title="测试从JSP获取JSON数据">测试从JSP获取JSON数据</a><br/>
		<a href="<%=basePath %>testJSONFromActionByGeneral.action" title="测试从Action以常规方式获取JSON数据">测试从Action以常规方式获取JSON数据</a><br/>
		<a href="<%=basePath %>testByJSP.action" title="测试从Action以视图方式获取JSON数据">测试从Action以视图方式获取JSON数据</a><br/>
		<a href="<%=basePath %>test/testByAction.action" title="测试从Action以Struts2方式获取JSON数据">测试从Action以Struts2方式获取JSON数据</a><br/>
	</body>
</html>