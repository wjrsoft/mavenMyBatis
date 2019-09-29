package com.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
//import com.dao.DeptMapper;
import com.dao.EmpMapper;
//import com.model.Dept;
import com.model.Emp;
import com.tools.SpringTools;

public class TestDao2 {
	private static final Logger logger = Logger.getLogger(TestDao2.class);
//	@Test
//	public void test2(){
//		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml", "classpath:spring-mybatis.xml" );
//		DeptMapper deptdao=ac.getBean(DeptMapper.class);
//		 Dept dept=deptdao.selectByPrimaryKey(20);
//		 logger.info(JSON.toJSONStringWithDateFormat(dept, "yyyy-MM-dd HH:mm:ss"));
//	}
//	
//	@Test
//	public void test3(){
// 		DeptMapper deptdao=
// 				 (DeptMapper) SpringTools.getDao(DeptMapper.class);
//		 Dept dept=deptdao.selectByPrimaryKey(20);
//		 logger.info(JSON.toJSONStringWithDateFormat(dept, "yyyy-MM-dd HH:mm:ss"));
//	}
//	
	@Test
	public void test4(){
		EmpMapper empdao=(EmpMapper) SpringTools.getDao(EmpMapper.class);
		Emp emp=(Emp) empdao.findAll();
		logger.info(JSON.toJSONStringWithDateFormat(emp, "yyyy-MM-dd HH:mm:ss"));
	}
}	
