<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>宝贝详情页</title>
<%
   pageContext.setAttribute("APP_PATH",request.getContextPath());
%>

<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>
 
   <center>
   
      <br><br>
                店铺名: ${commodity.cMerchantId.merName }
      <br><br>
                宝贝名: ${commodity.cName }
      <br><br>
                宝贝归类: ${commodity.cTypeA }
      <br><br>
                宝贝类型: ${commodity.cTypeB }
      <br><br>
               宝贝价格: ${commodity.cPrice }
      <br><br>
               上架时间: ${commodity.cPutaway }
      <br><br>
      
      <a href="">加入购物车</a>
      <a href="">继续购物</a>
      
   </center>
   
</body>
</html>