package com.xinghen.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.xinghen.base.BaseDaoImp;
import com.xinghen.dao.UsedGoodDao;
import com.xinghen.domain.UsedGood;

@Repository
@SuppressWarnings("unchecked")
public class UsedGoodDaoImp extends BaseDaoImp<UsedGood> implements
		UsedGoodDao<UsedGood> {

	private String hql;

	public List<UsedGood> findByType(String type) {
		int start = 0;
		int limit = 5;
		hql = "FROM " + clazz.getSimpleName() + " WHERE type = (:type)";
		Query query = getSession().createQuery(hql).setFirstResult(start);
		query.setMaxResults(limit);
		query.setParameter("type", type);
		
		return query.list();
	}
}
