package com.springboot.file_upload.service.impl;

import com.springboot.file_upload.entity.Titles;
import com.springboot.file_upload.dao.TitlesDao;
import com.springboot.file_upload.service.TitlesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Titles)表服务实现类
 *
 * @author makejava
 * @since 2020-09-21 00:55:29
 */
@Service("titlesService")
public class TitlesServiceImpl implements TitlesService {
    @Resource
    private TitlesDao titlesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Titles queryById(Integer id) {
        return this.titlesDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Titles> queryAllByLimit(int offset, int limit) {
        return this.titlesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param titles 实例对象
     * @return 实例对象
     */
    @Override
    public Titles insert(Titles titles) {
        this.titlesDao.insert(titles);
        return titles;
    }

    /**
     * 修改数据
     *
     * @param titles 实例对象
     * @return 实例对象
     */
    @Override
    public Titles update(Titles titles) {
        this.titlesDao.update(titles);
        return this.queryById(titles.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.titlesDao.deleteById(id) > 0;
    }
}