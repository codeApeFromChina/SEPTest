	<s:form role = "form" action="goodAction_addGood" theme="simple"
			enctype="multipart/form-data" method = "post">

			<div class = "form-group">

			<table class = "table well">


				<tr>
				<div class="input-group input-group-lg">
					<td><span class="input-group-addon">id</span> </td>
					<td>
					<s:textfield cssClass="form-control" name="usedGood.id"></s:textfield>
					</td>
				</div>
				</tr>

				<tr>
					<td>number</td>
					<td><s:textfield name="number"></s:textfield></td>
				</tr>

				<tr>
					<td>交易地点</td>
					<td><s:textfield name="usedGood.tradeLocation"></s:textfield></td>
				</tr>

				<tr>
					<td>货物名称</td>
					<td><s:textfield name="usedGood.name"></s:textfield></td>
				</tr>
				<tr>
					<td>货物类型</td>
					<td><s:textfield name="usedGood.type"></s:textfield></td>
				</tr>
				<tr>
					<td>转手价格</td>
					<td><s:textfield name="usedGood.price"></s:textfield></td>
				</tr>
				<tr>
					<td>交易类型</td>
					<td><s:textfield name="usedGood.tradeType"></s:textfield></td>
				</tr>
				<tr>
					<td>商品简介</td>
					<td><s:textarea name="usedGood.description"></s:textarea></td>
				</tr>
				<tr>
					<td>file</td>
					<td id="more"><s:file name="images"></s:file> <input
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