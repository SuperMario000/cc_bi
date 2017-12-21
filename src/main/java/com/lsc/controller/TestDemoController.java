package com.lsc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.log4j.Logger;

import com.lsc.pojo.TestDemo;
import com.lsc.service.TestDemoService;
/**
 * Created by lsc on 2017/12/20.
 */
@Controller
@RequestMapping("/testDemo")
public class TestDemoController {
    private static Logger logger = Logger.getLogger(TestDemoController.class);
    @Resource
    private TestDemoService testDemoService;

    @RequestMapping("/testDemo")
    public String testDemo(HttpServletRequest request, Model model) {
        int roleId = Integer.parseInt(request.getParameter("roleId"));
        TestDemo testDemo = this.testDemoService.getInfoById(new Long((long)roleId));
        logger.info(JSON.toJSONString(testDemo));
        model.addAttribute("testDemo", JSON.toJSONString(testDemo));
        return "testDemo";
    }
}
