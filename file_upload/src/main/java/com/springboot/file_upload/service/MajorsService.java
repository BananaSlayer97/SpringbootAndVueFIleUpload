package com.springboot.file_upload.service;

import com.springboot.file_upload.entity.Majors;
import java.util.List;

/**
 * (Majors)表服务接口
 *
 * @author makejava
 * @since 2020-09-21 00:54:25
 */
public interface MajorsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Majors queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Majors> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param majors 实例对象
     * @return 实例对象
     */
    Majors insert(Majors majors);

    /**
     * 修改数据
     *
     * @param majors 实例对象
     * @return 实例对象
     */
    Majors update(Majors majors);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}