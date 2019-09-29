package com.dao;

import java.util.List;

import com.model.Emp;
import com.pojo.Page;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(short id);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
    
    public List<Emp> findAll();
    
    List<Emp> findByEmp(Emp record);
    
    public List<Emp> findbyPage(Page page);
}