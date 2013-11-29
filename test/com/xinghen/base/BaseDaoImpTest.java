package com.xinghen.base;

import javax.management.relation.Role;

import org.junit.Test;

import com.xinghen.dao.RoleDao;
import com.xinghen.dao.UserDao;
import com.xinghen.dao.imp.RoleDaoImp;
import com.xinghen.dao.imp.UserDaoImp;
import com.xinghen.domain.User;

public class BaseDaoImpTest {

	@Test
	public void testBaseDaoImp() {
		UserDao userDao = new UserDaoImp();
		RoleDao roleDao = new RoleDaoImp();
		
		User user = (User) userDao.getById(1L); 
		Role role = (Role) roleDao.getById(1L);
		
	}

}
