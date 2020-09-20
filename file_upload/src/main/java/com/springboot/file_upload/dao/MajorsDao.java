package com.springboot.file_upload.dao;

import com.springboot.file_upload.entity.Majors;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Majors)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-21 00:54:24
 */
@Mapper
public interface MajorsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Majors queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Majors> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param majors 实例对象
     * @return 对象列表
     */
    List<Majors> queryAll(Majors majors);

    /**
     * 新增数据
     *
     * @param majors 实例对象
     * @return 影响行数
     */
    int insert(Majors majors);

    /**
     * 修改数据
     *
     * @param majors 实例对象
     * @return 影响行数
     */
    int update(Majors majors);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}