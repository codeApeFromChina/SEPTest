package com.xinghen.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xinghen.dao.UsedGoodDao;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.UsedGoodService;

@Service
@Transactional
public class UsedGoodServiceImp implements UsedGoodService {

	@Resource
	private UsedGoodDao usedGoodDao;

	public void save(UsedGood usedGood) {
		usedGoodDao.save(usedGood);
	}

	public void delet(Long id) {
		// TODO Auto-generated method stub

	}

	public void update(UsedGood usedGood) {
		// TODO Auto-generated method stub

	}

	public UsedGood getById(Long id) {

		return (UsedGood) usedGoodDao.getById(id);
	}

	public List<UsedGood> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
