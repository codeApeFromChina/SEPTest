<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<s:form action="T_test" theme="simple" enctype="multipart/form-data"
	method="post" width="50%" text-align="center">
	<table class="table well">
	
		<p>===${age}</p>
		<s:property value="name"  />
		<s:property value="price" />
		<s:property value="age" />

		</br>
		<%--
	
	 --%>
		<tr>
			<td>name</td>
			<td><s:textfield name="name"></s:textfield></td>
		</tr>

		<tr>
			<td>price</td>
			<td><s:textfield name="price"></s:textfield></td>
		</tr>
		<tr>
			<td>age</td>
			<td><s:textfield name="age"></s:textfield></td>
		</tr>

		<td><s:submit value=" submit "></s:submit></td>
		</tr>
	</table>
</s:form>