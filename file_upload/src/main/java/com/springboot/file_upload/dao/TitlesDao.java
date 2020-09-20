package com.springboot.file_upload.dao;

import com.springboot.file_upload.entity.Titles;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Titles)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-21 00:55:29
 */
public interface TitlesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Titles queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Titles> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param titles 实例对象
     * @return 对象列表
     */
    List<Titles> queryAll(Titles titles);

    /**
     * 新增数据
     *
     * @param titles 实例对象
     * @return 影响行数
     */
    int insert(Titles titles);

    /**
     * 修改数据
     *
     * @param titles 实例对象
     * @return 影响行数
     */
    int update(Titles titles);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}