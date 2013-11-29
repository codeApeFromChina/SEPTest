package com.xinghen.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@SuppressWarnings("unchecked")
public class BaseDaoImp<T> implements BaseDao<T>{

	@Resource
	private SessionFactory sessionFactory ;
	private Class <T> clazz;
	
	public BaseDaoImp (){
		
//	得到泛型的父类的类型参数
	ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
	clazz = (Class<T>) pt.getActualTypeArguments()[0];
	System.out.println(clazz.getName());
	}
	
	
	
	protected Session getSession () {
		return sessionFactory.getCurrentSession();
	}
	
	public void save(T user) {
		// TODO Auto-generated method stub

		 getSession().save(user);
	}

	public void delete(Long id) {
		
		getSession().delete(getSession().get(clazz, id));
	}

	public void update(T user) {
		
		getSession().update(user);
		
	}

	public T getById(Long id) {
		
		return (T) getSession().get(clazz, id);
	}

	public List<T> getByIds(Long[] ids) {
		return getSession().createQuery("from " + clazz.getSimpleName() + "where id in (:ids)")//
				.setParameterList("ids", ids)//
				.list();
	}

	public List<T> findAll() {
		return getSession().createQuery("from " + clazz//
				.getSimpleName())//
				.list();
	}

}
