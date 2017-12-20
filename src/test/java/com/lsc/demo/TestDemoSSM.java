package com.lsc.demo;

import org.apache.log4j.Logger;
import com.alibaba.fastjson.JSON;
import com.lsc.pojo.TestDemo;
import com.lsc.service.TestDemoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lsc on 2017/12/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestDemoSSM {
    private static Logger logger = Logger.getLogger(TestDemoSSM.class);

    @Resource
    private TestDemoService testDemoService = null;
    private ApplicationContext ac = null;
    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        testDemoService = (TestDemoService) ac.getBean("testDemoService");
    }

    @Test
    public void test() {
        System.out.println("-------start------");
        TestDemo testDemo = testDemoService.getInfoById(new Long((long)1));
        System.out.println(testDemo.getOwnerName());
        logger.info("值："+testDemo.getRoleName());
        logger.info(JSON.toJSONString(testDemo));
        System.out.println("-------end------");
    }
}
