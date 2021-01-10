package com.course.system.controller;

import com.course.system.domain.Test;
import com.course.system.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther Yankd
 * @date 2021/1/9 0009 21:30
 */
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public List<Test> test() {
        return testService.list ();

    }
}
