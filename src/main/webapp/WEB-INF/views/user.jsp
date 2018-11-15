<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工信息</title>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.9.1.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

	<!-- 店铺模态框 -->
	<div class="modal fade" id="merchantModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">请为你的店铺起个名字</h4>
	      </div>
	      <div class="modal-body">
	        
			  <div class="form-group">
			    <label class="col-sm-2 control-label">店铺名</label>
			    <div class="col-sm-10">
			    	<input type="text" name="merchantName" class="form-control" id="merchant_input">
			        <span class="help-block"></span>
			    </div>
			  </div>
			  
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="merchant_save_modal">申请</button>
	      </div>
	    </div>
	  </div>
	</div>

	<!-- 员工新增模态框 -->
	<div class="modal fade" id="userModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">信息修改</h4>
	      </div>
	      <div class="modal-body">
	        
	      <form class="form-horizontal">
	      
			  <div class="form-group">
			    <label class="col-sm-2 control-label">账号</label>
			    <div class="col-sm-10 number_div">
			    	
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label class="col-sm-2 control-label">会员名</label>
			    <div class="col-sm-10">
			    	<input type="text" name="empName" class="form-control" id="user_input">
			        <span class="help-block"></span>
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label class="col-sm-2 control-label">员工邮箱</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="email_input">
			      <span class="help-block"></span>
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label class="col-sm-2 control-label">员工性别</label>
			    <div class="col-sm-10">
			      <label class="radio-inline">
					  <input type="radio" name="gender" id="gender1_input" value="1" > 男
				  </label>
				  <label class="radio-inline">
					  <input type="radio" name="gender" id="gender2_input" value="0"> 女
				  </label>
			    </div>
			  </div>

		  </form>
	        
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="user_save_modal">保存</button>
	      </div>
	    </div>
	  </div>
	</div>
	
	
	<center>
		<br>
		<br>
		<br>
		<br>
		<br>
		
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3 class="NumberTd"></h3>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3 class="NameTd"></h3>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3 class="EmailTd"></h3>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3 class="GenderTd"></h3>
<button type="button" class="btn btn-info user_records">订单信息</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-info user_NumberTd">信息修改</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-info user_merchant" id=""></button>
	</center>
	
<script type="text/javascript">

		$(function() {
			$.ajax({
				url : "${APP_PATH }/users",
				type : "get",
				success : function(result) {
					var NumberTd = result.extent.user.uNumber;
					var NameTd = result.extent.user.uName;
					var GenderTd = result.extent.user.uGender;
					var EmailTd = result.extent.user.uEmail;
					var MerTd = result.extent.user.uMer;
					
					var gender;
					if(GenderTd == 1){
						gender = "男";
					}else if(GenderTd == 0){
						gender = "女";
					}
					
					$(".NumberTd").text("账号: "+NumberTd);
					$(".NameTd").text("会员名: "+NameTd);
					$(".EmailTd").text("邮箱: "+EmailTd);
					$(".GenderTd").text("性别: "+gender);
					
					if(MerTd == 0){
						$(".user_merchant").text("申请店铺").attr("id",MerTd);
					}else if(MerTd != 0){
						$(".user_merchant").text("进入店铺").attr("id",MerTd);
					}
					
				}
			})
		})
		
		//订单信息
		$(".user_records").click(function(){
			location.href = "records";
		})
		
		//信息修改
		$(".user_NumberTd").click(function(){
			$.ajax({
				url : "${APP_PATH }/users",
				type : "get",
				success : function(result) {
					var NumberTd = result.extent.user.uNumber;
					var NameTd = result.extent.user.uName;
					var GenderTd = result.extent.user.uGender;
					var EmailTd = result.extent.user.uEmail;
					
					$(".number_div").text(NumberTd);
					$("#user_input").val(NameTd);
					$("#email_input").val(EmailTd);
					$("input[name=gender]").val([GenderTd]);
					
				}
			})
			
			//打开模态框
			$("#userModal").modal({
				backdrop : "static"
			});
			
		})
		
		//验证会员名
		$("#user_input").change(function() {
			user_text();
		})
		
		//验证邮箱
		$("#email_input").change(function() {
			email_text();
		})
		
		//验证邮箱
		function email_text(){
			var email = $("#email_input").val();
			var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
			if (!regEmail.test(email)) {
				show_validate_msg("#email_input", "error", "邮箱格式不正确!");
				return false;
			} else {
				show_validate_msg("#email_input", "success", "");
			}
		}
		
		//验证会员名
		function user_text(){
			var userName = $("#user_input").val();
			var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
			
			if (!regName.test(userName)) {
				show_validate_msg("#user_input", "error",
						"用户名必须是6-16位数字和字母的组合,或2-4位中文!");
				return false;
			} else {
				show_validate_msg("#user_input", "success", "");
			}
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
		
		//保存
		$("#user_save_modal").click(function(){
			
			var number = $(".number_div").text();
			var name =  $("#user_input").val();
			var email = $("#email_input").val();
			var gender = $("input[name=gender]:checked").val();
			
			$.ajax({
				url : "${APP_PATH }/updateUser",
				data: "number="+number+"&name="+name+"&email="+email+"&gender="+gender,
				type : "get",
				success : function(result) {
					if(result.code == 100){
						
						var uGender;
						if(gender == 1){
							uGender = "男";
						}else if(gender == 0){
							uGender = "女";
						}
						
						$(".NumberTd").text("账号: "+number);
						$(".NameTd").text("会员名: "+name);
						$(".EmailTd").text("邮箱: "+email);
						$(".GenderTd").text("性别: "+uGender);
					}
				}
			})
			
			$("#userModal").modal("hide");
		})
		
		//店铺
		$(".user_merchant").click(function(){
			var id = $(this).attr("id");
			
			if(id == 0){
				
				$("#merchantModal").modal({
					backdrop : "static"
				});
				//验证店铺名
				save_name();
				
			}else{
				location.href = "sjzxs";
			}
		})
		
		//申请店铺
		$(".merchant_save_modal").click(function(){
			save_merchant();
		})
		
		//申请店铺
		function save_merchant(){
			//验证店铺名
			if(save_name() == false){
				return;
			}
			
			var merchantName = $("#merchant_input").val();
			var merchantNumber = $(".NumberTd").text();
			
			$.ajax({
				url : "${APP_PATH }/merchants",
				data: "merchantName="+merchantName+"&merchantNumber="+merchantNumber,
				type : "get",
				success : function(result) {
					if(result.code == 100){
						var MerTd = result.extent.id;
						$(".user_merchant").text("进入店铺").attr("id",MerTd);
					}
				}
			})
			
			$("#merchantModal").modal("hide");
		}
		
		//验证店铺名
		$("#merchant_input").change(function() {
			save_name();
		})
		
		//验证店铺名
		function save_name(){
			var merchantName = $("#merchant_input").val();
			var regName = /(^[\u2E80-\u9FFF]{2,8})/;
			
			if (!regName.test(merchantName)) {
				show_validate_msg("#merchant_input", "error","店铺名必须是2-8位中文!");
				return false;
			} else {
				show_validate_msg("#merchant_input", "success", "");
			}
			
			$.ajax({
				url : "${APP_PATH }/merchantName",
				data: "merchantName="+merchantName,
				type : "get",
				success : function(result) {
					if(result.code == 200){
						show_validate_msg("#merchant_input", "error","店铺名已存在!");
						return false;
					}
				}
			})
		}

</script>
</body>
</html>