package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.domain.ChapterExample;
import com.course.server.dto.ChapterDto;
import com.course.server.mapper.ChapterMapper;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther Yankd
 * @date 2021/1/10 0010 1:31
 */
@Service
public class ChapterService {
    @Resource

    private ChapterMapper chapterMapper;
    public List<ChapterDto> list(){
        ChapterExample example = new ChapterExample ();
        List<Chapter> chapterList = chapterMapper.selectByExample (example);
        List<ChapterDto> chapterDtolist = new ArrayList<ChapterDto>();
        for (int i = 0, l = chapterList.size(); i < l;i++) {
            Chapter chapter = chapterList.get (i);
            ChapterDto chapterDto = new ChapterDto ();
            BeanUtils.copyProperties (chapter, chapterDto);
            chapterDtolist.add (chapterDto);
        }
        return chapterDtolist;
    }
}
