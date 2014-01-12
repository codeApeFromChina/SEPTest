package com.xinghen.view.action;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xinghen.domain.TestBean;


@Controller
@Scope("prototype")
public class TestAction extends ActionSupport {
	
	private TestBean testBean = new TestBean();
	
	private String username;
	private String password;
	private 
	
	String test (){
		System.out.println(testBean.getName());
		System.out.println(testBean.getPrice());
		
		return "test";
	}

	public TestBean getModel() {
		return testBean;
	}
}
