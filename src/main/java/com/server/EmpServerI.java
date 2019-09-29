package com.server;

import java.util.List;

import com.model.Emp;

public interface EmpServerI {
	public Emp getEmpById(short id);

	int insert(Emp record);

	int insertSelective(Emp record);

	Emp selectByPrimaryKey(Short empno);

	int updateByPrimaryKeySelective(Emp record);

	int updateByPrimaryKey(Emp record);
	
	public List<Emp> findAll();
	
	List<Emp> findByEmp(Emp record);
}
