package com.geruisi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geruisi.bean.User;
import com.geruisi.service.UserService;
import com.geruisi.until.AESUtil;
import com.geruisi.until.EncodingTool;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/loginOut")
	@ResponseBody
	public Msg getLoginOut(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		session.removeAttribute("userLogin");
		return Msg.success();
	}
	
	
	/**
	 * 注册账号
	 * @param number
	 * @param password
	 * @param passwordEncrypted
	 * @param verification
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/loginSaveUser")
	@ResponseBody
	private Msg getLoginSaveUser(@RequestParam("number")String number,@RequestParam("password")String password,
			@RequestParam("passwordEncrypted")String passwordEncrypted,@RequestParam("verification")String verification,
			HttpServletRequest request, HttpServletResponse response){
		
		//2. 获取 session 中的 CHECK_CODE_KEY 属性值
		String sessionCode = (String)request.getSession().getAttribute("CHECK_CODE_KEY");
		
		//3. 比对. 看是否一致, 若一致说明验证码正确, 若不一致, 说明验证码错误
		if(!(verification != null && verification.equalsIgnoreCase(sessionCode))){
			return Msg.fail().add("verification", "验证码错误!");
		}
		
		userService.loginSaveUser(number,password,passwordEncrypted);
		
		
		return Msg.success();
	}
	
	
	/**
	 * 查询用户名是否可用
	 * @param number
	 * @return
	 */
	@RequestMapping("/loginNumber")
	@ResponseBody
	public Msg getLoginUser(@RequestParam("number")String number){
		long l = userService.loginUser(number);
		
		if (l == 0) {
			return Msg.success();
		}else{
			return Msg.fail();
		}
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/login3")
	public String getLogin3(){
		return "login3";
	}
	
	
	/**
	 * 修改密码
	 * @param number
	 * @param password
	 * @param passwordEncrypted
	 * @param verification
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/loginPassword")
	@ResponseBody
	private Msg getLoginPassword(@RequestParam("number")String number,@RequestParam("password")String password,
			@RequestParam("passwordEncrypted")String passwordEncrypted,@RequestParam("verification")String verification,
			HttpServletRequest request, HttpServletResponse response){
		
		//2. 获取 session 中的 CHECK_CODE_KEY 属性值
		String sessionCode = (String)request.getSession().getAttribute("CHECK_CODE_KEY");
		
		//3. 比对. 看是否一致, 若一致说明验证码正确, 若不一致, 说明验证码错误
		if(!(verification != null && verification.equalsIgnoreCase(sessionCode))){
			return Msg.fail().add("verification", "验证码错误!");
		}
		
		try {
			User user = userService.getUser(number);
			
			String passPus = user.getuPassPus();
			
			System.out.println(passPus);
			System.out.println(passwordEncrypted);
			
			if(!(passwordEncrypted != null && passwordEncrypted.equals(passPus))){
				return Msg.fail().add("verification", "密保错误!");
			}
			
			userService.updatePassWord(number,password);
			
			return Msg.success();
		} catch (Exception e) {
			return Msg.fail().add("verification", "查无此账号!");
		}
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/login2")
	public String getLogin2(){
		return "login2";
	}
	
	
	/**
	 * 验证登录
	 * @param inputNumber
	 * @param inputPassword
	 * @return
	 */
	@RequestMapping("/loginAll")
	@ResponseBody
	public Msg getinputLogin(@RequestParam("inputNumber")String inputNumber,
			@RequestParam("inputPassword")String inputPassword,@RequestParam("verification")String verification,
			HttpServletRequest request, HttpServletResponse response){
		
		//2. 获取 session 中的 CHECK_CODE_KEY 属性值
		String sessionCode = (String)request.getSession().getAttribute("CHECK_CODE_KEY");
		
		//3. 比对. 看是否一致, 若一致说明验证码正确, 若不一致, 说明验证码错误
		if(!(verification != null && verification.equalsIgnoreCase(sessionCode))){
			return Msg.fail().add("loginAll", "验证码错误!");
		}
		
		//获取密码
		String password;
		try {
			password = userService.getpassword(inputNumber);
			//密码解码
			String decode = AESUtil.aesDecode(password);
			
			Integer decodes = Integer.parseInt(decode);
			Integer inputPasswords = Integer.parseInt(inputPassword);
			System.out.println(inputPasswords.equals(decodes));
			if (inputPasswords.equals(decodes)) {
				return Msg.success();
			}else {
				return Msg.fail().add("loginAll", "密码错误!");
			}
		} catch (Exception e) {
			return Msg.fail().add("loginAll", "用户名错误!");
		}
		
			
		
	}
	
	/**
	 * 转向个人页面
	 * @return
	 */
	@RequestMapping("/user")
	public String getlogin(@RequestParam("inputNumber")String inputNumber,
			HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		session.setAttribute("userLogin", inputNumber);
		
		return "user";
	}
	
	/**
	 * 查询员工信息
	 * @return
	 */
	@RequestMapping("/users")
	@ResponseBody
	public Msg getUsers(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String inputNumber = (String) session.getAttribute("userLogin");
		
		User user = userService.getUser(inputNumber);
		
		return Msg.success().add("user", user);
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public Msg getUpdateUser(@RequestParam("number")String number,@RequestParam("name")String names,
			@RequestParam("email")String email,@RequestParam("gender")String gender){
		String name = EncodingTool.encodeStr(names);
		int genders = Integer.parseInt(gender);
		
		userService.updateUser(number,name,email,genders);
		
		return Msg.success();
	}
	
	//检验店铺名是否可用
	@RequestMapping("/merchantName")
	@ResponseBody
	public Msg getMerchantName(@RequestParam("merchantName")String merchantName){
		long l = userService.merchantName(merchantName);
		
		if (l == 0) {
			return Msg.success();
		}else {
			return Msg.fail();
		}
		
	}
	
	//申请店铺
	@RequestMapping("/merchants")
	@ResponseBody
	public Msg getMerchant(@RequestParam("merchantName")String merchantName,
			@RequestParam("merchantNumber")String merchantNumber){
		Integer id = userService.merchant(merchantName,merchantNumber);
		
		if (id != null) {
			return Msg.success().add("id", id);
		}else {
			return Msg.fail();
		}
		
	}

}
