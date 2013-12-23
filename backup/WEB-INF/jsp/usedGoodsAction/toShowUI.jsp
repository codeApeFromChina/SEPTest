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
	<div class="content-primary ">
		<ul class="iterm-block well" style="margin :0 auto;float : left">
			<li>货物名称: <s:property value="name" />
			</li>
			<li>货物类型: <s:property value="type" />
			</li>
			<li>转手价格： <s:property value="price" />
			</li>
			<li>交易类型： <s:property value="tradeType" />
			</li>
			<li>交易地点: <s:property value="tradeLocation" />
			</li>
			<li>商品描述: <s:property value="description" />
			</li>
		</ul>

		<s:iterator value="images" id="img">

			<img src="<s:url value="/images/%{#img.imageName}"/>"
				style="width : 700px; margin : 10px" />
		</s:iterator>

	</div>
</div>
<!-- End: MAIN CONTENT -->

<s:include value="../basic_resource/footer.jsp"></s:include>
</html>
