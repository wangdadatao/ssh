package com.datao.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.inject.Inject;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by 海涛 on 2016/5/19.
 */
public class BaseDao<T, PK extends Serializable> {

    @Inject
    private SessionFactory sessionFactory;
    private Class<T> clazz;

    public BaseDao() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) type.getActualTypeArguments()[0];
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    //查询所有
    public List<T> findAll() {
        Criteria criteria = getSession().createCriteria(clazz);
        return criteria.list();
    }

    //保存或更新
    public void save(T entity) {
        getSession().saveOrUpdate(entity);
    }

    //根据id查找对象
    public T findById(Integer id){
        return (T) getSession().get(clazz,id);
    }

    //删除对象
    public void del(Integer id){
        getSession().delete(findById(id));
    }

    //删除对象
    public void del(T entity){
        getSession().delete(entity);
    }

}
