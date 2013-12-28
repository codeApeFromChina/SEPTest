
$(document).ready(
		
		function() {
			var i = 0;
			$(window).scrollTop(0);
			$(window).scroll(
					function() {

						

						if ($(window).scrollTop() >= $(document).height()
								- $(window).innerHeight() - 20) {
							$.ajax({
								url : "jsonAction_nextPage.action",
								success : function(data) {
									iterms = data.result.displayList;
									var len = iterms.length;
									for(var k = 0; k < len ; k ++){
										diterm = iterms[k];
										
										var iterm = $("<div></div>").attr({
											"class":"span5",
											"style":"margin:20px"
										});
										if (k % 2 ==0){
											iterm.css("margin-left", "0px");
										}
										
										iterm.append ($("<h2></h2>").text (diterm.name));
										
										iterm.append ($("<img></image>").attr("src","/sshDemo/images/" + diterm.imageName));
										iterm.append ($("<p></p>").text(diterm.description));
										var tmp = ($("<p></p>"));
										
										tmp.append ($("<a>View details »</a>").attr(
												{
													"href":"displayAction_showIterm.action?itermId=",
													"class":"btn",
													
												}
										));
										iterm.append(tmp);
									
										$("#iterm-container").append (iterm);
										/*
										 */
									} 
									
//									alert("success");
								}

							});

							i++;

						}
					});

		
			}
		

);