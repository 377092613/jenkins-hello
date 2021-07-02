package com.bfy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String test(){
        return "哈哈哈哈";
    }
    @RequestMapping("/hello2")
    public String test2(){
        return "哈哈哈哈2";
    }
    @RequestMapping("/hello3")
    public String test3(){
        return "哈哈哈哈3";
    }
}
