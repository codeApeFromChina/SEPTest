package com.xinghen.base;

import javax.management.relation.Role;

import old_codes.RoleDao;
import old_codes.RoleDaoImp;
import old_codes.UserDao;
import old_codes.UserDaoImp;

import org.junit.Test;

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
