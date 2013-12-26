package com.xinghen.service;

import java.util.List;

import com.xinghen.base.BaseService;
import com.xinghen.domain.DisplayIterm;
import com.xinghen.domain.UsedGood;

public interface DisplayService extends BaseService<UsedGood> {
	public List<DisplayIterm> findByCategory(int limit_num, String type, String category) ;

}
