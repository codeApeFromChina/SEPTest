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
            <h4 class="widget-header"><i class="icon-lock"></i>登录到校园二手交易平台</h4>
            <div class="widget-body">
              <div class="center-align">
                
                <s:form cssClass="form-horizontal form-signin-signup" theme="simple" 
                	method = "post" enctype="multipart/form-data" action = "userSystem_login.action">
					<table class = "table well">
						<tr>
							<td>用户名：</td>
							<td>
								<s:textfield name = "userName"></s:textfield>
							</td>
						</tr>
						<tr>
							<td>密码：</td>
							<td>
								<s:password name = "passWord" type = "password"></s:password>
							</td>
						</tr>
					</table>
                  <div class="remember-me">
                    <div class="pull-left">
				<!-- 
                      <label class="checkbox">
                        <input type="checkbox"> Remember me
                      </label>
				 -->
                    </div>
                    <div class="pull-right">
                      <a href="#">Forgot password?</a>
                    </div>
                    <div class="clearfix"></div>
                  </div>
                  <s:submit  value=" submit " value = "Signin" cssClass ="btn btn-primary btn-large" ></s:submit>
                </s:form>
                
                <h4><i class="icon-question-sign"></i> Don't have an account?</h4>
                <a href="userSystem_signUpUI.action" class="btn btn-large bottom-space">注册</a>
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