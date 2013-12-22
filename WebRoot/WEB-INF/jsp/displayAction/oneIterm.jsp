<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html>
<html lang="en">
<s:include value="../basic_resource/header.jsp"></s:include>
<html>
<body>

	<div class="content container-fluid"
		style="width : 70%;margin : 0 auto">
		<div class="row-fluid" style=" margin:0 auto">

			<div class="span6 well" >
				<p>telephone : 1111111</p>
				<p>2</p>
				<p>3</p>
				<p>4</p>
			</div>

			<div class="span6">
				<h2>提醒</h2>
				<p>防骗提示，远离骗子 电话不通要求QQ联系</p>
			</div>

		</div>

		<div class="row-fluid">
			<div class="span12">

				<div class="well">
					<a>商品详情</a>
				</div>

				<p>
				<div id="description-container" class="iterm-block" style = "margin:0 auto">
					<ul>
						<li>商品名称： <s:property value="name" /></li>
						<li>商品類型： <s:property value="type" /></li>
						<li>詳細描述： <s:property value="description" /></li>
					</ul>
				</div>

				<div id="imageList-container " >
					<s:iterator value="images" var="img">
						<img  src="<s:url value="/images/%{#img.imageName}"/>"
							style="width : 700px; margin : auto auto; text-align:center" />
						<s:property value="img.imageName" />
					</s:iterator>
				</div>


			</div>
		</div>
	</div>


	<s:include value="../basic_resource/footer.jsp"></s:include>
</body>

</html>