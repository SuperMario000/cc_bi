package com.lsc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lsc.pojo.TestDemo;
import com.lsc.service.TestDemoService;
/**
 * Created by lsc on 2017/12/20.
 */
@Controller
@RequestMapping("/testDemo")
public class TestDemoController {
    @Resource
    private TestDemoService testDemoService;

    @RequestMapping("/testDemo")
    public String testDemo(HttpServletRequest request, Model model) {
        int roleId = Integer.parseInt(request.getParameter("roleId"));
        TestDemo testDemo = this.testDemoService.getInfoById(new Long((long)roleId));
        model.addAttribute("testDemo", testDemo);
        return "testDemo";
    }
}
