package com.springboot.file_upload.entity;

import java.io.Serializable;

/**
 * (Titles)实体类
 *
 * @author makejava
 * @since 2020-09-21 00:55:29
 */
public class Titles implements Serializable {
    private static final long serialVersionUID = 867292547976766614L;
    
    private Integer id;
    /**
    * 标题
    */
    private String title;
    /**
    * 专业
    */
    private Integer majorId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

}