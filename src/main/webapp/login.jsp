<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.9.1.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
	
	$(function(){
	
		$(".btn-block").click(function(){
			
			var number = $(".inputNumber").val();
			var regName = /(^[0-9]{11}$)/;
			
			if (!regName.test(number)) {
				show_validate_msg(".inputNumber", "error","用户名错误!");
				return false;
			} else {
				show_validate_msg(".inputNumber", "success", "");
			}
			
			var inputNumber = number;
			var inputPassword = $(".inputPassword").val();
			
			$.ajax({
				url:"${APP_PATH }/inputLogin",
				type:"POST",
				data: "inputNumber="+inputNumber+"&inputPassword="+inputPassword,
				success: function (result) {
					alert(result.msg);
					if (result.code == 100) {
						alert("登录成功!")
						window.location.replace("user");
					}else{
						show_validate_msg(".inputPassword", "error","密码错误!");
					}
				}
			})
		})
		
		//显示校验结果的提示信息
		function show_validate_msg(ele, status, msg) {
			//清除当前元素的校验状态
			$(ele).parent().removeClass("has-success has-error");
			$(ele).next("span").text("");
	
			if ("success" == status) {
				$(ele).parent().addClass("has-success");
				$(ele).next("span").text(msg);
			} else if ("error" == status) {
				$(ele).parent().addClass("has-error");
				$(ele).next("span").text(msg);
			}
		}

	})
</script>
</head>
<body>
<center>
<br>
<br>
<br>
<br>
  	<div class="container">

      <form class="form-signin">
        <h2 class="form-signin-heading">请登录</h2>
        <br>
        <div class="row">
        	<div class="col-md-6 col-md-offset-3">
        		<input type="text" name="inputNumber" class="form-control inputNumber" placeholder="请输入手机号">
        		<span class="help-block"></span>
        	</div>
        </div>
        <br>
        <div class="row">
        	<div class="col-md-6 col-md-offset-3">
        		<input type="password" name="inputPassword" class="form-control inputPassword" placeholder="密码">
        		<span class="help-block"></span>
        	</div>
        </div>
        
        <div class="row">
        	<div class="col-md-6 col-md-offset-3">
        		<a>忘记密码</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        					  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        					  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        					  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        		<a>注册账号</a>
     		</div>
     	</div>
     	
        <div class="row">
        	<div class="col-md-6 col-md-offset-3">
        		<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
     		</div>
     	</div>
      </form>

    </div>
</center>

</body>
</html>
