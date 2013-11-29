package com.xinghen.dao;

import com.xinghen.base.BaseDao;


public interface UserDao<T> extends BaseDao<T> {
	
	public void checkUserNamePassword();

}
