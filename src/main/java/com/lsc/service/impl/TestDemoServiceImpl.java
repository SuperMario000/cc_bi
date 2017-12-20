package com.lsc.service.impl;

import com.lsc.dao.TestDemoMapper;
import com.lsc.pojo.TestDemo;
import com.lsc.service.TestDemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lsc on 2017/12/20.
 */
@Service("testDemoService")
public class TestDemoServiceImpl implements TestDemoService {
    @Resource
    private TestDemoMapper testDemoMapper;

    public TestDemo getInfoById(Long roleId) {
        return this.testDemoMapper.selectByPrimaryKey(roleId);
    }
}
