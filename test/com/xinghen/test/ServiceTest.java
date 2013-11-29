package com.xinghen.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xinghen.domain.User;

@Service
public class ServiceTest {

	@Resource
	private SessionFactory sessionFactory ;

	@Transactional
	public void saveUsers() {
	
		Session session = sessionFactory.getCurrentSession();
		session.save(new User());
		session.save(new User());
	}

}
