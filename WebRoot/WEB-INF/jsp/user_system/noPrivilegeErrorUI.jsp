<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html lang="en">
<s:include value="../basic_resource/header.jsp"></s:include>


    <!-- Start: MAIN CONTENT -->
    <div class="content">
      <div class="container">
        <div class="page-header">
          <h1</h1>
        </div>
        <div class="row">
          <div class="span6 offset3">
            <h4 class="widget-header"><i class="icon-lock"></i>校园二手交易平台</h4>
            <div class="widget-body">
              <div class="center-align">
               
				<p>
					您暂时没有权限发布商品
				</p>
				
				<p>
					老用户：
					<a id="login-butn" href="userSystem_loginUI.action">登录</a> 
				</p>
				               
				<p>
					新用户：
					<a id="signin-butn" href="userSystem_signinUI.action">注册</a> 
				</p>
				<p>
					继续浏览：
					<a id="homePage-butn" href="indexAction_homePageUI">返回首页</a> 
				</p>
				

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