package com.geruisi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.CommodityExample;
import com.geruisi.dao.CommodityMapper;

@Service
public class CommodityService {
	
	@Autowired
	CommodityMapper commodityMapper;

	/**
	 * 根据条件查找商品
	 * @return
	 */
	public List<Commodity> getCommodityByName() {
		
		CommodityExample example = new CommodityExample();
		CommodityExample.Criteria criteria = example.createCriteria();
		criteria.andCNameEqualTo("小米6");
		criteria.andCTypeAEqualTo("数码");
		criteria.andCTypeBEqualTo("手机");
		// TODO Auto-generated method stub
		
		return commodityMapper.selectByExample(example);
	}

}
