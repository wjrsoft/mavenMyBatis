package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.schema.Dept;
import com.server.DeptService;

public class SpringTestMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml",
				"classpath:spring-mybatis.xml");
		DeptService deptService = (DeptService) ac.getBean("deptService");
		Dept dept = new Dept();
		dept = deptService.selectByPrimaryKey(20);
		System.out.println(JSON.toJSON(dept));

	}
}
