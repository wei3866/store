<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
</head>
<body>


<a href="${APP_PATH }/records">客户查看订单</a>
<a href="${APP_PATH }/sjRecords">商家查看订单</a>
<a href="${APP_PATH }/sjzxs">卖家中心</a>
  

</body>
</html>
    
