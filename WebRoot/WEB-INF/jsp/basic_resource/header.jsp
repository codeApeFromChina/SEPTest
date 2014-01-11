 	<%@ page pageEncoding="UTF-8"%>
 	<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Bootbusiness | Short description about company">
    <meta name="author" content="Your name">
    <title>Bootbusiness | Give unique title of the page here</title>
    
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/font-awesome-ie7.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/boot-business.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/MyCss.css" rel="stylesheet">
    
  </head>
  <body>
    <!-- Start: HEADER -->
    <header>
      <!-- Start: Navigation wrapper -->

	<div class="modal hide fade" id="log-in-dialog" tabindex="-1" role="dialog" aria-labelledby="portfolioList" aria-hidden="true">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			<h3 id="myModalLabel">登录</h3>                    
		</div>
		<div class="modal-body">
			<div class="center-align">
				<p>
					<input>
				</p>
							<p>
					<input>
				</p>
			</div>
			<p>
			</p>
		</div>
		<div class="modal-footer">
			<button id = "login-dialog-login-but" class="btn btn-primary">登录</button>
			<button id = "login-dialog-regist-but" class="btn btn-primary">注册</button>
			<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
		</div>
	</div>
	
	
      <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
          <div class="container">
            <a href="" class="brand brand-bootbus">second-hand transaction</a>
            <!-- Below button used for responsive navigation -->
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <!-- Start: Primary navigation -->
            <div class="nav-collapse collapse">        
              <ul class="nav pull-right">
              
              <li>
              </li>
              <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">城市选择<b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="our_works.html">北京</a></li>
                                        <li class="divider"></li>
                    
                    <li><a href="patnerships.html">上海</a></li>
                                        <li class="divider"></li>
                    
                    <li><a href="leadership.html">济南</a></li>
                                        <li class="divider"></li>
                    
                    <li><a href="news.html">青岛</a></li>
                  </ul>
                </li>
              
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">城市-青岛<b class="caret"></b></a>
                  <ul class="dropdown-menu">
                  
                  <!-- 学校选择 -->
                    <li class="nav-header">LOCATIONS</li>
                    <li><a href="">青岛大学</a></li>
                    <li class="divider"></li>
                    <li><a href="">中国海洋大学</a></li>
                    <li class="divider"></li>
                    <li><a href="">中国石油大学</a></li>
                    <li class="divider"></li>
                    <li><a href="">青岛理工大学</a></li>             
                    <li class="divider"></li>
                    <li><a href="">青岛理工大学</a></li>             
                    <!-- 
                    <li class="nav-header">SERVICES</li>
                    <li><a href="service.html">Service1</a></li>
                    <li><a href="service.html">Service2</a></li>
                    <li><a href="service.html">Service3</a></li>
                    <li><a href="all_services.html">All services</a></li>
                     -->
                  </ul>                  
                </li>
         	<li>
         	<a  id = "log-in" href="#log-in-dialog"  data-toggle="modal">登录 </a>        
         	
				
         	       
              <!-- 
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">About<b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="our_works.html">Our works</a></li>
                    <li><a href="patnerships.html">Parnerships</a></li>
                    <li><a href="leadership.html">Leadership</a></li>
                    <li><a href="news.html">News</a></li>
                    <li><a href="events.html">Events</a></li>
                    <li><a href="blog.html">Blog</a></li>
                  </ul>
                </li>
                <li><a href="faq.html">FAQ</a></li>
                <li><a href="contact_us.html">Contact us</a></li>
                <li><a href="signup.html">Sign up</a></li>
                <li><a href="signin.html">Sign in</a></li>
               -->
              </ul>
              
            </div>
            
          </div>
          
        </div>
        
      </div>
      
      <!-- End: Navigation wrapper -->   
     
    </header>
    <!-- End: HEADER -->