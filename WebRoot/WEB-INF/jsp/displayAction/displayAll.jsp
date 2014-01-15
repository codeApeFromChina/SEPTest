<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html>
<html lang="en">
<s:include value="../basic_resource/header.jsp"></s:include>

<!-- Start: MAIN CONTENT -->
<div class="content">
	<div class="container">
		<div class="container-fluid well "
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
			<p id="requestType" class="hidden">
				<s:property value="requestType" />
			</p>


			<div class="row-fluid">

				<div class="span3">
					<div class="well sidebar-nav" style="margin:10px">
						<ul class="nav nav-list">
							<li><a href="displayAction_displayAll?requestType=G:">查看全部</a>
							</li>
							<s:iterator value="#categoryMap" var="categoryIterm">
								<li><a class="chose-iterm"
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

					<div class="row-fluid" id="iterm-container">
						<s:iterator value="displayIterms" var="displayIterm" status="L">
							<div class="span5" style="margin : 20px;">
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
		</div>
	</div>

	<s:include value="../basic_resource/footer.jsp"></s:include>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/request_json.js">
		
	</script>
	</body>
</html>
