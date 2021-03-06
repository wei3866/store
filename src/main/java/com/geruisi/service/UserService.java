package com.geruisi.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.Merchant;
import com.geruisi.bean.MerchantExample;
import com.geruisi.bean.MerchantExample.Criteria;
import com.geruisi.bean.User;
import com.geruisi.bean.UserExample;
import com.geruisi.dao.MerchantMapper;
import com.geruisi.dao.UserMapper;
import com.geruisi.until.AESUtil;
import com.geruisi.until.Get16Number;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private MerchantMapper merchantMapper;
	
	@Autowired
	private Get16Number get16Number;
	
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

	/**
	 * 查询员工信息
	 * @param inputNumber
	 * @return
	 */
	public User getUser(String inputNumber) {
		User user = userMapper.selectByPrimaryKey(inputNumber);
		return user;
	}

	
	public void updateUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
		
	}

	public void updateUser(String number, String name, String email, int genders) {
		User user = new User(number, null, name, genders, null, email, null, null, null, null);
		userMapper.updateByPrimaryKeySelective(user);
	}

	public long merchantName(String merchantName) {
		long countByExample = merchantMapper.count(merchantName);
		System.out.println(countByExample);
		return countByExample;
	}

	public Integer merchant(String merchantName, String merchantNumber) {
		//时间
		String dateToStr = get16Number.DateToStr(new Date());
		Merchant merchant = new Merchant(null, merchantName, merchantNumber, dateToStr);
		merchantMapper.insert(merchant);
		
		MerchantExample example = new MerchantExample();
		Criteria criteria = example.createCriteria();
		criteria.andMerUserNumberEqualTo(merchantNumber);
		List<Merchant> selectByExample = merchantMapper.selectByExample(example);
		
		for (Merchant merchant2 : selectByExample) {
			Integer merid = merchant2.getMerId();
			
			User user = new User(merchantNumber, null, null, null, null, null, null, null, null, merid);
			userMapper.updateByPrimaryKeySelective(user);
			
			return merid;
		}
		
		return null;
	}

	public void updatePassWord(String number, String password) {
		String aesEncode = AESUtil.aesEncode(password);
		User user = new User(number, null, null, null, aesEncode, null, null, null, null, null);
		userMapper.updateByPrimaryKeySelective(user);
		
	}

	public long loginUser(String number) {
		
		long l = userMapper.count(number);
		return l;
	}

	public void loginSaveUser(String number, String password, String passwordEncrypted) {
		String uPassword = AESUtil.aesEncode(password);
		User user = new User(number, null, null, null, uPassword, null, null, null, passwordEncrypted, null);
		userMapper.insertSelective(user);
	}

	
}
