package com.geruisi.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.geruisi.bean.Record;
import com.geruisi.dao.RecordMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class RecordMapperTest {
	@Autowired
	private RecordMapper recordMapper;
	@Test
	public  void  testGetAll(){
	List<Record> record =	recordMapper.selectByExample(null);
		System.out.println(record);
	}
	
}
