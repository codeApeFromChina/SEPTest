<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%

 %>

<%@ taglib prefix="s" uri="/struts-tags"%>

<%-- <% --%>
<%-- 	String path = request.getContextPath(); --%>
<%-- 	String basePath = request.getScheme() + "://" --%>
<%-- 			+ request.getServerName() + ":" + request.getServerPort() --%>
<%-- 			+ path + "/"; --%>
<%-- %> --%>


<!DOCTYPE html>
<html lang="en">
	<s:include value="../basic_resource/header.jsp"></s:include>
	<!-- Start: MAIN CONTENT -->
	<div class="content">
	
	<s:property value = "usedGood.tradeLocation"/>
	
	<s:iterator value="usedGood.images" id = "img">
		<p>====</p>
		<s:property value = "#img.imageName" />
		<img src="<s:url value="/images/%{#img.imageName}"/>" />
	</s:iterator>
	
	</div>
	<!-- End: MAIN CONTENT -->
	
	<s:include value="../basic_resource/footer.jsp"></s:include>
</html>
