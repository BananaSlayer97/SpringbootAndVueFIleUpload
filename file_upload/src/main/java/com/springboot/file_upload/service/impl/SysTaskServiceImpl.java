package com.springboot.file_upload.service.impl;

import com.springboot.file_upload.entity.SysTask;
import com.springboot.file_upload.dao.SysTaskDao;
import com.springboot.file_upload.enums.JobStatusEnum;
import com.springboot.file_upload.service.SysTaskService;
import com.springboot.file_upload.utils.QuartzManager;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysTask)表服务实现类
 *
 * @author makejava
 * @since 2020-09-24 00:01:15
 */
@Service("sysTaskService")
public class SysTaskServiceImpl implements SysTaskService {
    @Resource
    private SysTaskDao sysTaskDao;

    @Autowired
    private QuartzManager quartzManager;


    /**
     * 第二步：读取数据库，加载scheduler调度器
     * @throws SchedulerException
     */
    @Override
    public void initSchedule() throws SchedulerException {
        // 这里获取任务信息数据
        List<SysTask> jobList = sysTaskDao.queryAllByLimit(0,15);
        for (SysTask task : jobList) {
            if (JobStatusEnum.RUNNING.getCode().equals(task.getJobStatus())) {
                quartzManager.addJob(task);
            }
        }
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysTask queryById(Long id) {
        return this.sysTaskDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysTask> queryAllByLimit(int offset, int limit) {
        return this.sysTaskDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysTask 实例对象
     * @return 实例对象
     */
    @Override
    public SysTask insert(SysTask sysTask) {
        this.sysTaskDao.insert(sysTask);
        return sysTask;
    }

    /**
     * 修改数据
     *
     * @param sysTask 实例对象
     * @return 实例对象
     */
    @Override
    public SysTask update(SysTask sysTask) {
        this.sysTaskDao.update(sysTask);
        return this.queryById(sysTask.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sysTaskDao.deleteById(id) > 0;
    }

}