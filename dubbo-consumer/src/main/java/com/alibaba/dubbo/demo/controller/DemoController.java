package com.alibaba.dubbo.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.demo.service.IDemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference
    private IDemoService demoService;

    @RequestMapping(value = "/helloDubbo", method = RequestMethod.GET)
    public String helloDubbo() {
        return demoService.helloDubbo();
    }
}
