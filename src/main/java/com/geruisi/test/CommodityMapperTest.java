package com.geruisi.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.CommodityExample;
import com.geruisi.dao.CommodityMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class CommodityMapperTest {
	
	@Autowired
	CommodityMapper commodityMapper;
	
	@Test
	public void getCommodityInfo(){
		CommodityExample example = new CommodityExample();
		CommodityExample.Criteria criteria = example.createCriteria();
		
		List<Commodity> list = commodityMapper.selectByExampleMer(null);
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}
	}
	
	@Test
	public void getCommodityAll(){
		CommodityExample example = new CommodityExample();
		CommodityExample.Criteria criteria = example.createCriteria();
		//criteria.andCIdEqualTo(3);
		//criteria.andCNameNotEqualTo("联想");
		//criteria.andCTypeAEqualTo("数码");
		//criteria.andCTypeBEqualTo("裤子");
		criteria.andCTypeBEqualTo("手机");
		List<Commodity> list = commodityMapper.selectByExample(example);
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}
	}
	
}
