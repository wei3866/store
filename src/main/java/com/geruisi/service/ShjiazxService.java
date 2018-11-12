package com.geruisi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.CommodityExample;
import com.geruisi.bean.User;
import com.geruisi.dao.CommodityMapper;
import com.geruisi.dao.UserMapper;


@Service
public class ShjiazxService {
	@Autowired
	CommodityMapper commodityMapper;
	
	
	@Autowired
	UserMapper userMapper;
	
	//查询商家Id
	public User getAllSJId(String uNumber) {
		
		return userMapper.selectByPrimaryKey(uNumber);
	}

	public List<Commodity> getSjxzs(int sid) {
		CommodityExample example = new CommodityExample();
		CommodityExample.Criteria criteria = example.createCriteria();
		criteria.andCMerchantIdEqualTo(sid);
		
		return commodityMapper.selectByExampleMer(example);
	}
}