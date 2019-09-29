package com.server;

import com.model.Dept;
public interface DeptServerI {
	int deleteByPrimaryKey(Integer deptno);

	int insert(Dept record);

	int insertSelective(Dept record);

	Dept selectByPrimaryKey(Integer deptno);

	int updateByPrimaryKeySelective(Dept record);

	int updateByPrimaryKey(Dept record);
}
