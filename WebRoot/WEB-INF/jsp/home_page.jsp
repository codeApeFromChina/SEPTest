<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html>
<html lang="en">
<s:include value="basic_resource/header.jsp"></s:include>
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
										<h1>
											<s:property value="#sliderList[0].name" />
										</h1>
										<p>
											<s:property value="#sliderList[0].description" />

										</p>
										<p>
											<s:a href="displayAction_showIterm.action?itermId=%{#sliderList[0].id}" >..了解详情</s:a>
										</p>
									</div>
									<div class="span5" style="height : 400px">
										<img
											src="<s:url value="/images/%{#sliderList[0].imageName}"/>" />
									</div>
								</div>
							</div>
						</div>


						<s:iterator value="#sliderList" var="sliderIterm">
							<div class="item">
								<div class="hero-unit">
									<div class="row-fluid">
										<div class="span7 marketting-info">

											<h1>
												<s:property value="#sliderIterm.name" />
											</h1>
											<p>
												<s:property value="#sliderIterm.description" />
											</p>
											<p>
												<s:a href="displayAction_showIterm.action?itermId=%{#sliderIterm.id}">...了解详情</s:a>
											</p>
										</div>
										<div class="span5" style="height : 400px">
											<img src="<s:url value="/images/%{#sliderIterm.imageName}"/>" />
										</div>
									</div>
								</div>
							</div>

						</s:iterator>

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
				<span>
					<h2>二手物品</h2>
					<s:a href = "">查看更多..</s:a>
				</span>
			</div>
			<div class="row-fluid">
				<ul class="thumbnails">
					<s:iterator value="#usedGoodList" id="usedGood">
						<li class="span4" id="${usedGood.id}">
							<div class="thumbnail">
								<img src="<s:url value="/images/%{#usedGood.imageName}"/>"
									width=700px />
								<div class="caption">
									<h3>
										<s:property value="#usedGood.name" />
									</h3>
									<s:property value="#usedGood.description" />
								<s:a href="displayAction_showIterm.action?itermId=%{#usedGood.id}">...了解详情</s:a>
								</div>
								
							</div>
						</li>
					</s:iterator>
				</ul>
			</div>

			<!-- second_good_list end -->

			<!-- second_book_list start -->
			<div class="page-header">

				<h2>二手书籍</h2>
				<s:a>查看更多..</s:a>
			</div>
			<div class="row-fluid">
				<ul class="thumbnails">
					<s:iterator value="#usedBookList" id="usedBook">
						<li class="span4" id="${usedBook.id}">
							<div class="thumbnail">
								<img src="<s:url value="/images/%{#usedBook.imageName}"/>"
									width=700px />
								<div class="caption">
									<h3>
										<s:property value="#usedBook.name" />
									</h3>
									<s:property value="#usedBook.description" />
									<s:a href="displayAction_showIterm.action?itermId=%{#usedBook.id}">...了解详情</s:a>
								</div>
							</div>
						</li>
					</s:iterator>
				</ul>
			</div>
		</div>
		<!-- second_book_list end -->
		<!-- End: PRODUCT LIST -->
	</div>
	<!-- End: MAIN CONTENT -->

	<s:include value="basic_resource/footer.jsp"></s:include>
</body>
</html>
