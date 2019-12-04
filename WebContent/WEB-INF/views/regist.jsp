<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="/knowledgeTesting/static/css/bootstrap.css" rel="stylesheet">

<script type="text/javascript" src="/knowledgeTesting/static/js/jQuery.js"></script>
<script type="text/javascript" src="/knowledgeTesting/static/js/myjs/regist.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="row">
		<div class="col-xs-6 col-md-2"></div>
			<div class="col-xs-6 col-md-8">
			<br/><br/>
			<h1>新用户注册</h1><br><br>
			
			<form action="regist" method="POST">
			账号：<input type="text" style="width:402px;" id="name" name="name" value="请输入用户名"><br><br>
			密码：<input type="text" style="width:402px;" id="pwd" name="pwd" value="请输入密码"><br><br>
			<button class="btn btn-primary" style="width:452px;" onclick="regist()" >注册</button>
			</form>
			</div>
				
				
    	<div class="col-xs-6 col-md-2">
    	
	    	
    	
    	</div>
  </div>
</body>
</html>