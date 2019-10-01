package com.server;

import com.schema.Dept;

public interface DeptService {
	int deleteByPrimaryKey(Integer deptno);

	int insert(Dept record);

	int insertSelective(Dept record);

	Dept selectByPrimaryKey(Integer deptno);

	int updateByPrimaryKeySelective(Dept record);

	int updateByPrimaryKey(Dept record);
}
