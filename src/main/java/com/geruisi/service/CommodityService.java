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
	 * 展示商品
	 * @return
	 */
	public List<Commodity> getCommodityAll() {
		
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

	

	/**
	 * 查找店铺商品
	 * @return
	 */
	public List<Commodity> getCmerchant(Integer cMerchantId) {
		// TODO Auto-generated method stub
		CommodityExample example = new CommodityExample();
		CommodityExample.Criteria criteria = example.createCriteria();
		criteria.andCMerchantIdEqualTo(1);
		return commodityMapper.selectByExampleMer(example);
	}
//	public List<Commodity> getCmerchant(Integer integer) {
//		// TODO Auto-generated method stub
//		CommodityExample example = new CommodityExample();
//		CommodityExample.Criteria criteria = example.createCriteria();
//		criteria.andCMerchantIdEqualTo(integer);
//		List<Commodity> commodities = commodityMapper.selectByExample(example);
//		return commodities;
//	}

	/**
	 * 根据条件查找商品
	 * @return
	 */
//	public List<Commodity> getCommodityType() {
//		List<Commodity> commodities = commodityMapper.selectCommodityAll();
//		return commodities;
//	}

//	public List<Commodity> getCommodityType(CriteriaCommodity cc) {
//		
//		List<Commodity> commodities = commodityMapper.selectCommodityAll(cc);
//		return commodities;
//	}
	
	public List<Commodity> getCommodityType(String cName) {
		CommodityExample example = new CommodityExample();
		CommodityExample.Criteria criteria = example.createCriteria();
		criteria.andCNameLike(cName);
		List<Commodity> commodities = commodityMapper.selectByExample(example);
		return commodities;
	}
	
}
