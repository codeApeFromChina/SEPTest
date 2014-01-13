<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html lang="en">
<s:include value="../basic_resource/header.jsp"></s:include>


    <!-- Start: MAIN CONTENT -->
    <div class="content">
      <div class="container">
        <div class="page-header">
          <h1>登录</h1>
        </div>
        <div class="row">
          <div class="span6 offset3">
            <h4 class="widget-header"><i class="icon-lock"></i>校园二手交易平台用户注册</h4>
            <div class="widget-body">
              <div class="center-align">
                
                <s:form cssClass="form-horizontal form-signin-signup" theme="simple" method = "post"
                 enctype="multipart/form-data" action = "userSystem_signUp.action">
					<table class = "table well">
						<tr>
							<td>您的名字：</td>
							<td>
								<s:textfield name = "name" value = "小白"></s:textfield>
							</td>
						</tr>
						<tr>
							<td>您的电话号码：</td>
							<td>
								<s:textfield name = "phoneNumber" value = "12345678901"></s:textfield>
							</td>
						</tr>
						<tr>
							<td>您的e-mail：</td>
							<td>
								<s:textfield name = "email" value = "xxx@aaa.com" ></s:textfield>
							</td>
						</tr>
						<tr>
							<td>您的学校：</td>
							<td>
								<s:textfield name = "schoolName" value = "MIT"></s:textfield>
							</td>
						</tr>
						
						<tr>
							<td>所在地：</td>
							<td>
								<s:textfield name = "location" value = "Heaven" ></s:textfield>
							</td>
						</tr>
						

						<tr>
							<td>用户名：</td>
							<td>
								<s:textfield name = "userName" value = "polarBear"></s:textfield>
							</td>
						</tr>
						<tr>
							<td>密码：</td>
							<td>
								<s:password name = "passWord" value = "123456"></s:password>
							</td>
						</tr>
						
					</table>
                 
                  <s:submit  value=" submit " value = "提交" cssClass ="btn btn-primary btn-large" ></s:submit>
                </s:form>
               
              <!-- 
                <h4><i class="icon-thumbs-up"></i> Sign in with third party account</h4>
                <ul class="signin-with-list">
                  <li>
                    <a class="btn-twitter">
                      <i class="icon-twitter icon-large"></i>
                      Signin with Twitter
                    </a>
                  </li>
                  <li>
                    <a class="btn-facebook">
                      <i class="icon-facebook icon-large"></i>
                      Signin with Facebook
                    </a>
                  </li>
                  <li>
                    <a class="btn-google">
                      <i class="icon-google-plus icon-large"></i>
                      Signin with Google
                    </a>
                  </li>
                  <li>
                    <a class="btn-github">
                      <i class="icon-github icon-large"></i>
                      Signin with Github
                    </a>
                  </li>
                </ul>
               -->
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- End: MAIN CONTENT -->
  <s:include value="../basic_resource/footer.jsp"></s:include>
  </body>
</html>