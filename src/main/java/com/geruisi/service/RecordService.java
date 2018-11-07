package com.geruisi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.Record;
import com.geruisi.bean.RecordExample;
import com.geruisi.dao.RecordMapper;

@Service
public class RecordService {
	@Autowired
	RecordMapper recordMapper;

	//查询所有订单
	public List<Record> getAll(String str) {
		
		RecordExample example = new RecordExample();
		RecordExample.Criteria criteria = example.createCriteria();
		criteria.andRUNumberEqualTo(str);
		return recordMapper.selectByExampleWithAll(example);
		
	}
	
}
