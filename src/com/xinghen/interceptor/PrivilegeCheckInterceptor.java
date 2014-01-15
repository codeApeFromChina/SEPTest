package com.xinghen.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.xinghen.domain.User;
import com.xinghen.utils.UserUtils;


public class PrivilegeCheckInterceptor extends AbstractInterceptor   {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		
		User user = (User) ActionContext.getContext().getSession().get("user");
		
		
		String nameSpace = invocation.getProxy().getNamespace();
		String actionName = invocation.getProxy().getActionName();
		String url ;
		
		if (nameSpace.endsWith("/"))
		{
			url = nameSpace + actionName;
		}
		else {
			url = nameSpace + "/" + actionName;
		}
		
		System.out.println(url + "===============>>>>>>>>>>..");
		
		if (user == null && UserUtils.hasNoPrivilege(url))
		{
			return "noPrivilegeError";
		}
		
//		System.out.println("================>>>>>>>>>>...befor execute interceptor!~~~~");
		return invocation.invoke();
		
	}

}
