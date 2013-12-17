package com.xinghen.dao_test;

import java.util.List;

import javax.annotation.Resource;

import old_codes.UsedGoodDao;
import old_codes.UsedGoodDaoImp;

import org.junit.Test;

import com.xinghen.service.IndexService;
import com.xinghen.service.imp.IndexServiceImp;
import com.xinghen.service.imp.UsedGoodServiceImp;

public class DaoTest {

	
	@Test
	public void firstImageFindTest(){
		UsedGoodDao usedGoodDao = new UsedGoodDaoImp();
		
		String type = "二手商品";

		List list = usedGoodDao.findByType(type);
		
		System.out.println(list);
		
	}
	
}
