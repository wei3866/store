<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家店铺</title>
<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
     <!-- 标题 -->
     <div class="row">
       <div class="col-md-12">
         <h1>商家店铺</h1>
       </div>
     </div>
     <div class="main">
		<div class="col-md-4 col-md-offset-8">
		<div class="right" id="curentuser">
			请 <a href="" onclick="">登录 </a>&nbsp;&nbsp;
			  <a href="">免费注册</a>&nbsp;&nbsp;
			  <a href="" onclick="">我的订单</a>&nbsp;&nbsp;
			  <a href="" onclick="">卖家中心</a>&nbsp;&nbsp;
			  <a href="" onclick="">联系客服</a>&nbsp;&nbsp;
			  <a href="">退出登录</a>&nbsp;&nbsp;
              <a href="${APP_PATH }/index.jsp">返回首页</a>			  
         </div>
         </div>
	  </div> 
 </div>

</body>
</html>