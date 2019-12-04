<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="/knowledgeTesting/static/css/bootstrap.css" rel="stylesheet">
<link type="text/css" href="/knowledgeTesting/static/css/zzsc.css" rel="stylesheet">
<script type="text/javascript" src="/knowledgeTesting/static/js/jQuery.js"></script>
<script type="text/javascript" src="/knowledgeTesting/static/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<br/><br/>
	<h1 align="center" style="color:#000;">语言知识答题结果</h1>
	<br/><br/>
	<h2 align="center" style="color:#000;">正确率：${requestScope.probability}%</h2>
	
	<div class="demo01" style="position:fixed;right:60px;bottom:0;_position:absolute;_top:expression(document.documentElement.clientHeight + document.documentElement.scrollTop - this.offsetHeight);">
					<div class="container">
						<div class="row">
							<div class="col-md-12">
								<div class="navbar"><label style="position:fixed;right:105px;">主菜单</label>
									<ul class="menu">
										
										<li><a href="medicine" >医药</a></li>
										<li><a href="finance" >财经</a></li>
										<li><a href="technology" >科技</a></li>
										<li><a href="language" >语言</a></li>
										<li><a href="sports" >体育</a></li>
										<li><a href="society" >社会</a></li>
										<li><a href="comprehensive" >综合</a></li>
										<li><a href="systerm" >系统</a></li>
										<li><a href="update" ></a></li>
										
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
	
</body>
</html>