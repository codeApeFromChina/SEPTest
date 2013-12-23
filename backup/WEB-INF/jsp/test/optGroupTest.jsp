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
	<form role = "form" action="T_optRecv.action" theme="simple"
			enctype="multipart/form-data" method="post">
			
		<s:select list="{}" name="type" id="typeIterm">

			<s:optgroup  label="222" list="#typeList"></s:optgroup>

		</s:select>
		<s:submit value = "commit"></s:submit>
	</form>

</body>

</html>