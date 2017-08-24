package com.wfc.boot.support;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class BaseServiceImpl<T> implements  BaseService<T> {

    @Override
    public int deleteByPrimaryKey(Object o) {
        return getMapper().deleteByPrimaryKey(o);
    }

    @Override
    public int delete(T t) {
        return getMapper().delete(t);
    }

    @Override
    public int insert(T t) {
        return getMapper().insert(t);
    }

    @Override
    public int insertSelective(T t) {
        return getMapper().insertSelective(t);
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return getMapper().existsWithPrimaryKey(o);
    }

    @Override
    public List<T> selectAll() {
        return getMapper().selectAll();
    }

    @Override
    public T selectByPrimaryKey(Object o) {
        return(T) getMapper().selectByPrimaryKey(o);
    }

    @Override
    public int selectCount(T t) {
        return getMapper().selectCount(t);
    }

    @Override
    public List<T> select(T t) {
        return getMapper().select(t);
    }

    @Override
    public T selectOne(T t) {
        return (T) getMapper().selectOne(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return getMapper().updateByPrimaryKey(t);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return getMapper().updateByPrimaryKeySelective(t);
    }

    @Override
    public int deleteByExample(Object o) {
        return getMapper().deleteByExample(o);
    }

    @Override
    public List<T> selectByExample(Object o) {
        return getMapper().selectByExample(o);
    }

    @Override
    public int selectCountByExample(Object o) {
        return getMapper().selectCountByExample(o);
    }

    @Override
    public int updateByExample(T t, Object o) {
        return getMapper().updateByExample(t,o);
    }

    @Override
    public int updateByExampleSelective(T t, Object o) {
        return getMapper().updateByExampleSelective(t,0);
    }
}
