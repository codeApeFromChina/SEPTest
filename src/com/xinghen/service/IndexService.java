package com.xinghen.service;

import java.util.List;

import com.xinghen.base.BaseService;
import com.xinghen.domain.DisplayIterm;
import com.xinghen.domain.UsedGood;

public interface IndexService extends BaseService <UsedGood> {
	List findByType( int limit ,String type );

}
