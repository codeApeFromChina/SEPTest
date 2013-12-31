package com.xinghen.service.imp;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xinghen.base.BaseServiceImp;
import com.xinghen.domain.DisplayIterm;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.DisplayService;

@Service
public class DisplayServiceImp extends BaseServiceImp<UsedGood> implements
		DisplayService {

	private String sql;

	public List<DisplayIterm> findByCategory(int limit_num, String type,
			String category) {
		int start = 0;
		sql = "select ug.id, ug.name, ug.description, ug.price, img.imageName from "
				+ "usedGood ug join image img on img.usedGOodId = ug.id"
				+ " where ug.type =:type and ug.detailedCategory =:category and img.imageType = 1 limit :limit_num";
		Session session = getSession();

		Query query = getSession().createSQLQuery(sql)
				.addScalar("id", Hibernate.LONG)
				.addScalar("name", Hibernate.STRING)
				.addScalar("description", Hibernate.STRING)
				.addScalar("price", Hibernate.FLOAT)
				.addScalar("imageName", Hibernate.STRING);

		query.setParameter("limit_num", limit_num);
		query.setParameter("type", type);
		query.setParameter("category", category);
		
		query.setResultTransformer(Transformers.aliasToBean(DisplayIterm.class));

		List<DisplayIterm> displayItermList = query.list();

		System.out.println(displayItermList.toString());

		return displayItermList;
	}
}
