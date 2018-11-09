package com.geruisi.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.geruisi.bean.Record;
import com.geruisi.bean.RecordExample;
import com.geruisi.bean.RecordExample.Criteria;
import com.geruisi.dao.RecordMapper;
import com.geruisi.until.Get16Number;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml",
		"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class RecordMapperTest {
	@Autowired
	private RecordMapper recordMapper;
	@Autowired
	SqlSession sqlSession;
	
	@Test
	public  void  testGetAll(){
	
	RecordExample example = new RecordExample();
	RecordExample.Criteria criteria = example.createCriteria();
	criteria.andRCIdEqualTo(1);
	List<Record> record =	recordMapper.selectByExampleWithAll(null);
	for (Record record2 : record) {
		System.out.println(record2);
	}
	
	}
//	@Test
//	public  void  testInsertOne(){
//		recordMapper.insertSelective(new Record(null, Get16Number.getUUID(), "17890364829", 1, 2, 122, Get16Number.DateToStr(new Date()), null, "2","河南省郑州市管城回族区郑汴路与未来路交叉口绿都广场2504"));
//	}
//	 @Test
//	 public void testInsertAll(){
//		 
//		 RecordMapper mapper = sqlSession.getMapper(RecordMapper.class);
//		 for(int i = 0;i<100;i++){
//			 recordMapper.insertSelective(new Record(null, Get16Number.getUUID(), "17890364829", 1, 2, 10000, Get16Number.DateToStr(new Date()), null, "2","河南省郑州市管城回族区郑汴路与未来路交叉口绿都广场2504"));
//			// recordMapper.deleteByExample(null);
//		 }
//		 System.out.println("批量完成");
//	 }
	 
}
