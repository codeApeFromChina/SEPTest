<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Bootbusiness | Short description about company">
    <meta name="author" content="Your name">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-responsive.min.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/font-awesome-ie7.css" rel="stylesheet">
    <link href="css/boot-business.css" rel="stylesheet">
  </head>
  <body>
    <!-- Start: HEADER -->
    <header>
      <!-- Start: Navigation wrapper -->
      
      <!-- End: Navigation wrapper -->   
    </header>
    <!-- End: HEADER -->
    <!-- MAIN CONTENT -->
    <div class="content">
      <div class="container">
        <div class="page-header">
          <h1>Our works <small>caption for your works</small></h1>
        </div>
        <div class="row">
          <div class="span12">
            <ul class="thumbnails">
              <li class="span3">
                <a href="#portfolioModal1" class="thumbnail" data-toggle="modal">
                  <img src="http://placehold.it/260x180">
                </a>
                <!-- Start: Modal -->
                <div class="modal hide fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-labelledby="portfolioList" aria-hidden="true">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h3 id="myModalLabel">Work title</h3>                    
                  </div>
                  <div class="modal-body">
                    <div class="center-align">
                      <img src="http://placehold.it/500x250" class="bottom-space-less thumbnail" alt="image name">
                    </div>
                    <p>
                      Work description.Work description.Work description.
                      Work description.Work description.Work description.
                      Work description.Work description.Work description.
                      Work description.Work description.Work description.
                    </p>
                  </div>
                  <div class="modal-footer">
                    <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
                  </div>
                </div>
                <!-- End: Modal -->
              </li>
              <li class="span3">
                <a href="#portfolioModal2" class="thumbnail" data-toggle="modal">
                  <img src="http://placehold.it/260x180">
                </a>
                <!-- Start: Modal -->
                <div class="modal hide fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-labelledby="portfolioList" aria-hidden="true">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h3 id="myModalLabel">Work title</h3>                    
                  </div>
                  <div class="modal-body">
                    <div class="center-align">
                      <img src="http://placehold.it/500x250" class="bottom-space-less thumbnail" alt="image name">
                    </div>
                    <p>
                      Work description.Work description.Work description.
                      Work description.Work description.Work description.
                      Work description.Work description.Work description.
                      Work description.Work description.Work description.
                    </p>
                  </div>
                  <div class="modal-footer">
                    <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
                  </div>
                </div>
                <!-- End: Modal -->
             
             
           
            
          </div>                                     
        </div>          
      </div>
    </div>
  
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/boot-business.js"></script>
  </body>
</html>
