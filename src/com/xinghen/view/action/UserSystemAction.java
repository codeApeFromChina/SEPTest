package com.xinghen.view.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.xinghen.base.BaseAction;
import com.xinghen.domain.User;

@Controller
@Scope("prototype")
public class UserSystemAction  extends BaseAction<User>{
	
	public String loginUI () throws Exception{
		
		return "loginUI";
	}
	
	public String login () throws Exception {
		System.out.println("here is login ");
		
		return "login";
	}

	public String signUpUI() throws Exception {
		
		
		
		System.out.println("here is signUpUI ");
		
		return "signUpUI";
	}
	
	public String signUp() throws Exception {
		
		System.out.println(model.getUserName() + "====================>>>>>>>>>>>>>..");
		return "signUp";
	}
	
}
