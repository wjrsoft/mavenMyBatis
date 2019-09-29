package com.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptMapper;
import com.model.Dept;
@Service("deptService")
public class DeptServerImpl implements DeptServerI{
	public DeptMapper deptMapper;
	
	
	
	public DeptMapper getDeptMapper() {
		return deptMapper;
	}
    @Autowired
	public void setDeptMapper(DeptMapper deptMapper) {
		this.deptMapper = deptMapper;
	}

	public int deleteByPrimaryKey(Integer deptno) {
		// TODO Auto-generated method stub
		return deptMapper.deleteByPrimaryKey(deptno);
	}

	public int insert(Dept record) {
		// TODO Auto-generated method stub
		return deptMapper.insert(record);
	}

	public int insertSelective(Dept record) {
		// TODO Auto-generated method stub
		return deptMapper.insertSelective(record);
	}

	public Dept selectByPrimaryKey(Integer deptno) {
		// TODO Auto-generated method stub
		return deptMapper.selectByPrimaryKey(deptno);
	}

	public int updateByPrimaryKeySelective(Dept record) {
		// TODO Auto-generated method stub
		return deptMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Dept record) {
		// TODO Auto-generated method stub
		return deptMapper.updateByPrimaryKey(record);
	}

}
