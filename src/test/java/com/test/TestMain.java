package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.schema.Dept;
import com.server.DeptServerI;

public class TestMain {
	public DeptServerI deptServerI;

	public DeptServerI getDeptServerI() {
		return deptServerI;
	}

	public void setDeptServerI(DeptServerI deptServerI) {
		this.deptServerI = deptServerI;
	}

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml",
				"classpath:spring-mybatis.xml");
		DeptServerI deptServerI = (DeptServerI) ac.getBean("deptService");
		Dept dept = new Dept();
		dept = deptServerI.selectByPrimaryKey(20);
		System.out.println(JSON.toJSON(dept));

	}
}
