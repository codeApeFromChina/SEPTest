package com.xinghen.testaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xinghen.domain.TestBean;


@Controller("testAction2")
@Scope("prototype")
public class TestAction extends ActionSupport  implements ModelDriven<TestBean>
{

	private String type ;
	private Map dataMap = new HashMap <String, String> ();

	TestBean testBean = new TestBean();
	
	public String optGroupTest (){
		Map typeList= new HashMap();
		
		Map bookCategory =new HashMap<String, String>();
		bookCategory.put("E|数学书", "数学书");
		bookCategory.put("E|语文书", "语文书");
		bookCategory.put("E|英语书", "英语书");
		
		typeList.put("二手书", bookCategory);
		ActionContext.getContext().put("typeList", bookCategory);
		return "optGroupTest";
	}
	
	public String JSONTest (){
		
		String str = "asdfasdf";
		dataMap.put("testString" , str);
		dataMap.put("success", true);
		System.out.println("dddd");
		
		return "success";
	}
	
	public String optRecv (){
		
		System.out.println(type);
		return "success";
	}

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
		ActionContext.getContext().put("test", testBean);
		System.out.println(">>>>>>>>>>>>>>>");
		System.out.println("====" + testBean.getName());
		System.out.println(testBean.getPrice());
		
		return "test";
	}

	
	public TestBean getTestBean() {
		return testBean;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}
	public TestBean getModel() {
		return testBean;
	}

	public Map getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map dataMap) {
		this.dataMap = dataMap;
	}
	
}

