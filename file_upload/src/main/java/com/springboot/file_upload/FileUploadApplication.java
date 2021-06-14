package com.springboot.file_upload;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.file_upload.dao")
public class FileUploadApplication {

    public static void main(String[] args) {
        System.out.println("程序启动");
        SpringApplication.run(FileUploadApplication.class, args);
    }

}
