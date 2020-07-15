package com.alt4hk.springdemo.service.impl;

import com.alt4hk.springdemo.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        if(name == null || name.trim() == "") {
            throw new RuntimeException("parameter is null!");
        }
        System.out.println("Hello " + name);
    }
}
