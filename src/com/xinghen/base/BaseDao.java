package com.xinghen.base;

import java.util.List;

public interface BaseDao <T> {
	
	public void save (T iterm);
	public void delete (Long id);
	public void update (T iterm);
	public T getById (Long id);
	public List <T> getByIds (Long [] ids);
	public List <T> findAll ();
}
