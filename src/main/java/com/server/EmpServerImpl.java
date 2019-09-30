package com.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmpDAO;
import com.schema.Emp;

@Service("empService")
public class EmpServerImpl implements EmpServerI {
	public EmpDAO empMapper;
	public EmpDAO getEmpMapper() {
		return empMapper;
	}


	@Autowired
	public void setEmpMapper(EmpDAO empMapper) {
		this.empMapper = empMapper;
	}
	
	public Emp getEmpById(short id) {
		return empMapper.selectByPrimaryKey(id);
	}
	
	

	public int insert(Emp record) {
		// TODO Auto-generated method stub
		return empMapper.insert(record);
	}

	public int insertSelective(Emp record) {
		// TODO Auto-generated method stub
		return empMapper.insertSelective(record);
	}

	public Emp selectByPrimaryKey(Short empno) {
		// TODO Auto-generated method stub
		return empMapper.selectByPrimaryKey(empno);
	}

	public int updateByPrimaryKeySelective(Emp record) {
		// TODO Auto-generated method stub
		return empMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Emp record) {
		// TODO Auto-generated method stub
		return empMapper.updateByPrimaryKey(record);
	}


	public List<Emp> findAll() {
		 
		return empMapper.findAll();
	}


	public List<Emp> findByEmp(Emp record) {
		// TODO Auto-generated method stub
		return empMapper.findByEmp( record);
	}

    

	

}
