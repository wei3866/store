package com.geruisi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geruisi.bean.Record;
import com.geruisi.bean.RecordExample;
import com.geruisi.bean.User;
import com.geruisi.bean.UserExample;
import com.geruisi.dao.RecordMapper;
import com.geruisi.dao.UserMapper;

@Service
public class RecordService {
	@Autowired
	RecordMapper recordMapper;
	@Autowired
	UserMapper userMapper;
	//查询客户所有订单
	public List<Record> getAllKH(String str) {
		
		RecordExample example = new RecordExample();
		RecordExample.Criteria criteria = example.createCriteria();
		criteria.andRUNumberEqualTo(str);
		return recordMapper.selectByExampleWithAll(example);
		
	}
	//查询商家Id
	public User getAllSJId(String uNumber) {
		
		return userMapper.selectByPrimaryKey(uNumber);
		 
	}
	//查询商家订单
	public List<Record> getAllSjdd(int  str) {
		
		RecordExample example = new RecordExample();
		RecordExample.Criteria criteria = example.createCriteria();
		criteria.andRMerIdEqualTo(str);
		return recordMapper.selectByExampleWithAll(example);
	}
	public List<Record> getOneRecord(String str) {
		RecordExample example = new RecordExample();
		RecordExample.Criteria criteria = example.createCriteria();
		criteria.andROrderIdEqualTo(str);
		return recordMapper.selectByExampleWithAll(example);
		
	}
	public void fahuo(String str) {
		RecordExample recordExample = new RecordExample();
		RecordExample.Criteria criteria = recordExample.createCriteria();
	     	criteria.andROrderIdEqualTo(str);
	     	Record record = new Record();
	     	record.setrState("2");
	     	recordMapper.updateByExampleSelective(record, recordExample);
	}
	public void shuo(String str) {
		RecordExample recordExample = new RecordExample();
		RecordExample.Criteria criteria = recordExample.createCriteria();
	     	criteria.andROrderIdEqualTo(str);
	     	Record record = new Record();
	     	record.setrState("3");
	     	recordMapper.updateByExampleSelective(record, recordExample);
		
	}

	
	
}
