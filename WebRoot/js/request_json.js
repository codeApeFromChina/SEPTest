
$(document).ready(
		
		function() {
			var i = 1;
			var requestType = $("#requestType").text().trim();
			$(window).scrollTop(0);
			$(".chose-iterm").click(function(){
				
				});
			$(window).scroll(
					function() {

						if ($(window).scrollTop() >= $(document).height()
								- $(window).innerHeight() - 20) {
							$.ajax({
								async: false,
								url : "jsonAction_nextPage.action?requestType=" + requestType + "&pageNum=" + i,
								success : function(data) {
									
									if (0 != data.result.displayList){
									
									iterms = data.result.displayList;
									
									var len = iterms.length;
									
										
									for(var k = 0; k < len ; k ++){
										diterm = iterms[k];
										
										var iterm = $("<div></div>")
										.attr({
											"class":"span5",
											"style":"margin:20px"
										});
										
										iterm.append ($("<h2></h2>").text (diterm.name));
										
										iterm.append ($("<img></image>").attr("src","/sshDemo/images/" + diterm.imageName));
										iterm.append ($("<p></p>").text(diterm.description));
										var tmp = ($("<p></p>"));
										
										tmp.append ($("<a>View details »</a>").attr(
												{
													"href":"displayAction_showIterm.action?itermId="+diterm.id,
													"class":"btn",
													
												}
										));
										iterm.append(tmp);
									
										$("#iterm-container").append (iterm);
									} 
									
									}
									else {
//										alert("no result ~~");
										$(window).unbind ("scroll");
									}
//									alert("success");
								}

							});

							i++;
						}
					});

		
			}
		

);