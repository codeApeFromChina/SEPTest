$(document).ready(function(){
    $("a").click(function(){
    	var href=$(this).attr("href");
    	$.getJSON(href,{_date:new Date().getTime()}, function(data){
    		if(data.success){
    			alert("服务器返回了一个User对象，该User的名称是:"+data.user.name);
    		}else{
    			alert("服务器返回了未知的数据");
    		}
    	});
    	return false;
    });
});
