package com.springboot.file_upload.config;

import com.springboot.file_upload.entity.SysTask;
import com.springboot.file_upload.service.SysTaskService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: SpringbootAndVueFIleUpload
 * @description:    监听器
 * @author: 全栈者也
 * @create: 2020 - 09 - 23 23:46
 **/
@Component
@Order(value = 1)
public class ScheduleJobInitListener implements CommandLineRunner {

    @Autowired
    SysTaskService scheduleJobService;

    @Override
    public void run(String... arg0) throws Exception {
        try {
            scheduleJobService.initSchedule();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
