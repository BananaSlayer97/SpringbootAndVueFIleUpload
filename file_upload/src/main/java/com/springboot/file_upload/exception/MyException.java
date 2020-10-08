package com.springboot.file_upload.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: SpringbootAndVueFIleUpload
 * @description: 自定义 HandlerExceptionResolver 类处理异常
 * @author: 全栈者也
 * @create: 2020 - 10 - 08 20:13
 **/
@Configuration
public class MyException implements HandlerExceptionResolver {

    @Nullable
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        ModelAndView mv = new ModelAndView();
        //判断是哪种错误
        if(e instanceof ArithmeticException){
            mv.setViewName("error1.html");
        }
        if(e instanceof NullPointerException){
            mv.setViewName("error2.html");
        }
        mv.addObject("error",e.toString());
        return mv;
    }
}
