package com.xinghen.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xinghen.base.BaseDaoImp;
import com.xinghen.dao.UsedGoodDao;
import com.xinghen.domain.UsedGood;

@Transactional
@Repository
public class UsedGoodDaoImp extends BaseDaoImp<UsedGood> implements
		UsedGoodDao<UsedGood> {

	private String hql;

	public List<UsedGood> findByType(String type) {
		int start = 0;
		int limit = 5;

		// "select new com.xinghen.domain.UsedGood(e.id , e.name, e.price, e.description, e.firstImage) from Employee e";

//		hql = "select new com.xinghen.domain.UsedGood(e.id , e.name, e.price, e.description, e.firstImage) from "+ clazz.getSimpleName() + " e  WHERE e.type in (:type)";
//		hql = "select new com.xinghen.domain.UsedGood(id , name, price, description, firstImage) from "+ clazz.getSimpleName() + " WHERE type = :type";
		
		hql = "from " + clazz.getSimpleName() + " where type = '二手商品'";
		// hql = "select (:select_list)" + " FROM " + clazz.getSimpleName() +
		// " WHERE type = :type";
		Query query = getSession().createQuery(hql);//
		// .setFirstResult(start);
		// query.setMaxResults(limit);
		// query.setParameterList("select_list", selectList);

//		query.setParameter("type", "二手商品");
//		query.setParameter("type", type);
		
		System.out.println(query.getQueryString());

		return query.list();
	}
}
