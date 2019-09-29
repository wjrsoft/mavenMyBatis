package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.model.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
     /**
      * 根據SQL返回數據
      * @param sqlStr
      * @return
      */
    List<Map<String, Object>> selectBySQL(@Param(value="sqlStr") String sqlStr);
}