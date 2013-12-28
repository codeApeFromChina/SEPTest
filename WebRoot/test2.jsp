<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<!--[if lt IE 7]> <html class="no-js ie6" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js ie7" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js ie8" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> 
<html lang="en"> <!--<![endif]-->

<head>
	<script type="text/javascript" src = "js/jquery.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
    $("a").click(function(){
    	var href=$(this).attr("href");
    	$.getJSON(href,{_date:new Date().getTime()}, function(data){
    		if(data.success){
    			alert("服务器返回了一个User对象，该User的名称是:"+data);
    		}else{
    			alert("服务器返回了未知的数据");
    		}
    	});
    	return false;
    });
});
	
	</script>

</head>

<body>
	<a href = "jsonTest.action">jsontest</a>


</body>
</html>
