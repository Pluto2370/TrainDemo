package com.zhou.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String test() {
        return "hello world1";
    }
    @RequestMapping("/branch")
    public String test1() {
        return "This is a new branch";
    }
}

