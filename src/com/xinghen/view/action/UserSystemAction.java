package com.xinghen.view.action;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xinghen.base.BaseAction;
import com.xinghen.domain.User;

@Controller
@Scope("prototype")
public class UserSystemAction extends BaseAction<User> {

	public String loginUI() throws Exception {

		return "loginUI";
	}

	public String login() throws Exception {

		Map session = ActionContext.getContext().getSession();

		User user = userSystemService.findByUserNameAndPassword(
				model.getUserName(), model.getPassWord());

		if (user == null) {
			ActionContext.getContext().put("inputError", "用户名或密码错误");
			return "loginUI";
		}

		session.put("user", user);

		System.out.println("here is login ");

		return "login";
	}
	
	public String logout () {
		
		Map session = ActionContext.getContext().getSession();
		session.remove("user");
		
		return "logoutUI";
	}
	

	public String signUpUI() throws Exception {

		System.out.println("here is signUpUI ");

		return "signUpUI";
	}

	public String signUp() throws Exception {

		userSystemService.save(model);

		System.out.println(model.getUserName()
				+ "====================>>>>>>>>>>>>>..");

		return "signUp";
	}
	
	public String managementUI()
	{
//		List usedGoodList = usedGoodService.findAll();
		
		
		return "managementUI";
	}

	
	

}
