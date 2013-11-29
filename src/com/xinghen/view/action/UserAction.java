package com.xinghen.view.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.xinghen.test.ServiceTest;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport{
	
	@Resource
	private ServiceTest serviceTest;
	
	
	public String execute ()
	{
		System.out.println("struts OK!!");
		return "success";
	}

}
