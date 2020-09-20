package com.springboot.file_upload.controller;

import com.springboot.file_upload.entity.Majors;
import com.springboot.file_upload.service.MajorsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Majors)表控制层
 *
 * @author makejava
 * @since 2020-09-21 00:54:26
 */
@RestController
@RequestMapping("majors")
public class MajorsController {
    /**
     * 服务对象
     */
    @Resource
    private MajorsService majorsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Majors selectOne(Integer id) {
        return this.majorsService.queryById(id);
    }

}