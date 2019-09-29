package com.tools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.DeptMapper;


public class SpringTools {
	public static Object getDao(Class cls){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("classpath:spring.xml", "classpath:spring-mybatis.xml" );
		Object o=ac.getBean(DeptMapper.class);
		return  o;
		
	}
	
	public static Object selectByPrimaryKey(Class cls){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("classpath:spring.xml", "classpath:spring-mybatis.xml" );
		Object o=ac.getBean(DeptMapper.class);
		return  o;
		
	}
	
}
