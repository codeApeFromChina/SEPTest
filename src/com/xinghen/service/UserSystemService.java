package com.xinghen.service;

import com.xinghen.base.BaseService;
import com.xinghen.domain.User;


public interface UserSystemService extends BaseService <User> {
	
	User findByUserNameAndPassword(String userName, String passWord);

}
