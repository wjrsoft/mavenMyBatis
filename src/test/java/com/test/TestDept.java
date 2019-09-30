package com.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.schema.Dept;
import com.server.DeptServerI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestDept {
	private static final Logger logger = Logger.getLogger(TestDept.class);
	public DeptServerI deptServerI;
	public DeptServerI getDeptServerI() {
		return deptServerI;
	}
	@Autowired
	public void setDeptServerI(DeptServerI deptServerI) {
		this.deptServerI = deptServerI;
	}
	
	@Test
	public void test(){
		Dept dept=new Dept();
		dept=deptServerI.selectByPrimaryKey(20);
		logger.info(JSON.toJSONStringWithDateFormat(dept, "yyyy-MM-dd HH:mm:ss"));
	}
	
}
