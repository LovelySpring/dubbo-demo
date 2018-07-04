package com.alibaba.dubbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.demo.service.IDemoService;

@Service
public class DemoService implements IDemoService {
    @Override
    public String helloDubbo() {
        System.out.println("Hello Dubbo !!!");
        return "Hello Dubbo !!!";
    }
}
