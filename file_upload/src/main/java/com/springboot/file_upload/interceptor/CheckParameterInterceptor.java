package com.springboot.file_upload.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: SpringbootAndVueFIleUpload
 * @description: 参数拦截器
 * @author: 全栈者也
 * @create: 2020 - 10 - 06 22:43
 **/
@Component
public class CheckParameterInterceptor implements HandlerInterceptor {

   /* @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        return false;
    }*/
}