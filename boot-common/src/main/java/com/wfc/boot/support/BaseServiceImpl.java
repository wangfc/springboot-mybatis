package com.wfc.boot.support;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class BaseServiceImpl<T> implements  BaseService<T> {
    protected BaseMapper baseMapper;

    @Override
    public int deleteByPrimaryKey(Object o) {
        return baseMapper.deleteByPrimaryKey(o);
    }

    @Override
    public int delete(T t) {
        return baseMapper.delete(t);
    }

    @Override
    public int insert(T t) {
        return baseMapper.insert(t);
    }

    @Override
    public int insertSelective(T t) {
        return baseMapper.insertSelective(t);
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return baseMapper.existsWithPrimaryKey(o);
    }

    @Override
    public List<T> selectAll() {
        return baseMapper.selectAll();
    }

    @Override
    public T selectByPrimaryKey(Object o) {
        return(T)baseMapper.selectByPrimaryKey(o);
    }

    @Override
    public int selectCount(T t) {
        return baseMapper.selectCount(t);
    }

    @Override
    public List<T> select(T t) {
        return baseMapper.select(t);
    }

    @Override
    public T selectOne(T t) {
        return (T)baseMapper.selectOne(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return baseMapper.updateByPrimaryKey(t);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return baseMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public int deleteByExample(Object o) {
        return baseMapper.deleteByExample(o);
    }

    @Override
    public List<T> selectByExample(Object o) {
        return baseMapper.selectByExample(o);
    }

    @Override
    public int selectCountByExample(Object o) {
        return baseMapper.selectCountByExample(o);
    }

    @Override
    public int updateByExample(T t, Object o) {
        return baseMapper.updateByExample(t,o);
    }

    @Override
    public int updateByExampleSelective(T t, Object o) {
        return baseMapper.updateByExampleSelective(t,0);
    }
}
