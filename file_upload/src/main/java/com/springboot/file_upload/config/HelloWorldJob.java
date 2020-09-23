package com.springboot.file_upload.config;

import org.quartz.*;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: SpringbootAndVueFIleUpload
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 09 - 23 23:53
 **/
@DisallowConcurrentExecution //作业不并发
@Component
public class HelloWorldJob  implements Job {

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {

        System.out.println("欢迎使用yyblog,这是一个定时任务  --小卖铺的老爷爷!"+ new Date());

    }

}
