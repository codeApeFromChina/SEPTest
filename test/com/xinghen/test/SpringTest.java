package com.xinghen.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void SessionFactoryTest (){
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}
	
	@Test
	public void ServiceTesst(){

		ServiceTest serviceTest = (ServiceTest) ac.getBean("serviceTest");
		serviceTest.saveUsers();
	}
}
