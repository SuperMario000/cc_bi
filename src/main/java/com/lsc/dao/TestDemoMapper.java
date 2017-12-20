package com.lsc.dao;

import com.lsc.pojo.TestDemo;

public interface TestDemoMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(TestDemo record);

    int insertSelective(TestDemo record);

    TestDemo selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(TestDemo record);

    int updateByPrimaryKey(TestDemo record);
}