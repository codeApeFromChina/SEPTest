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
	<div class="content-primary">
	
		<p>货物名称:</p>
		<s:property value="usedGood.name" />
		<br>
		<p>货物类型:</p>
		<s:property value="usedGood.type" />
		<br>
		<p>转手价格：</p>
		<s:property value="usedGood.price" />
		<br>
		<p>交易类型：</p>
		<s:property value="usedGood.tradeType" />
		<br>
		<p>交易地点:</p>
		<s:property value="usedGood.tradeLocation" />
		<br>
		<p>商品描述</p>
		<s:property value="usedGood.description" />
		<br>
		<s:iterator value="usedGood.images" id="img">

			<img src="<s:url value="/images/%{#img.imageName}"/>" width=700px />
		</s:iterator>

	</div>
</div>
<!-- End: MAIN CONTENT -->

<s:include value="../basic_resource/footer.jsp"></s:include>
</html>
