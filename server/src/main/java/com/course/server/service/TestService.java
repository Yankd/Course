package com.course.server.service;

import com.course.server.domain.Test;
import com.course.server.domain.TestExample;
import com.course.server.mapper.TestMapper;
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
//        TestExample example = new TestExample ();
//        example.createCriteria ().andIdEqualTo ("1");
//        example.setOrderByClause ("id desc");
        return testMapper.selectByExample (null);
    }
}
