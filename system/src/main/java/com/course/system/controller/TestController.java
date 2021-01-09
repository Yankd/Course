package com.course.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Yankd
 * @date 2021/1/9 0009 21:30
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "success";

    }
}
