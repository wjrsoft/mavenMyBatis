package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.schema.Dept;
import com.server.DeptService;


public class LogBackTest {

	private final static Logger logger = LoggerFactory.getLogger(LogBackTest.class);
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml",
				"classpath:spring-mybatis.xml");
		DeptService deptService = (DeptService) ac.getBean("deptService");
		Dept dept = new Dept();
		dept = deptService.selectByPrimaryKey(20);
		logger.info(JSON.toJSONString(dept));

	}
}
