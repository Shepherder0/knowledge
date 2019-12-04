<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/knowledgeTesting/static/js/jQuery.js"></script>
<script type="text/javascript" src="/knowledgeTesting/static/js/bootstrap.min.js"></script>
<link type="text/css" href="/knowledgeTesting/static/css/bootstrap.css" rel="stylesheet">

<title>百科知识检测系统</title>
</head>
<body>

<div class="row">
  <div class="col-xs-6 col-md-2">
  </div>
  <div class="col-xs-6 col-md-8">
  <h1 align="center">百科知识测验系统</h1><br/>
	<div class="bs-example" data-example-id="thumbnails-with-custom-content">
    <div class="row">
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail" style="border: solid 2px #D3D9DF; background-color: #F7F7F7; box-shadow: 0 0 15px #86CFDA;">
	        <div align="center">
	        	<img src="/knowledgeTesting/static/images/medicine.jpg" alt="Generic placeholder thumbnail">
	        </div>
          <div class="caption">
            <h3 align="center">医药</h3>
            <p align="center">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p align="center"><a href="medicine" class="btn btn-primary" role="button">进行测试</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail" style="border: solid 2px #D3D9DF; background-color: #F7F7F7; box-shadow: 0 0 15px #86CFDA;">
        	<div align="center">
				 <img src="/knowledgeTesting/static/images/finace.jpg" alt="Generic placeholder thumbnail">
	        </div>
         
          <div class="caption">
            <h3 align="center">财经</h3>
            <p align="center">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p align="center"><a href="finance" class="btn btn-primary" role="button">进行测试</a> </p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail" style="border: solid 2px #D3D9DF; background-color: #F7F7F7; box-shadow: 0 0 15px #86CFDA;">
        	<div align="center">
         		<img src="/knowledgeTesting/static/images/technology.jpg" alt="Generic placeholder thumbnail">
	        </div>
          <div class="caption">
            <h3 align="center">科技</h3>
            <p align="center">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p align="center"><a href="technology" class="btn btn-primary" role="button">进行测试</a> </p>
          </div>
        </div>
        <br/><br/>
      </div>
      
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail" style="border: solid 2px #D3D9DF; background-color: #F7F7F7; box-shadow: 0 0 15px #86CFDA;">
	        <div align="center">
	        	<img src="/knowledgeTesting/static/images/language.jpg" alt="Generic placeholder thumbnail">
	        </div>
          <div class="caption">
            <h3 align="center">语言</h3>
            <p align="center">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p align="center"><a href="language" class="btn btn-primary" role="button">进行测试</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail" style="border: solid 2px #D3D9DF; background-color: #F7F7F7; box-shadow: 0 0 15px #86CFDA;">
        	<div align="center">
				 <img src="/knowledgeTesting/static/images/sports.jpg" alt="Generic placeholder thumbnail">
	        </div>
         
          <div class="caption">
            <h3 align="center">体育</h3>
            <p align="center">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p align="center"><a href="sports" class="btn btn-primary" role="button">进行测试</a> </p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail" style="border: solid 2px #D3D9DF; background-color: #F7F7F7; box-shadow: 0 0 15px #86CFDA;">
        	<div align="center">
         		<img src="/knowledgeTesting/static/images/society.jpg" alt="Generic placeholder thumbnail">
	        </div>
          <div class="caption">
            <h3 align="center">社会</h3>
            <p align="center">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p align="center"><a href="society" class="btn btn-primary" role="button">进行测试</a> </p>
          </div>
        </div>
        <br/><br/>
      </div>
      
	  <div class="col-sm-6 col-md-4">
        <div class="thumbnail" style="border: solid 2px #D3D9DF; background-color: #F7F7F7; box-shadow: 0 0 15px #86CFDA;">
        	<div align="center">
         		<img src="/knowledgeTesting/static/images/comprehensive.jpg" alt="Generic placeholder thumbnail">
	        </div>
          <div class="caption">
            <h3 align="center">综合</h3>
            <p align="center">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p align="center"><a href="comprehensive" class="btn btn-primary" role="button">进行测试</a> </p>
          </div>
        </div>
      </div>
      
      <div class="col-sm-6 col-md-4">
        
        <div style="position:absolute;right:50px; font-size:20px;">
        </div>
      </div>
      
      <div class="col-sm-6 col-md-4">
      
      <div style="position:absolute;right:50px; font-size:20px;">
        <div class="thumbnail" style="border: solid 2px #D3D9DF; background-color: #F7F7F7; box-shadow: 0 0 15px #86CFDA;">
        	<div align="center">
         		<img src="/knowledgeTesting/static/images/comprehensive.jpg" alt="Generic placeholder thumbnail">
	        </div>
          <div class="caption">
            <h3 align="center">系统管理</h3>
            <p align="center">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p align="center"><a href="systerm" class="btn btn-primary" role="button">进行测试</a> </p>
          </div>
        </div>
      </div>
      </div>
	  </div>
	  </div>

</div>

<div class="col-xs-6 col-md-2">
	<div style="position:absolute;right:50px; font-size:20px;">
    	
    	<c:if test="${!empty sessionScope.user}">
    	欢迎&nbsp;<a href="score">${sessionScope.user.uName}</a>
    	</c:if>
    	<c:if test="${!empty sessionScope.manager}">
    		欢迎&nbsp;<a href="score">${sessionScope.manager.mName}</a>
    	</c:if>
    	<a href="logout" style="color:#red;">退出</a>
    	
    	</div>
</div>
  </div>



</body>
</html>