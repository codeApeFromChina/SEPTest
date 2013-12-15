package com.xinghen.base;

import java.util.List;


public interface BaseService <T> {

	void save (T iterm);
	void deletById (Long id);
	void update (T iterm);
	T getById(Long id);
	List <T> findAll ();
}
