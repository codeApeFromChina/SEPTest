<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%-- <% --%>
<%-- 	String path = request.getContextPath(); --%>
<%-- 	String basePath = request.getScheme() + "://" --%>
<%-- 			+ request.getServerName() + ":" + request.getServerPort() --%>
<%-- 			+ path + "/"; --%>
<%-- %> --%>


<!DOCTYPE html>
<html lang="en">
	<s:include value="../header.jsp"></s:include>
	<!-- Start: MAIN CONTENT -->
	<div class="content">
	
	<s:param name = "name" value = "#usedGood.name"></s:param>		


	</div>
	<!-- End: MAIN CONTENT -->
	
	<s:include value="../footer.jsp"></s:include>
</html>
