package com.xinghen.dao;

import java.util.List;

import com.xinghen.base.BaseDao;
import com.xinghen.domain.UsedGood;

public interface UsedGoodDao<T> extends BaseDao<T> {
	
	List<UsedGood>findByType (String type);
	
}
