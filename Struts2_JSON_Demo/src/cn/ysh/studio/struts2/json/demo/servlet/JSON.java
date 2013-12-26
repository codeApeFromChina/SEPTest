package cn.ysh.studio.struts2.json.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import cn.ysh.studio.struts2.json.demo.bean.User;

public class JSON extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//将要被返回到客户端的对象
		User user=new User();
		user.setId("123");
		user.setName("JSONServlet");
		user.setPassword("JSON");
		user.setSay("Hello , i am a servlet !");
		JSONObject json=new JSONObject();
		json.accumulate("success", true);
		json.accumulate("user", user);
		out.println(json.toString());
//		因为JSON数据在传递过程中是以普通字符串形式传递的，所以我们也可以手动拼接符合JSON语法规范的字符串输出到客户端
//		以下这两句的作用与38-46行代码的作用是一样的，将向客户端返回一个User对象，和一个success字段
//		String jsonString="{\"user\":{\"id\":\"123\",\"name\":\"JSONServlet\",\"say\":\"Hello , i am a servlet !\",\"password\":\"JSON\"},\"success\":true}";
//		out.println(jsonString);
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
