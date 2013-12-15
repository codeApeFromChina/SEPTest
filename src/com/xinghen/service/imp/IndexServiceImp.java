package com.xinghen.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xinghen.dao.UsedGoodDao;
import com.xinghen.domain.DisplayIterm;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.IndexService;

@Service
@Transactional
public class IndexServiceImp implements IndexService{

	@Resource
	private UsedGoodDao  usedGoodDao ;
	
	public List findByType(String type) {
		
		List<DisplayIterm> usedGoodList = usedGoodDao.findByType(type);
		
		System.out.println(usedGoodList);
		
		return usedGoodList;
	}
	

}
