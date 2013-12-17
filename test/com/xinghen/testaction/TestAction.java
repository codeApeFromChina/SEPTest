package com.xinghen.testaction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xinghen.domain.TestBean;


@Controller("testAction2")
@Scope("prototype")
//implements ModelDriven<TestBean>
public class TestAction extends ActionSupport    {
//	int age = 1;
//	String name = "11";
//	Float price = 111f;
//	
//	private TestBean testBean = new TestBean();
//	
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Float getPrice() {
//		return price;
//	}
//
//	public void setPrice(Float price) {
//		this.price = price;
//	}

	public TestBean getTestBean() {
		return testBean;
	}

	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}

	TestBean testBean = new TestBean();

	public String exec (){
//		List<String> role = new ArrayList<String> ();
//		for (int i = 0; i < 10; i ++)
//		{
//			role.add("user" + i);
//		}
//		
//		testBean.setAge(22);
//		testBean.setName("xiaobai");
//		testBean.setPrice(1111f);
		
		
//		ActionContext.getContext().put("test2", testBean);
		
		List beanList = new ArrayList<String> ();
		beanList.add("二手商品");
		beanList.add("二手书籍");
		ActionContext.getContext().put("beanList", beanList);
		
		return "success";
	}
	
	public String test (){
//		ActionContext.getContext().put("test", testBean);
		System.out.println(">>>>>>>>>>>>>>>");
		System.out.println("====" + testBean.getName());
		System.out.println(testBean.getPrice());
		
		return "test";
	}

	public TestBean getModel() {
		return testBean;
	}
}
