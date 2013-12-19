<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

	<body>
		<s:debug></s:debug>
<!-- 		<s:fielderror></s:fielderror> -->
		<s:actionmessage/>
<!-- 		<s:actionerror/> -->
	
	</body>

</html>