package com.xinghen.test;

import java.util.HashSet;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xinghen.domain.Image;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.UsedGoodService;

public class SpringTest {

	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Resource
	private UsedGoodService usedGoodServiceImp;
	
	@Test
	public void SessionFactoryTest (){
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}
	
	@Test
	public void ServiceTesst(){

		UsedGoodService usedGoodService = (UsedGoodService) ac.getBean("usedGoodServiceImp");
		UsedGood usedGood = new UsedGood();
		usedGood.setDescription("description ~~~");
		usedGood.setName("name ~~");
		usedGood.setImages(new HashSet<Image> ());
		
		usedGoodService.save(usedGood);
	}
}
