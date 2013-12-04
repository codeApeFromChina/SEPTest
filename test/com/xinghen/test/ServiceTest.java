package com.xinghen.test;

import java.util.HashSet;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xinghen.domain.Image;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.UsedGoodService;

@Service
public class ServiceTest {

	@Resource
	private SessionFactory sessionFactory ;
	
	@Resource
	UsedGoodService usedGoodService;

	@Transactional
	public void saveUsers() {
	
//		Session session = sessionFactory.getCurrentSession();
//		session.save(new User());
//		session.save(new User());
		UsedGood usedGood = new UsedGood();
		usedGood.setDescription("description ~~~");
		usedGood.setName("name ~~");
		usedGood.setImages(new HashSet<Image> ());
		
		usedGoodService.save(usedGood);
	}

}
