<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html>
<html lang="en">
<s:include value="header.jsp"></s:include>
<body>
	<!-- Start: MAIN CONTENT -->
	<div class="content">
		<!-- Start: slider -->
		<div class="slider">
			<div class="container-fluid">
				<div id="heroSlider" class="carousel slide">
					<div class="carousel-inner">
						<div class="active item">
							<div class="hero-unit">
								<div class="row-fluid">
									<div class="span7 marketting-info">
										<h1>TELL ABOUT YOUR BUSINESS AND CORPORATE.</h1>
										<p>We are Bootbusiness and we are awesome.We solve your
											technology problems by our awesome products. We are
											Bootbusiness and we are awesome.We solve your technology
											problems by our awesome products.</p>
										<h3>
											<a href="product.html" class="btn">Learn more</a>
										</h3>
									</div>
									<div class="span5">
										<img src="img/placeholder.jpg" class="thumbnail">
									</div>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="hero-unit">
								<div class="row-fluid">
									<div class="span7 marketting-info">
										<h1>TELL ABOUT YOUR NATURE OF WORK</h1>
										<p>We are Bootbusiness and we design ultimate website
											applications. We are Bootbusiness and we design ultimate
											website applications.</p>
										<h3>
											<a href="service.html" class="btn">Learn more</a>
										</h3>
									</div>
									<div class="span5">
										<img src="img/placeholder.jpg" class="thumbnail">
									</div>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="hero-unit">
								<div class="row-fluid">
									<div class="span7 marketting-info">
										<h1>TELL ABOUT YOUR PRODUCT</h1>
										<p>Get excited about our products.We build awesome
											products in mobile. We build awesome products in mobile.We
											build awesome products in mobile.</p>
										<h3>
											<a href="#" class="btn btn-primary">Buy now</a> <a
												href="product.html" class="btn">Learn more</a>
										</h3>
									</div>
									<div class="span5">
										<img src="img/placeholder.jpg" class="thumbnail">
									</div>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="hero-unit">
								<div class="row-fluid">
									<div class="span7 marketting-info">
										<h1>TELL ABOUT YOUR ANOTHER PRODUCT</h1>
										<p>Get excited about our products.We build awesome
											products in mobile. We build awesome products in mobile.We
											build awesome products in mobile.</p>
										<h3>
											<a href="#" class="btn btn-primary">Buy now</a> <a
												href="product.html" class="btn">Learn more</a>
										</h3>
									</div>
									<div class="span5">
										<img src="img/placeholder.jpg" class="thumbnail">
									</div>
								</div>
							</div>
						</div>
					</div>
					<a class="left carousel-control" href="#heroSlider"
						data-slide="prev">‹</a> <a class="right carousel-control"
						href="#heroSlider" data-slide="next">›</a>
				</div>
			</div>
		</div>
		<!-- End: slider -->
		<!-- Start: PRODUCT LIST -->
		<div class="container">

			<!-- second_good_list start -->
			<div class="page-header">
				<h2>二手物品</h2>
			</div>
			<div class="row-fluid">
				<ul class="thumbnails">

					<!-- second_good_list start -->
					<%--
 --%>

					<s:iterator value="usedGoodList" id="usedGood">
						<%--
						for (int i = 0; i < usedGoodList.size(); i++) {
					--%>
						<li class="span4">
							<div class="thumbnail">
								<s:property value = "usedGood.name"/>
								<img src="<s:url value="/images/%{#usedGood.firstImage.imageName}"/>"
									width=700px />
								<div class="caption">
									<h3>Product name</h3>
									<p>Few attractive words about your product.Few attractive
										words about your product. Few attractive words about your
										product.Few attractive words about your product.</p>
								</div>
								<div class="widget-footer">
									<p>
										<a href="#" class="btn btn-primary">Buy now</a>&nbsp; <a
											href="product.html" class="btn">Read more</a>
									</p>
								</div>
							</div></li>
						<%--
						}
					--%>
					</s:iterator>
					<%--
					 --%>

				</ul>
			</div>


			<!-- second_good_list end -->


			<!-- second_book_list start -->
			<div class="page-header">

				<h2>二手书籍</h2>
			</div>
			<div class="row-fluid">
				<ul class="thumbnails">
					<li class="span4">
						<div class="thumbnail">
							<img src="img/placeholder-360x200.jpg" alt="product name">
							<div class="caption">
								<h3>Service title</h3>
								<p>Few attractive words about your service.Few attractive
									words about your service. Few attractive words about your
									service.Few attractive words about your service.</p>
							</div>
							<div class="widget-footer">
								<p>
									<a href="#" class="btn btn-primary">Try for free</a>&nbsp; <a
										href="product.html" class="btn">Read more</a>
								</p>
							</div>
						</div>
					</li>
					<li class="span4">
						<div class="thumbnail">
							<img src="img/placeholder-360x200.jpg" alt="product name">
							<div class="caption">
								<h3>Service title</h3>
								<p>Few attractive words about your service.Few attractive
									words about your service. Few attractive words about your
									service.Few attractive words about your service.</p>
							</div>
							<div class="widget-footer">
								<p>
									<a href="#" class="btn btn-primary">Try for free</a>&nbsp; <a
										href="product.html" class="btn">Read more</a>
								</p>
							</div>
						</div>
					</li>
					<li class="span4">
						<div class="thumbnail">
							<img src="img/placeholder-360x200.jpg" alt="product name">
							<div class="caption">
								<h3>Service title</h3>
								<p>Few attractive words about your service.Few attractive
									words about your service. Few attractive words about your
									service.Few attractive words about your service.</p>
							</div>
							<div class="widget-footer">
								<p>
									<a href="#" class="btn btn-primary">Try for free</a>&nbsp; <a
										href="product.html" class="btn">Read more</a>
								</p>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<!-- second_book_list end -->
		<!-- End: PRODUCT LIST -->
	</div>
	<!-- End: MAIN CONTENT -->

	<s:include value="footer.jsp"></s:include>
</body>
</html>
