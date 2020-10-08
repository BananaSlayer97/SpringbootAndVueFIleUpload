package com.springboot.file_upload.token;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;*/
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @program: SpringbootAndVueFIleUpload
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 06 22:48
 **/
@Component
public class RedisService {

 /*       @Autowired
        RedisTemplate redisTemplate;

        public boolean setEx(String key,Object value,Long expireTime){
                boolean result = false;
            try{
                    ValueOperations ops = redisTemplate.opsForValue();
                    ops.set(key,value);

                    redisTemplate.expire(key,expireTime, TimeUnit.SECONDS);
                    result = true;
            }catch (Exception e){
                    e.printStackTrace();
            }
                return result;
        }


        public boolean exists(String key){
                return  redisTemplate.hasKey(key);
        }

        *//**
         * 删除
         * @param key
         * @return
         *//*
        public boolean remove(String key){
              if(exists(key)){
                      return  redisTemplate.delete(key);
              }
              return  false;
        }*/
}
