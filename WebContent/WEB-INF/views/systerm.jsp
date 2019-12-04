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
		<div class="col-xs-6 col-md-2"></div>
			<div class="col-xs-6 col-md-8">
			<br/><br/>
			<h1 style="text-align: center;font-size:50px; ">系统管理</h1>
			<br/><br/><br/><br/>
				<div class="bs-example" data-example-id="thumbnails-with-custom-content">	
    				<div class="row">
							<div class="col-sm-6 col-md-6">
							<br/>
								<label style="font-size:20px;">题目类型：</label>
								<select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}' style="width:400px;">
									<option value="medicinetable">医药</option>
									<option value="finance">财经</option>
									<option value="technology">科技</option>
									<option value="language">语言</option>
									<option value="sports">体育</option>
									<option value="society">社会</option>
									<option value="comprehensive">综合</option>
								</select>
								<br/>
								<div>
									<label style="font-size:20px;">题目ID：&nbsp;&nbsp;&nbsp;</label>
								  	<input type="text" style="width:402px" id="questionID">
								</div>
								<br/><br/>
								<button type="button" class="btn btn-default" style="font-size: 20px; width:503px;" onclick="serch()">搜&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;索</button>
							</div>
							
							
						        <div style="border: 4px solid #add1f6; width:580px;background-color: #fcfcfc;box-shadow: 2px 3px 5px 1px #c9c68f;" id="serch" >
							        
							        <br/>
								        <label>题目：</label><span class="question"></span><br/><br/>
								        <label>A&nbsp;：</label><input type="text" name="answerA" style="width:500px" id="answerA"><br/><br/>
								        <label>B&nbsp;：</label><input type="text" name="answerB" style="width:500px" id="answerB"><br/><br/>
								        <label>C&nbsp;：</label><input type="text" name="answerC" style="width:500px" id="answerC"><br/><br/>
								        <label>D&nbsp;：</label><input type="text" name="answerD" style="width:500px" id="answerD"><br/><br/>
								        <label>answer：</label><input type="text" name="answer" style="width:463px" id="answer"><br/><br/>
								        <div style="text-align:center">
								        	<button class="btn btn-default" style="width:450px" onclick="btn()">修改</button>
								        </div>
								        
							        
							        
						        </div>
						      
				
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
										<li><a href="#" >系统</a></li>
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