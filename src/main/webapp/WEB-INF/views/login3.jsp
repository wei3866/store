<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册账号</title>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.9.1.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<a href="login">返回</a>
<center>
<br>
<br>
<br>
<br>
  	<div class="container">
      <form class="form-signin">
        <h2 class="form-signin-heading">注册账号</h2>
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
        
        <br>
        
        <div class="row">
        	<div class="col-md-6 col-md-offset-3">
        		<input type="password" name="inputPassword2" class="form-control inputPassword2" placeholder="确认密码">
        		<span class="help-block"></span>
        	</div>
        </div>
        
        <br>
        
        <div class="row">
        	<div class="col-md-6 col-md-offset-3">
        		<input type="password" name="passwordEncrypted" class="form-control passwordEncrypted" placeholder="密保">
        		<span class="help-block"></span>
        	</div>
        </div>
        
        <br>
        
        <div class="row">
		    <div class="col-md-6 col-md-offset-3">
		      <input id="checks" class="form-control verification_code" type="text" style="width:300px;" placeholder="验证码"/>
		      <img id="imgVerify" src="${APP_PATH }/ValidateColorServlet" alt="点击更换验证码" />
		    </div>
		</div>
		
        <br>
        
        <div class="row">
        	<div class="col-md-6 col-md-offset-3">
        		<button class="btn btn-lg btn-primary btn-block btn_submit">注册</button>
     		</div>
     	</div>
     	
      </form>

    </div>
</center>
<script type="text/javascript">
		
		//校验账号
		$(".inputNumber").change(function(){
			input_Number();
		})
		
		function input_Number(){
			var number = $.trim($(".inputNumber").val());
			var regName = /(^[0-9]{11}$)/;
			
			if (!regName.test(number)) {
				show_validate_msg(".inputNumber", "error","账号错误!");
				return false;
			} else {
				show_validate_msg(".inputNumber", "success", "");
			}
			
			$.ajax({
				url:"${APP_PATH}/loginNumber",
				data: "number="+number,
				type:"GET",
				success:function(result){
					var code = result.code;
					if (code == 100) {
						show_validate_msg(".inputNumber", "success", "");
					}else{
						show_validate_msg(".inputNumber", "error","此账号已注册!");
						return false;
					}
				}
			})
			
		}
		
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
		
		//判断两次密码是否一样
		$(".inputPassword2").change(function(){
			input_Password2();
		})
		
		function input_Password2(){
			var password = $.trim($(".inputPassword").val());
			var regpassword = $.trim($(".inputPassword2").val());
			
			if (password != regpassword) {
				show_validate_msg(".inputPassword2", "error","密码不可用!");
				return false;
			} else {
				show_validate_msg(".inputPassword2", "success", "");
			}
		}
		
		$(".btn_submit").click(function(){
			if (input_Number() == false) {
				return;
			}
			
			if (input_Password2() == false) {
				return;
			}
			
			var password2 = $.trim($(".inputPassword2").val());
			
			if (password2 == null) {
				show_validate_msg(".inputPassword2", "error","密保不能为空!");
				return;
			}
			
			var number = $.trim($(".inputNumber").val());
			var password = $.trim($(".inputPassword").val());
			var passwordEncrypted = $.trim($(".passwordEncrypted").val());
			
			if (passwordEncrypted == null) {
				show_validate_msg(".passwordEncrypted", "error","密保不能为空!");
				return;
			}
			
			var verification = $.trim($(".verification_code").val());
			
			if (verification == null) {
				show_validate_msg(".verification_code", "error","验证码不能为空!");
				return;
			}
			
			
			$.ajax({
				url:"${APP_PATH}/loginSaveUser",
				data: "number="+number+"&password="+password+"&passwordEncrypted="+passwordEncrypted+"&verification="+verification,
				type:"GET",
				success:function(result){
					var code = result.code;
					if (code == 100) {
						var number = $.trim($(".inputNumber").val());
						user_input(number);
					}else{
						alert(result.extent.verification);
					}
				}
			})
			
		})
		
		function user_input(number) {
			location.href = "user?inputNumber="+number;
		}

</script>
</body>
</html>