package com.course.system.service;

import com.course.system.domain.Test;
import com.course.system.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther Yankd
 * @date 2021/1/10 0010 1:31
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    public List<Test> list(){
        return testMapper.list ();
    }
}
