package com.xinghen.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xinghen.base.BaseServiceImp;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.UsedGoodService;

@Service
@SuppressWarnings("unchecked")
public class UsedGoodServiceImp extends BaseServiceImp<UsedGood> implements
		UsedGoodService {

	public List<UsedGood> findAllByUserId(Long id) {
		return getSession()
				.createQuery(
						"from UsedGood g where g.user.id = :userId")
				.setParameter("userId", id)//
				.list();
	}
}
