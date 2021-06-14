package com.springboot.file_upload.controller;

import com.springboot.file_upload.entity.Titles;
import com.springboot.file_upload.service.TitlesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Titles)表控制层
 *
 * @author makejava
 * @since 2020-09-21 00:55:29
 */
@RestController
@RequestMapping("titles")
public class TitlesController {
    /**
     * 服务对象
     */
    @Resource
    private TitlesService titlesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Titles selectOne(Integer id) {
        System.out.println("查询单个数据开始！");
        return this.titlesService.queryById(id);
    }
}