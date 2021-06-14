package com.springboot.file_upload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: SpringbootAndVueFIleUpload
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 09 - 06 22:30
 **/

@RestController
public class upload {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

         @PostMapping("/upload")
        public Map<String,Object> fileUpload(MultipartFile file, HttpServletRequest request){
             System.out.println("开始上传！-----------");

             Map<String,Object> map = new HashMap<>();

             //得到上传的文件名称
             String originName = file.getOriginalFilename();

             if(!originName.endsWith(".png")){
                    map.put("status","error");
                    map.put("message","上传的文件类型不正确");
                    return  map;
             }

             //得到保存文件的文件夹
             String format = sdf.format(new Date());
             String realPathName = request.getServletContext().getRealPath("/") + format;

             //根据路径得到文件夹，如果不存在则进行创建
             File folder = new File(realPathName);
             System.out.println(realPathName);
             if(!folder.exists()){
                 folder.mkdirs();
             }

             //得到一个 uuid名称
             String fileName = UUID.randomUUID().toString() + ".png";
             try {
                 //把原始文件转换或复制一个新文件
                 file.transferTo(new File(folder,fileName));
                 map.put("status","success");
                 String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + format + realPathName;
                 map.put("url",url);

             } catch (IOException e) {
                 e.printStackTrace();
                 map.put("status","error");
                 map.put("message",e.getMessage());
             }
            return  map;
         }
}
