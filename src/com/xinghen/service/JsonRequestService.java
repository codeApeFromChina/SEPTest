package com.xinghen.service;

import java.util.List;

import com.xinghen.base.BaseService;
import com.xinghen.domain.DisplayIterm;
import com.xinghen.domain.UsedGood;

public interface JsonRequestService extends BaseService<UsedGood> {
	
	List<DisplayIterm> findNextPage (int nextPage, int limitNum, String type, String category);

}
