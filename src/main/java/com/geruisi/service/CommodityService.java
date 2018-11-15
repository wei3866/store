package com.geruisi.service;

import java.util.List;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.CommodityExample;
import com.geruisi.bean.CommodityExample.Criteria;
import com.geruisi.bean.User;
import com.geruisi.dao.CommodityMapper;
import com.geruisi.dao.UserMapper;

@Service
public class CommodityService {
	
	@Autowired
	CommodityMapper commodityMapper;

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 查询商品信息,用于宝贝详情页
	 * @return
	 */
	public Commodity getCommodityInfo(Integer integer) {
		Commodity commodity = commodityMapper.selectByPrimaryKey(integer);
		return commodity;
	}

	

	/**
	 * 查找店铺商品
	 * @return
	 */
	public List<Commodity> getCmerchant(Integer cMerchantId) {
		CommodityExample example = new CommodityExample();
		CommodityExample.Criteria criteria = example.createCriteria();
		criteria.andCMerchantIdEqualTo(1);
		return commodityMapper.selectByExampleMer(example);
	}



	public User getUserName(String number) {
		User user = userMapper.selectByPrimaryKey(number);
		return user;
	}



	public List<Commodity> getCommodityName(String soText) {
		Commodity commodity = new Commodity(null, null, soText, null, null, null, null, null, null, null);
		List<Commodity> exampleLike = commodityMapper.selectByExampleLike(commodity);
		return exampleLike;
	}

	
}
