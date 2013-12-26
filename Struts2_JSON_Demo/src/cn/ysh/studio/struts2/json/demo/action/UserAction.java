package cn.ysh.studio.struts2.json.demo.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;

import cn.ysh.studio.struts2.json.demo.bean.User;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//将会被Struts2序列化为JSON字符串的对象
	private Map<String, Object> dataMap;

	/**
	 * 构造方法
	 */
	public UserAction() {
		//初始化Map对象
		dataMap = new HashMap<String, Object>();
	}

	/**
	 * 测试通过action以视图方式返回JSON数据
	 * @return
	 */
	public String testByJSP() {
		User user = new User();
		user.setId("123");
		user.setName("JSONActionJSP");
		user.setPassword("123");
		user.setSay("Hello world !");
		JSONObject jsonObject=new JSONObject();
		jsonObject.accumulate("user", user);
		jsonObject.accumulate("success", true);
		//这里在request对象中放了一个data，所以struts的result配置中不能有type="redirect"
		ServletActionContext.getRequest().setAttribute("data", jsonObject.toString());
		return SUCCESS;
	};

	/**
	 * 测试通过action以Struts2默认方式返回JSON数据
	 * @return
	 */
	public String testByAction() {
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap.clear();
		User user = new User();
		user.setId("123");
		user.setName("JSONActionStruts2");
		user.setPassword("123");
		user.setSay("Hello world !");
		dataMap.put("user", user);
		// 放入一个是否操作成功的标识
		dataMap.put("success", true);
		// 返回结果
		
		return SUCCESS;
	}

	/**
	 * 通过action是以传统方式返回JSON数据
	 * @throws IOException
	 */
	public void doAction() throws IOException{
		HttpServletResponse response=ServletActionContext.getResponse();
		//以下代码从JSON.java中拷过来的
		response.setContentType("text/html");
		PrintWriter out;
		out = response.getWriter();
		//将要被返回到客户端的对象
		User user=new User();
		user.setId("123");
		user.setName("JSONActionGeneral");
		user.setPassword("JSON");
		user.setSay("Hello , i am a action to print a json!");
		JSONObject json=new JSONObject();
		json.accumulate("success", true);
		json.accumulate("user", user);
		out.println(json.toString());
//		因为JSON数据在传递过程中是以普通字符串形式传递的，所以我们也可以手动拼接符合JSON语法规范的字符串输出到客户端
//		以下这两句的作用与38-46行代码的作用是一样的，将向客户端返回一个User对象，和一个success字段
//		String jsonString="{\"user\":{\"id\":\"123\",\"name\":\"JSONActionGeneral\",\"say\":\"Hello , i am a action to print a json!\",\"password\":\"JSON\"},\"success\":true}";
//		out.println(jsonString);
		out.flush();
		out.close();
	}
	
	/**
	 * Struts2序列化指定属性时，必须有该属性的getter方法，实际上，如果没有属性，而只有getter方法也是可以的
	 * @return
	 */
	public Map<String, Object> getDataMap() {
		return dataMap;
	}

}
