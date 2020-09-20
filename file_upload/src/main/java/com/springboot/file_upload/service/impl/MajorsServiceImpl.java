package com.springboot.file_upload.service.impl;

import com.springboot.file_upload.entity.Majors;
import com.springboot.file_upload.dao.MajorsDao;
import com.springboot.file_upload.service.MajorsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Majors)表服务实现类
 *
 * @author makejava
 * @since 2020-09-21 00:54:26
 */
@Service("majorsService")
public class MajorsServiceImpl implements MajorsService {
    @Resource
    private MajorsDao majorsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Majors queryById(Integer id) {
        return this.majorsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Majors> queryAllByLimit(int offset, int limit) {
        return this.majorsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param majors 实例对象
     * @return 实例对象
     */
    @Override
    public Majors insert(Majors majors) {
        this.majorsDao.insert(majors);
        return majors;
    }

    /**
     * 修改数据
     *
     * @param majors 实例对象
     * @return 实例对象
     */
    @Override
    public Majors update(Majors majors) {
        this.majorsDao.update(majors);
        return this.queryById(majors.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.majorsDao.deleteById(id) > 0;
    }
}