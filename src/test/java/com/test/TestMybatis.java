package com.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.model.Emp;
import com.server.EmpServerI;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis {
	private static final Logger logger = Logger.getLogger(Test.class);
	public EmpServerI empServerI;
	public EmpServerI getEmpServerI() {
		return empServerI;
	}
	@Autowired
	public void setEmpServerI(EmpServerI empServerI) {
		this.empServerI = empServerI;
	}
	
    @Test
   	public void getEmpById() {
   		Emp u = empServerI.getEmpById((short) 7369 );
   		logger.info(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss"));
   		System.out.println("aaaaaaaaaaaaaaaaaaaa");    
   	}
	
	
    @Test
   	public void findAll() {
   		List<Emp> u = empServerI.findAll();
   		logger.info(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss")); 
   	}
	
    @Test
    public void findByEmp(){
    	Emp emp=new Emp();
    	emp.setDeptno((float) 20);
    	List<Emp> u = empServerI.findByEmp(emp);
    	logger.info(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss")); 
    }
	
	
	
	
	
	
	
	
}
