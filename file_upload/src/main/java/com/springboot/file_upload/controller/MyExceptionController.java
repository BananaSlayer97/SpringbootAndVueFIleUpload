package com.springboot.file_upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: SpringbootAndVueFIleUpload
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 08 20:18
 **/
@Controller
public class MyExceptionController {

        @RequestMapping("error1")
        public String error1(){
            int i = 100 / 0;
            return "index";
        }

        @RequestMapping("error2")
        public String error2(){
            String str = null;
            str.length();
            return "index";
        }

}
