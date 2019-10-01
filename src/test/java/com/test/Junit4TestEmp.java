package com.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.schema.Emp;
import com.server.EmpService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class Junit4TestEmp {
	private static final Logger logger = Logger.getLogger(Test.class);
	public EmpService empService;
	public EmpService getempService() {
		return empService;
	}
	@Autowired
	public void setempService(EmpService empService) {
		this.empService = empService;
	}
	
    @Test
   	public void getEmpById() {
   		Emp u = empService.getEmpById((short) 7369 );
   		logger.info(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss"));
   		System.out.println("aaaaaaaaaaaaaaaaaaaa");    
   	}
	
	
    @Test
   	public void findAll() {
   		List<Emp> u = empService.findAll();
   		logger.info("===================:"+JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss")); 
   	}
	
    @Test
    public void findByEmp(){
    	Emp emp=new Emp();
    	emp.setDeptno((float) 20);
    	List<Emp> u = empService.findByEmp(emp);
    	logger.info("===================:"+JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss")); 
    }
	
	
	
	
	
	
	
	
}
