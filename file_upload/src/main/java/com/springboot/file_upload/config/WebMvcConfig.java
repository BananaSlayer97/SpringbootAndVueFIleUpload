package com.springboot.file_upload.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: SpringbootAndVueFIleUpload
 * @description: CROS 解决跨域请求
 * @author: 全栈者也
 * @create: 2020 - 10 - 08 21:46
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    /**
     * https://www.cnblogs.com/lenve/p/10547902.html
     * 解决跨域问题
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8081")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}
