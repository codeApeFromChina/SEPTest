<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<s:form action="T_test" theme="simple" enctype="multipart/form-data" method="post">
	<table class="table well">
		<%--
		<p>===${age}</p>
		<s:property value="++name"  />
		<s:property value="++price" />
		<s:property value="++testBean" />

		</br>
	 --%>
		
<!-- 		<tr> -->
<!-- 			<td>price</td> -->
<!-- 			<td><s:textfield name="price"></s:textfield> -->
<!-- 			</td> -->
<!-- 		</tr> -->
<!-- 		<tr> -->
<!-- 			<td>age</td> -->
<!-- 			<td><s:textfield name="age"></s:textfield> -->
<!-- 			</td> -->
<!-- 		</tr> -->

<!-- 		<s:select name="name" list="#{'used_good':'二手商品','used_book':'二手书籍'}" label="性别" headerKey="" headerValue="姓名"></s:select>  -->
		<s:select name="testBean.name" list="#beanList"  headerKey="" headerValue="商品类型"></s:select> 

		<td><s:submit value="submit "></s:submit>
		</td>
		</tr>
	</table>
</s:form>