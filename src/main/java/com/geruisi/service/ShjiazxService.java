package com.geruisi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.CommodityExample;
import com.geruisi.bean.CommodityExample.Criteria;
import com.geruisi.bean.User;
import com.geruisi.dao.CommodityMapper;
import com.geruisi.dao.UserMapper;
import com.sun.org.apache.xerces.internal.impl.dtd.models.CMAny;


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

	public void shangjias(Commodity commods) {
		
		commodityMapper.insert(commods);
	}

	public void deletebyId(Integer id) {
		commodityMapper.deleteByPrimaryKey(id);
		
	}

	public void deleteByIds(List<Integer> del_ids) {
		CommodityExample example = new CommodityExample();
		CommodityExample.Criteria criteria = example.createCriteria();
		criteria.andCIdIn(del_ids);
		commodityMapper.deleteByExample(example);
		
	}

	public Commodity getShangPin(Integer id) {
		
		Commodity commodity = commodityMapper.selectByPrimaryKey(id);
		
		return commodity;
	}

	public void updateById(Commodity commodity) {
		
		commodityMapper.updateByPrimaryKeySelective(commodity);
		
	}
}