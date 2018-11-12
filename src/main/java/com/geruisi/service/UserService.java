package com.geruisi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.User;
import com.geruisi.dao.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	/**
	 * 查询密码
	 * @param inputNumber
	 * @return
	 */
	public String getpassword(String inputNumber) {
		User user = userMapper.selectByPrimaryKey(inputNumber);
		String password = user.getuPassword();
		return password;
	}
	
	
	
}
