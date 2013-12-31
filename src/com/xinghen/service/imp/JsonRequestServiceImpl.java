package com.xinghen.service.imp;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Service;

import com.xinghen.base.BaseServiceImp;
import com.xinghen.domain.DisplayIterm;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.JsonRequestService;

@Service
public class JsonRequestServiceImpl extends BaseServiceImp<UsedGood> implements
		JsonRequestService {

	private String sql;

	public List<DisplayIterm> findNextPage(int nextPage, int limitNum, String type,
			String category) {

		List<DisplayIterm> displayItermList = null;

		if (category == null) {

			sql = "select ug.id, ug.name, ug.description, ug.price, img.imageName from "
					+ "usedGood ug join image img on img.usedGOodId = ug.id"
					+ " where ug.type =:type and img.imageType = 1 limit :nextPage, :limitNum";

			Query query = getSession().createSQLQuery(sql)
					.addScalar("id", Hibernate.LONG)
					.addScalar("name", Hibernate.STRING)
					.addScalar("description", Hibernate.STRING)
					.addScalar("price", Hibernate.FLOAT)
					.addScalar("imageName", Hibernate.STRING);

			query.setParameter("limitNum", limitNum);
			query.setParameter("type", type);
			query.setParameter("nextPage", nextPage * limitNum);

			query.setResultTransformer(Transformers
					.aliasToBean(DisplayIterm.class));

			displayItermList = query.list();

			System.out.println(displayItermList.toString());
		}
		else {

			sql = "select ug.id, ug.name, ug.description, ug.price, img.imageName from "
					+ "usedGood ug join image img on img.usedGOodId = ug.id"
					+ " where ug.type =:type and ug.detailedCategory =:category and img.imageType = 1 limit :nextPage, :limitNum";
			Session session = getSession();

			Query query = getSession().createSQLQuery(sql)
					.addScalar("id", Hibernate.LONG)
					.addScalar("name", Hibernate.STRING)
					.addScalar("description", Hibernate.STRING)
					.addScalar("price", Hibernate.FLOAT)
					.addScalar("imageName", Hibernate.STRING);

			query.setParameter("limitNum", limitNum);
			query.setParameter("type", type);
			query.setParameter("category", category);
			query.setParameter("nextPage", nextPage * limitNum);

			query.setResultTransformer(Transformers
					.aliasToBean(DisplayIterm.class));

			displayItermList = query.list();

			System.out.println(displayItermList.toString());
		}

		return displayItermList;
	}

}
