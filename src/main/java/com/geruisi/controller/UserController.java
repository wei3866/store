package com.geruisi.controller;

import java.util.Map;

import javax.servlet.ServletRequest;
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
	
	/**
	 * 验证登录
	 * @param inputNumber
	 * @param inputPassword
	 * @return
	 */
	@RequestMapping("/loginAll")
	@ResponseBody
	public Msg getinputLogin(@RequestParam("inputNumber")String inputNumber,
			@RequestParam("inputPassword")String inputPassword){
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
	 * 转向登录页面
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
	@RequestMapping("/merchant")
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
