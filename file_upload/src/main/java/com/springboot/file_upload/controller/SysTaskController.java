package com.springboot.file_upload.controller;

import com.springboot.file_upload.entity.SysTask;
import com.springboot.file_upload.service.SysTaskService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysTask)表控制层
 *
 * @author makejava
 * @since 2020-09-24 00:01:15
 */
@RestController
@RequestMapping("sysTask")
public class SysTaskController {
    /**
     * 服务对象
     */
    @Resource
    private SysTaskService sysTaskService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysTask selectOne(Long id) {
        return this.sysTaskService.queryById(id);
    }

}