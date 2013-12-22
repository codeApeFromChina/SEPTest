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
		 <s:select label="My Selection"
            name="mySelection"
            value="%{'POPEYE'}"
            list="%{#{'SUPERMAN':'Superman', 'SPIDERMAN':'spiderman'}}">
    <s:optgroup label="Adult"
                 list="%{#{'SOUTH_PARK':'South Park'}}" />
    <s:optgroup label="Japanese"
                 list="%{#{'POKEMON':'pokemon','DIGIMON':'digimon','SAILORMOON':'Sailormoon'}}" />
 </s:select>

	
	</body>

</html>