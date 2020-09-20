package com.springboot.file_upload.service;

import com.springboot.file_upload.entity.Titles;
import java.util.List;

/**
 * (Titles)表服务接口
 *
 * @author makejava
 * @since 2020-09-21 00:55:29
 */
public interface TitlesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Titles queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Titles> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param titles 实例对象
     * @return 实例对象
     */
    Titles insert(Titles titles);

    /**
     * 修改数据
     *
     * @param titles 实例对象
     * @return 实例对象
     */
    Titles update(Titles titles);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}