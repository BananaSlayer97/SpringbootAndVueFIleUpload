package com.springboot.file_upload.entity;

import java.io.Serializable;

/**
 * (Majors)实体类
 *
 * @author makejava
 * @since 2020-09-21 00:54:12
 */
public class Majors implements Serializable {
    private static final long serialVersionUID = -59497569004317334L;
    
    private Integer id;
    /**
    * 专业
    */
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}