package cn.ysh.studio.struts2.json.demo.test;

import cn.ysh.studio.struts2.json.demo.bean.User;
import net.sf.json.JSONObject;

public class JSONTest {

	/**
	 * 将普通的pojo转换成JSON字符串
	 * @return
	 */
	public JSONObject bean2json() {
		User user = new User();
		user.setId("JSONTest");
		user.setName("JSONTest");
		user.setPassword("JSON");
		user.setSay("Hello,i am JSONTest.java");
		JSONObject jsonObject = new JSONObject();
		jsonObject.accumulate("user", user);
		System.out.println("User转换后的字符串:"+jsonObject.toString());
		return jsonObject;
	}

	/**
	 * 从JSONObject对象中反向解析出User对象
	 * @param jsonObject
	 */
	public void json2bean(JSONObject jsonObject) {
		User user=(User)JSONObject.toBean((JSONObject)jsonObject.get("user"),User.class);
		System.out.println("转换得到的User对象的Name为:"+user.getName());
	}

	public static void main(String[] s) {
		JSONTest tester=new JSONTest();
		tester.json2bean(tester.bean2json());
	}
}
