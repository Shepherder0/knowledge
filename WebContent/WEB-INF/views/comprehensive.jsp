<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link type="text/css" href="/knowledgeTesting/static/css/bootstrap.css" rel="stylesheet">
<link type="text/css" href="/knowledgeTesting/static/css/custom.css" rel="stylesheet">
<link type="text/css" href="/knowledgeTesting/static/css/zzsc.css" rel="stylesheet">
<link type="text/css" href="/knowledgeTesting/static/skins/all.css" rel="stylesheet">
<script type="text/javascript" src="/knowledgeTesting/static/js/jQuery.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="row">
		<div class="col-xs-6 col-md-2"></div>
			<div class="col-xs-6 col-md-8">
				<div class="demo-holder" >
					<br />
					<br />
					<h1 class="demo-title" style="text-align: center; color:#000;">综&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;合</h1>
					
					<div class="demo-list clear" style="margin: auto;border: solid 2px #D3D9DF;background-color: #F7F7F7;box-shadow: 0 0 15px #86CFDA; ">
						<form action="" class="demo" >
							<!-- 接收后台数据并显示题目 -->
								
								
						</form>
						<button class="btn btn-primary" role="button" id="submit">确认</button>
						
						<br>
					</div>
				</div>
			</div>
    	<div class="col-xs-6 col-md-2">
    	
    	<div style="position:absolute;right:50px; font-size:20px;">
    	
    	<c:if test="${!empty sessionScope.user}">
    	欢迎&nbsp;${sessionScope.user.uName}
    	</c:if>
    	<c:if test="${!empty sessionScope.manager}">
    		欢迎&nbsp;${sessionScope.manager.mName}
    	</c:if>
    	<a href="logout" style="color:#red;">退出</a>
    	
    	</div>
    	
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
										<li><a href="update" >更新</a></li>
										
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
    	
    	
    	</div>
  </div>



</body>

<script type="text/javascript" src="/knowledgeTesting/static/js/myjs/comprehensive.js"></script>
<script type="text/javascript" src="/knowledgeTesting/static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/knowledgeTesting/static/js/icheck.js"></script>
<script type="text/javascript" src="/knowledgeTesting/static/js/custom.min.js"></script>

</html>
