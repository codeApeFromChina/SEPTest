package com.xinghen.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SuppressWarnings("unchecked")
public class BaseServiceImp<T> implements BaseService<T> {

	@Resource
	private SessionFactory sessionFactory;
	protected Class<T> clazz;

	public BaseServiceImp() {
		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	public void save(T iterm) {
		getSession().save(iterm);
	}

	public void deletById(Long id) {
		getSession().delete(getSession().get(clazz, id));
	}

	public void update(T iterm) {
		getSession().update(iterm);

	}

	public T getById(Long id) {
		if (id == null)
			return null;
		return (T) getSession().get(clazz, id);
	}

	public List<T> getByIds(Long[] ids) {
		
		
		return getSession()
				.createQuery(
						"from " + clazz.getSimpleName() + "where id in (:ids)")
				.setParameterList("ids", ids).list();
	}

	public List<T> findAll() {

		return getSession().createQuery("from" + clazz.getSimpleName()).list();
	}

	public Session getSession() {

		return sessionFactory.getCurrentSession();
	}

}
