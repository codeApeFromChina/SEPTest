package com.xinghen.service.imp;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Service;

import com.xinghen.base.BaseServiceImp;
import com.xinghen.domain.User;
import com.xinghen.service.UserSystemService;

@Service
public class UserSystemServiceImpl extends BaseServiceImp<User> implements
		UserSystemService {

	public User findByUserNameAndPassword(String userName, String passWord) {

		Session session = getSession();
		String sql = "select distinct id,  name, userName, phoneNumber, schoolName, location, email from user "
				+ "where userName = :userName and passWord = :passWord";

		Query query = session.createSQLQuery(sql)
				.addScalar("name", Hibernate.STRING)
				.addScalar("id", Hibernate.LONG)
				.addScalar("userName", Hibernate.STRING)
				.addScalar("phoneNumber", Hibernate.STRING)
				.addScalar("schoolName", Hibernate.STRING)
				.addScalar("location", Hibernate.STRING)
				.addScalar("email", Hibernate.STRING);

		query.setParameter("userName", userName);
		query.setParameter("passWord", passWord);

		query.setResultTransformer(Transformers.aliasToBean(User.class));

		return (User) query.uniqueResult();
	}

}
