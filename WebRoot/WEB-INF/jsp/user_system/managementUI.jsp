<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html lang="en">
<s:include value="../basic_resource/header.jsp"></s:include>

 
    <!-- Start: MAIN CONTENT -->
    <div class="content">
      <div class="container">
      
        <div class="page-header">
			<h1>用户管理界面</h1>
            
			
        </div>

			<button class= "btn" style = "float:right">
	        	<a id="addGood-butn" href="goodAction_saveUI.action"  >发布二手商品</a>
			</button>

        <table class = "table well">
        	<tr>
        		<td>商品类型</td>
        		<td>商品名称</td>
        		<td>商品价格</td>
				<td>商品上传日期</td>        	
				<td>操作</td>        	
        	</tr>
			<s:iterator value = "displayIterms" var = "displayIterm" >
				<tr>
					<td>
						<s:property value = "#displayIterm.type"/>
					</td>
					
					<td>
					<s:a href="displayAction_showIterm.action?itermId=%{#displayIterm.id}">
						<s:property value = "#displayIterm.name"/>
					</s:a>
					</td>
					
					<td>
						<s:property value = "#displayIterm.price"/>
					</td>
					<td>
    					<s:date name="#displayIterm.uploadeDate"/>
					</td>

					<td>
						<s:a href = "userSystem_deleteById.action?usedGoodId=%{#displayIterm.id}">
							删除
						</s:a>
						
					</td>
				
				</tr>
			</s:iterator>
        </table>
      
      </div>
    <div>
    <!-- End: MAIN CONTENT -->
   	<s:include value="../basic_resource/footer.jsp"></s:include>
   
  </body>
</html>