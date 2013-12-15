package com.xinghen.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xinghen.base.BaseDaoImp;
import com.xinghen.dao.UsedGoodDao;
import com.xinghen.domain.DisplayIterm;
import com.xinghen.domain.UsedGood;

@Transactional
@Repository
public class UsedGoodDaoImp extends BaseDaoImp<UsedGood> implements
		UsedGoodDao<UsedGood> {

	private String hql;
	private String sql;

	public List<DisplayIterm> findByType(String type) {
		int start = 0;
		int limit = 5;

		// "select new com.xinghen.domain.UsedGood(e.id , e.name, e.price, e.description, e.firstImage) from Employee e";

		// hql =
		// "select new com.xinghen.domain.UsedGood(e.id , e.name, e.price, e.description, e.firstImage) from "+
		// clazz.getSimpleName() + " e  WHERE e.type in (:type)";
		// hql =
		// "select new com.xinghen.domain.UsedGood(id , name, price, description, firstImage) from "+
		// clazz.getSimpleName() + " WHERE type = :type";

		// hql = "from " + clazz.getSimpleName() + " where type = '二手商品'";

		// sql =
		// "select ug.id, ug.name, ug.description, ug.price, img.imageName from usedGood as ug join image as img where ug.type = '二手商品'";

		sql = "select ug.id, ug.name, ug.description, ug.price, img.imageName from "
				+

				"usedGood ug join image img on img.usedGOodId = ug.id" +

				" where ug.type = :type and img.imageType = 1";

		// hibernate使用hql实现的查询：

		// ----------------------------------------------------------------------->>>>>
		// hql = "select (:select_list)" + " FROM " + clazz.getSimpleName() +
		// " WHERE type = :type";
		// Query query = getSession().createQuery(hql);//
		// .setFirstResult(start);
		// query.setMaxResults(limit);
		// query.setParameterList("select_list", selectList);

		// query.setParameter("type", "二手商品");
		// query.setParameter("type", type);
		// ------------------------------------------------------------------------>>>>>

		Query query = getSession().createSQLQuery(sql)
				.addScalar("id", Hibernate.LONG)
				.addScalar("name", Hibernate.STRING)
				.addScalar("description", Hibernate.STRING)
				.addScalar("price", Hibernate.FLOAT)
				.addScalar("imageName", Hibernate.STRING);

		query.setParameter("type", type);
		query.setResultTransformer(Transformers.aliasToBean(DisplayIterm.class));

		List<DisplayIterm> displayItermList = query.list();

		System.out.println(displayItermList.toString());

		return displayItermList;
	}
}
