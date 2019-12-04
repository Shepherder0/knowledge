<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link type="text/css" href="/knowledgeTesting/static/css/bootstrap.css" rel="stylesheet">
<link type="text/css" href="/knowledgeTesting/static/css/custom.css" rel="stylesheet">
<link type="text/css" href="/knowledgeTesting/static/css/zzsc.css" rel="stylesheet">
<link type="text/css" href="/knowledgeTesting/static/css/demo.css" rel="stylesheet">
<link type="text/css" href="/knowledgeTesting/static/css/easydropdown.css" rel="stylesheet">
<script type="text/javascript" src="/knowledgeTesting/static/js/jquery.easydropdown.js"></script>
<script type="text/javascript" src="/knowledgeTesting/static/js/jQuery.js"></script>
<script type="text/javascript" src="/knowledgeTesting/static/js//myjs/systerm.js"></script>
<title>Insert title here</title>
</head>
<body>

<div class="row">
		<div class="col-xs-6 col-md-3"></div>
			<div class="col-xs-6 col-md-6">
			<br/><br/>
			<h1 style="text-align: center;font-size:50px; ">题库更新</h1>
			<br/><br/><br/><br/>
				
				<a href="down" style="font-size:23px;">百科知识题库模板</a><br/><br/>
				<br/>
				
				<form method="post" action="" enctype="multipart/form-data">
				    选择一个文件:
				    <input type="file" name="uploadFile" id=""  />
				    <br/><br/>
				    <input type="submit" value="上传" class="btn btn-default" style="width:150px;"/>
				</form>
			</div>
				
				
    	<div class="col-xs-6 col-md-3">
    	
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

<script type="text/javascript" src="/knowledgeTesting/static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/knowledgeTesting/static/js/custom.min.js"></script>
</body>
</html>