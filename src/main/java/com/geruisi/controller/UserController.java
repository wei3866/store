package com.geruisi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geruisi.service.UserService;
import com.geruisi.until.AESUtil;

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
	@RequestMapping(value="/inputLogin",method=RequestMethod.POST)
	@ResponseBody
	public Msg getinputLogin(@RequestParam("inputNumber")String inputNumber,
			@RequestParam("inputPassword")String inputPassword){
		//获取密码
		String password = userService.getpassword(inputNumber);
		//密码解码
		String decode = AESUtil.aesDecode(password);
		
		if (inputNumber.equals(decode)) {
			return Msg.success();
		}else {
			return Msg.fail();
		}
		
	}
	
//	@RequestMapping("/user")
//	public String getuser(){
//		System.out.println("user");
//		return "user";
//	}

}
