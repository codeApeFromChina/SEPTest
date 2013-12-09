package com.xinghen.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xinghen.dao.UsedGoodDao;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.IndexService;

@Repository
@Transactional
public class IndexServiceImp implements IndexService{

	@Resource
	private UsedGoodDao<UsedGood> usedGoodDao ;
	
	public List findByType(String type) {
		
		List<UsedGood> usedGoodList = usedGoodDao.findByType(type);
		
		return usedGoodList;
	}
	

}
