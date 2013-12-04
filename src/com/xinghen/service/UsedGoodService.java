package com.xinghen.service;

import java.util.List;

import com.xinghen.domain.UsedGood;

public interface UsedGoodService {
	
	void save (UsedGood usedGood);
	void delet (Long id);
	void update (UsedGood usedGood);
	UsedGood getById(Long id);
	List <UsedGood> findAll ();

}
