<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
<base href="<%=basePath%>">

<title>首页</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet"
	href="<%=basePath%>/assets/css/font-awesome.min.css" />
<link rel="stylesheet" href="<%=basePath%>/assets/css/ace.min.css" />
<link rel="stylesheet" href="<%=basePath%>/assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="<%=basePath%>/assets/css/ace-skins.min.css" />
<script src="<%=basePath%>/assets/js/ace-extra.min.js"></script>
<script src="<%=basePath%>/assets/jquery.min.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div class="navbar navbar-default" id="navbar">
		<script type="text/javascript">
			try {
				ace.settings.check('navbar', 'fixed')
			} catch (e) {
			}
		</script>

		<div class="navbar-container" id="navbar-container">
			<div class="navbar-header pull-left">
				<a href="#" class="navbar-brand"> <small> <i
						class="icon-leaf"></i> 北风网教务管理系统
				</small>
				</a>
				<!-- /.brand -->
			</div>
			<!-- /.navbar-header -->

			<div class="navbar-header pull-right" role="navigation"
				style="height:50px">
				<ul class="nav ace-nav">


					<li class="light-blue"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"> <span class="user-info"> <small>欢迎光临</small>
						</span> <i class="icon-caret-down"></i>
					</a>
						<ul
							class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">

							<li><a href="#" target="mainframe"> <i class="icon-user"></i>
									个人资料
							</a></li>

							<li class="divider"></li>

							<li><a href="login.html"> <i class="icon-off"></i> 退出
							</a></li>
						</ul></li>
				</ul>
				<!-- /.ace-nav -->
			</div>
			<!-- /.navbar-header -->
		</div>
		<!-- /.container -->
	</div>

	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>

		<div class="main-container-inner">
			<a class="menu-toggler" id="menu-toggler" href="#"> <span
				class="menu-text"></span>
			</a>

			<div class="sidebar" id="sidebar">
				<script type="text/javascript">
					try {
						ace.settings.check('sidebar', 'fixed')
					} catch (e) {
					}
				</script>


				<!-- #sidebar-shortcuts -->

				<ul class="nav nav-list">
					<li class="active"><a href="findAllNotices.action"
						target="mainframe"> <i class="icon-dashboard"></i> <span
							class="menu-text"> 我的主页 </span>
					</a></li>

					<li><a href="javascript:void(0)" target="mainframe"
						class="dropdown-toggle"> <i class="icon-desktop"></i> <span
							class="menu-text"> 班级管理 </span> <b class="arrow icon-angle-down"></b>
					</a>

						<ul class="submenu">
							<li><a href="view/system/staffinfo/staffinfo_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									班级信息
							</a></li>
							<li><a href="view/system/staffinfo/staffinfo_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									新增班级
							</a></li>
							<li><a href="view/system/roleinfo/roleinfo_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									删除班级
							</a></li>
							<li><a href="view/system/roleinfo/staffinfo_role_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									班级信息更改
							</a></li>

						</ul></li>
					<li><a href="javascript:void(0)" target="mainframe"
						class="dropdown-toggle"> <i class="icon-desktop"></i> <span
							class="menu-text"> 教师管理 </span> <b class="arrow icon-angle-down"></b>
					</a>

						<ul class="submenu">

							<li><a href="view/marketactive/template/template_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									教师考勤
							</a></li>
							<li><a
								href="view/marketactive/messafeinfo/messafeinfo_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									教师注册
							</a></li>
							<li><a
								href="view/marketactive/emailinfo/emailinfo_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									离职处理
							</a></li>
							<li><a
								href="view/marketactive/emailinfo/emailinfo_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									评价管理
							</a></li>
						</ul></li>
					<li><a href="javascript:void(0)" target="mainframe"
						class="dropdown-toggle"> <i class="icon-desktop"></i> <span
							class="menu-text"> 学生管理 </span> <b class="arrow icon-angle-down"></b>
					</a>

						<ul class="submenu">
							<li><a href="student/studentlist.action" target="mainframe">
									<i class="icon-double-angle-right"></i> 查看所有学员
							</a></li>
							<li><a href="student/addstudent.action" target="mainframe">
									<i class="icon-double-angle-right"></i> 学员注册
							</a></li>
							<li><a href="student/student.action" target="mainframe">
									<i class="icon-double-angle-right"></i> 查看学员信息
							</a></li>

						</ul></li>


					<li><a href="javascript:void(0)" target="mainframe"
						class="dropdown-toggle"> <i class="icon-desktop"></i> <span
							class="menu-text"> 布告 </span> <b class="arrow icon-angle-down"></b>
					</a>

						<ul class="submenu">
							<li><a href="marketAct/activities.action" target="mainframe">
									<i class="icon-double-angle-right"></i>
									 营销活动
							</a></li>
							<li><a href="marketAct/addActivity.action"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									添加活动
							</a></li>
							<li><a href=""
								target="mainframe"> <i class="icon-double-angle-right"></i>
									删除活动
							</a></li>
							<li><a href="marketAct/updateActivity.action"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									修改活动
							</a></li>
							<li><a href="informalStu/selectStu.action"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									生源信息
							</a></li>
							<li><a href="informalStu/addStu.action"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									添加学生
							</a></li>
							<li><a href=""
								target="mainframe"> <i class="icon-double-angle-right"></i>
									修改学生信息
							</a></li>
							<li><a href=""
								target="mainframe"> <i class="icon-double-angle-right"></i>
									删除学生信息
							</a></li>

							<li><a href="view/student/evaluationinfo/evaluationinfo_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									进度跟踪
							</a></li>

						</ul></li>

					<li><a href="javascript:void(0)" target="mainframe"
						class="dropdown-toggle"> <i class="icon-desktop"></i> <span
							class="menu-text"> 投诉建议 </span> <b class="arrow icon-angle-down"></b>
					</a>

						<ul class="submenu">
							<li><a href="view/student/student/student_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									班级事务
							</a></li>
							<li><a
								href="view/student/evaluationinfo/evaluationinfo_list.html"
								target="mainframe"> <i class="icon-double-angle-right"></i>
									学员考勤
							</a></li>

						</ul>
				</ul>
				<!-- /.nav-list -->

				<div class="sidebar-collapse" id="sidebar-collapse">
					<i class="icon-double-angle-left"
						data-icon1="icon-double-angle-left"
						data-icon2="icon-double-angle-right"></i>
				</div>

				<script type="text/javascript">
					try {
						ace.settings.check('sidebar', 'collapsed')
					} catch (e) {
					}
				</script>
			</div>

			<div class="main-content" id="mains">
				<iframe id="mainframe" name="mainframe" src="bootm.html"
					style="width: 100%;border: 0px;"> </iframe>
			</div>

			<script type="text/javascript">
				var height = jQuery(window).height();
				jQuery("#mainframe").attr("height", "" + height + "px;");
			</script>


			<!-- /#ace-settings-container -->
		</div>
		<!-- /.main-container-inner -->

		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="icon-double-angle-up icon-only bigger-110"></i>
		</a>
	</div>
	<!-- /.main-container -->
	<!-- basic scripts -->




	<script type="text/javascript">
		if ("ontouchend" in document)
			document
					.write("<script src='assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"script>");
	</script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/typeahead-bs2.min.js"></script>

	<!-- page specific plugin scripts -->

	<!--[if lte IE 8]>
		  <script src="assets/js/excanvas.min.js"></script>
		<![endif]-->

	<script src="assets/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="assets/js/jquery.ui.touch-punch.min.js"></script>
	<script src="assets/js/jquery.slimscroll.min.js"></script>
	<script src="assets/js/jquery.easy-pie-chart.min.js"></script>
	<script src="assets/js/jquery.sparkline.min.js"></script>
	<script src="assets/js/flot/jquery.flot.min.js"></script>
	<script src="assets/js/flot/jquery.flot.pie.min.js"></script>
	<script src="assets/js/flot/jquery.flot.resize.min.js"></script>

	<!-- ace scripts -->

	<script src="assets/js/ace-elements.min.js"></script>
	<script src="assets/js/ace.min.js"></script>

	<!-- inline scripts related to this page -->

	<script type="text/javascript">
		jQuery(function($) {
			$('.easy-pie-chart.percentage')
					.each(
							function() {
								var $box = $(this).closest('.infobox');
								var barColor = $(this).data('color')
										|| (!$box.hasClass('infobox-dark') ? $box
												.css('color')
												: 'rgba(255,255,255,0.95)');
								var trackColor = barColor == 'rgba(255,255,255,0.95)' ? 'rgba(255,255,255,0.25)'
										: '#E2E2E2';
								var size = parseInt($(this).data('size')) || 50;
								$(this)
										.easyPieChart(
												{
													barColor : barColor,
													trackColor : trackColor,
													scaleColor : false,
													lineCap : 'butt',
													lineWidth : parseInt(size / 10),
													animate : /msie\s*(8|7|6)/
															.test(navigator.userAgent
																	.toLowerCase()) ? false
															: 1000,
													size : size
												});
							})

			$('.sparkline').each(
					function() {
						var $box = $(this).closest('.infobox');
						var barColor = !$box.hasClass('infobox-dark') ? $box
								.css('color') : '#FFF';
						$(this).sparkline('html', {
							tagValuesAttribute : 'data-values',
							type : 'bar',
							barColor : barColor,
							chartRangeMin : $(this).data('min') || 0
						});
					});

			var placeholder = $('#piechart-placeholder').css({
				'width' : '90%',
				'min-height' : '150px'
			});
			var data = [ {
				label : "social networks",
				data : 38.7,
				color : "#68BC31"
			}, {
				label : "search engines",
				data : 24.5,
				color : "#2091CF"
			}, {
				label : "ad campaigns",
				data : 8.2,
				color : "#AF4E96"
			}, {
				label : "direct traffic",
				data : 18.6,
				color : "#DA5430"
			}, {
				label : "other",
				data : 10,
				color : "#FEE074"
			} ]
			function drawPieChart(placeholder, data, position) {
				$.plot(placeholder, data, {
					series : {
						pie : {
							show : true,
							tilt : 0.8,
							highlight : {
								opacity : 0.25
							},
							stroke : {
								color : '#fff',
								width : 2
							},
							startAngle : 2
						}
					},
					legend : {
						show : true,
						position : position || "ne",
						labelBoxBorderColor : null,
						margin : [ -30, 15 ]
					},
					grid : {
						hoverable : true,
						clickable : true
					}
				})
			}
			drawPieChart(placeholder, data);

			/**
			we saved the drawing function and the data to redraw with different position later when switching to RTL mode dynamically
			so that's not needed actually.
			 */
			placeholder.data('chart', data);
			placeholder.data('draw', drawPieChart);

			var $tooltip = $(
					"<div class='tooltip top in'><div class='tooltip-inner'></div></div>")
					.hide().appendTo('body');
			var previousPoint = null;

			placeholder.on('plothover', function(event, pos, item) {
				if (item) {
					if (previousPoint != item.seriesIndex) {
						previousPoint = item.seriesIndex;
						var tip = item.series['label'] + " : "
								+ item.series['percent'] + '%';
						$tooltip.show().children(0).text(tip);
					}
					$tooltip.css({
						top : pos.pageY + 10,
						left : pos.pageX + 10
					});
				} else {
					$tooltip.hide();
					previousPoint = null;
				}

			});

			var d1 = [];
			for (var i = 0; i < Math.PI * 2; i += 0.5) {
				d1.push([ i, Math.sin(i) ]);
			}

			var d2 = [];
			for (var i = 0; i < Math.PI * 2; i += 0.5) {
				d2.push([ i, Math.cos(i) ]);
			}

			var d3 = [];
			for (var i = 0; i < Math.PI * 2; i += 0.2) {
				d3.push([ i, Math.tan(i) ]);
			}

			var sales_charts = $('#sales-charts').css({
				'width' : '100%',
				'height' : '220px'
			});
			$.plot("#sales-charts", [ {
				label : "Domains",
				data : d1
			}, {
				label : "Hosting",
				data : d2
			}, {
				label : "Services",
				data : d3
			} ], {
				hoverable : true,
				shadowSize : 0,
				series : {
					lines : {
						show : true
					},
					points : {
						show : true
					}
				},
				xaxis : {
					tickLength : 0
				},
				yaxis : {
					ticks : 10,
					min : -2,
					max : 2,
					tickDecimals : 3
				},
				grid : {
					backgroundColor : {
						colors : [ "#fff", "#fff" ]
					},
					borderWidth : 1,
					borderColor : '#555'
				}
			});

			$('#recent-box [data-rel="tooltip"]').tooltip({
				placement : tooltip_placement
			});
			function tooltip_placement(context, source) {
				var $source = $(source);
				var $parent = $source.closest('.tab-content')
				var off1 = $parent.offset();
				var w1 = $parent.width();

				var off2 = $source.offset();
				var w2 = $source.width();

				if (parseInt(off2.left) < parseInt(off1.left)
						+ parseInt(w1 / 2))
					return 'right';
				return 'left';
			}

			$('.dialogs,.comments').slimScroll({
				height : '300px'
			});

			//Android's default browser somehow is confused when tapping on label which will lead to dragging the task
			//so disable dragging when clicking on label
			var agent = navigator.userAgent.toLowerCase();
			if ("ontouchstart" in document && /applewebkit/.test(agent)
					&& /android/.test(agent))
				$('#tasks').on('touchstart', function(e) {
					var li = $(e.target).closest('#tasks li');
					if (li.length == 0)
						return;
					var label = li.find('label.inline').get(0);
					if (label == e.target || $.contains(label, e.target))
						e.stopImmediatePropagation();
				});

			$('#tasks').sortable({
				opacity : 0.8,
				revert : true,
				forceHelperSize : true,
				placeholder : 'draggable-placeholder',
				forcePlaceholderSize : true,
				tolerance : 'pointer',
				stop : function(event, ui) {//just for Chrome!!!! so that dropdowns on items don't appear below other items after being moved
					$(ui.item).css('z-index', 'auto');
				}
			});
			$('#tasks').disableSelection();
			$('#tasks input:checkbox').removeAttr('checked').on('click',
					function() {
						if (this.checked)
							$(this).closest('li').addClass('selected');
						else
							$(this).closest('li').removeClass('selected');
					});

		})
	</script>
</body>
</html>
