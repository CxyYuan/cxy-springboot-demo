package com.cxy.test.generator.service.base;

import com.cxy.test.generator.config.tkmapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *
 * @author Cxy
 * @date 2019/4/20
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {


    @Autowired
    protected MyMapper<T> mapper;

    public MyMapper<T> getMapper() {
        return mapper;
    }

    @Override
    public List<T> select(T record) {
        return mapper.select(record);
    }

    @Override
    public T selectByPrimaryKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public T selectOne(T record) {
        return mapper.selectOne(record);
    }

    @Override
    public int selectCount(T record) {
        return mapper.selectCount(record);
    }

    @Override
    public int insert(T record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return mapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(T record) {
        return mapper.delete(record);
    }

    @Override
    public int deleteByPrimaryKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

}
