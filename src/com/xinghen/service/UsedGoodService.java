package com.xinghen.service;

import java.util.List;

import com.xinghen.base.BaseService;
import com.xinghen.domain.UsedGood;

public interface UsedGoodService extends BaseService<UsedGood> {
	
	List findAllByUserId (Long id);
}
