<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html lang="en">
<s:include value="../basic_resource/header.jsp"></s:include>

<script>
	function addMore() {
		var td = document.getElementById("more");

		var br = document.createElement("br");
		var input = document.createElement("input");
		var button = document.createElement("input");

		input.type = "file";
		input.name = "imageList";

		button.type = "button";
		button.value = "Remove";

		button.onclick = function() {
			td.removeChild(br);
			td.removeChild(input);
			td.removeChild(button);
		}
		td.appendChild(br);
		td.appendChild(input);
		td.appendChild(button);
	}
</script>

<!-- Start: MAIN CONTENT -->
<div class="content">

	<div class="content-primary ">
		<s:form role="form" action="goodAction_addGood" theme="simple"
			enctype="multipart/form-data" method="post">

			<div class="form-group">

				<table class="table well">

					<tr>
						<td>交易地点</td>
						<td><s:textfield name="tradeLocation" value="青岛大学"></s:textfield>
						</td>
					</tr>

					<tr>
						<td>货物名称</td>
						<td><s:textfield name="name" value="一件商品"></s:textfield>
						</td>
					</tr>
					<tr>
						<td>货物类型</td>
						<td>
							<s:select name="type" list="{}">
								<s:optgroup  label="二手书"   list="#bookCategory"></s:optgroup>
								<s:optgroup label ="二手物品" list="#goodCategory"></s:optgroup>
							</s:select>
						</td>
					</tr>
					<tr>
						<td>转手价格</td>
						<td><s:textfield name="price" value="100"></s:textfield>
						</td>
					</tr>
					<tr>
						<td>交易类型</td>
						<td><s:textfield name="tradeType" value="当面交易"></s:textfield>
						</td>
					</tr>
					<tr>
						<td>商品简介</td>
						<td><s:textarea name="description" value="这个东西还不错～"></s:textarea>
						</td>
					</tr>
					<tr>
						<td>file</td>
						<td id="more"><s:file name="imageList"></s:file> <input
							type="button" value="Add More.." onclick="addMore()">
						</td>
					</tr>
					<tr>
						<td><s:submit value=" submit "></s:submit></td>
						<td><s:reset value=" reset "></s:reset></td>
					</tr>
				</table>
			</div>
		</s:form>
	</div>
	<!--  -->

</div>
<!-- End: MAIN CONTENT -->
<s:include value="../basic_resource/footer.jsp"></s:include>
</html>
