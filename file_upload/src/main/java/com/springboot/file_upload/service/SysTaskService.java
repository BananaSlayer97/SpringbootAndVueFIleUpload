package com.springboot.file_upload.service;

import com.springboot.file_upload.entity.SysTask;
import org.quartz.SchedulerException;

import java.util.List;

/**
 * (SysTask)表服务接口
 *
 * @author makejava
 * @since 2020-09-24 00:01:15
 */
public interface SysTaskService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysTask queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysTask> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysTask 实例对象
     * @return 实例对象
     */
    SysTask insert(SysTask sysTask);

    /**
     * 修改数据
     *
     * @param sysTask 实例对象
     * @return 实例对象
     */
    SysTask update(SysTask sysTask);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    void initSchedule() throws SchedulerException;

}