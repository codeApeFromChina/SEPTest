<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html>
<html lang="en">
<s:include value="../basic_resource/header.jsp"></s:include>

<!-- Start: MAIN CONTENT -->

<div class="container-fluid content"
	style="
    margin: 0 auto;
    width: 80%;
    ">
	<div class="hero-unit">
		<h1>**********</h1>
		<p>============================</p>

		<p>
			<a href="" class="btn btn-primary btn-large">Learn more »</a>
		</p>
	</div>

	<div class="row-fluid">

		<div class="span3">
			<div class="well sidebar-nav" style="margin:10px">
				<ul class="nav nav-list">
					<s:iterator value="#categoryMap" var="categoryIterm">
						<li><a
							href='<s:url value = "displayAction_displayByCategory.action?requestType=%{key}"></s:url>'>
								<s:property value="value" /> </a>
						</li>
					</s:iterator>
				</ul>
			</div>
			<!--/.well -->
		</div>
		<!--/span-->

		<div class="span9">

			<!-- 				------------------------------------------------------------                             -->

			<div class="row-fluid" id = "iterm-container">
				<s:iterator value="displayIterms" var="displayIterm" status="L">

					<s:if test="(#L.index % 2) == 0">

						<div class="span5" style="margin : 20px;margin-left : 0">
					</s:if>
					<s:else>
						<div class="span5" style="margin : 20px;">
					</s:else>
					<p></p>
					<h2>
						<s:property value="%{#displayIterm.name}" />
					</h2>
					<img src="<s:url value="/images/%{#displayIterm.imageName}"/>" />
					<p>
						<s:property value="#displayIterm.description" />
					<p>
						<s:a cssClass="btn"
							href="displayAction_showIterm.action?itermId=%{#displayIterm.id}">View details »</s:a>
					</p>
					<!--/span-->
			</div>
			</s:iterator>

		</div>

		<!--/row-->

	</div>
	<!--/span-->


</div>
<!--/row-->

<hr>

<!-- End: MAIN CONTENT -->

<s:include value="../basic_resource/footer.jsp"></s:include>
<script type="text/javascript" src = "${pageContext.request.contextPath}/js/request_json.js">
</script>
</body>
</html>
