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
	public List<Commodity> getCommodityAll() {
		
//		CommodityExample example = new CommodityExample();
//		CommodityExample.Criteria criteria = example.createCriteria();
//		criteria.andCNameEqualTo(null);
//		criteria.andCTypeAEqualTo(null);
//		criteria.andCTypeBEqualTo(null);
		// TODO Auto-generated method stub
		//return commodityMapper.selectByExample(example);
		List<Commodity> commodities = commodityMapper.selectByExample(null);
		return commodities;
	}

	/**
	 * 查询商品信息,用于宝贝详情页
	 * @return
	 */
	public List<Commodity> getCommodityInfo(Integer integer) {

		CommodityExample example = new CommodityExample();
		CommodityExample.Criteria criteria = example.createCriteria();
		criteria.andCIdEqualTo(integer);
		List<Commodity> commodities = commodityMapper.selectByExampleMer(example);
		return commodities;
	}
	//	public Commodity getCommodityInfo(Integer integer) {
//		// TODO Auto-generated method stub
//		Commodity commodity = commodityMapper.selectByExampleMer(null);
//		return commodity;
//	}


	
}
