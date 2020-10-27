package com.yoodb.study.demo01.controller;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index(){
        return "欢迎来到springboot";
    }
}
