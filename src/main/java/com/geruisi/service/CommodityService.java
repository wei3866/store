package com.geruisi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.geruisi.bean.Commodity;
import com.geruisi.dao.CommodityMapper;

public class CommodityService {
	
	@Autowired
	CommodityMapper commodityMapper;

	/**
	 * 查询所有商品
	 * @return
	 */
	public List<Commodity> getAll() {
		// TODO Auto-generated method stub
		return commodityMapper.selectByExample(null);
	}

}
