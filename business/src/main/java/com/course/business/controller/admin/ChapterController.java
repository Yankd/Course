package com.course.business.controller.admin;

import com.course.server.dto.ChapterDto;
import com.course.server.dto.PageDto;
import com.course.server.dto.ResponseDto;
import com.course.server.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther Yankd
 * @date 2021/1/9 0009 21:30
 */
@RequestMapping("/admin/chapter")
@RestController
public class ChapterController {
    private static final Logger LOG = LoggerFactory.getLogger (ChapterController.class);

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/list")
    public ResponseDto list( @RequestBody PageDto pageDto) {
        LOG.info ("pageDto的值: {}",pageDto );
        //下面方法做了pageDto.set(),最终只是返回pageDto实例;
        chapterService.list (pageDto);
        ResponseDto responseDto = new ResponseDto ();
        responseDto.setContent (pageDto);
        return responseDto;
    }
    @RequestMapping("/save")
    public ResponseDto save(@RequestBody ChapterDto chapterDto) {
        LOG.info ("chapterDto的值: {}",chapterDto );
        chapterService.save (chapterDto);
        ResponseDto responseDto = new ResponseDto ();
        responseDto.setContent (chapterDto);
        return responseDto;
    }
}
