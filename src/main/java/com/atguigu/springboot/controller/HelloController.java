package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    public String sayHello() {
        return "Hello " + name;
    }
}
