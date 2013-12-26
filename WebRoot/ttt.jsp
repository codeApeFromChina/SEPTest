<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8" />
<style>
.includeitem {
	padding: 10px;
	color: #ccc;
}

.more {
	color: #E3E3E3;
}

body {
	background: #202020;
}

h1 {
	color: #fff;
}
</style>
<script src="js/jquery-1.6.1.js"></script>

</head>
<body>

	<div id="adsbox" style="z-index: 10000">
		<div class="ads">
			<div class="adsborder">
				<script type="text/javascript">
				<!--
					google_ad_client = "ca-pub-4879975111677652";
					/* gbin1content */
					google_ad_slot = "1026207602";
					google_ad_width = 336;
					google_ad_height = 280;
				//-->
				</script>
				<script type="text/javascript"
					src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
					
				</script>

			</div>
		</div>
		<div id="ads_aplink">GBi n1 ads</div>
		<a id="ads_close" href="" title="关闭广告"></a>
	</div>


	<section>

		<h1>Infinite Scroll Demo</h1>
		<div id="container">
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
			<div class="includeitem">www.gbin1.com</div>
		</div>

		<div id="next">
			<a href="/Pic/randpage?page=2"></a>
		</div>


		<script src="js/jquery.infinitescroll.js"></script>

		<script>
			$('#container').infinitescroll({
				navSelector : "#next",
				nextSelector : "#next:last",
				itemSelector : ".includeitem",
				finishedMsg : "fukc it"
			});
		</script>

	</section>


	<footer style="font-size:14px;font-family:Arial">
		<h2>Infinite demo</h2>
		<a class="gbin1" href="index.html" id="article"> <i> <b>GBin1.com</b>
		</i> 返回文章 - 下载演示代码 </a>
	</footer>

	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$('#ads_close').click(function(e) {
				$('#adsbox').fadeOut();
				e.preventDefault();
			});
		});

		jQuery(document).ready(function($) {
			var articlelink = $('#articlelink').attr('content');
			console.log('LOG' + articlelink);
			if (articlelink != undefined) {
				$('#article').attr('href', articlelink);
			}
		});
	</script>

	<!-- google and baidu code -->
	<script type="text/javascript">
		var _gaq = _gaq || [];
		_gaq.push([ '_setAccount', 'UA-19118450-1' ]);
		_gaq.push([ '_trackPageview' ]);
		(function() {
			var ga = document.createElement('script');
			ga.type = 'text/javascript';
			ga.async = true;
			ga.src = ('https:' == document.location.protocol ? 'https://ssl'
					: 'http://www')
					+ '.google-analytics.com/ga.js';
			var s = document.getElementsByTagName('script')[0];
			s.parentNode.insertBefore(ga, s);
		})();
	</script>
	<script type="text/javascript">
		var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://"
				: " http://");
		document
				.write(unescape("%3Cscript src='"
						+ _bdhmProtocol
						+ "hm.baidu.com/h.js%3Fd999331ad5ea0c0930f3aa7c3bda9fc1' type='text/javascript'%3E%3C/script%3E"));
	</script>
	<!-- end of google and baidu code -->
</body>
</html>