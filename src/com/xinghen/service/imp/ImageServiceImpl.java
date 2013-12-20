package com.xinghen.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xinghen.base.BaseServiceImp;
import com.xinghen.domain.Image;
import com.xinghen.service.ImageService;

@Service
@SuppressWarnings("unchecked")
public class  ImageServiceImpl  extends BaseServiceImp<Image> implements ImageService {
	
	public List <Image> getByForeignKey (Long foreignKey){
		String sql = "select * from image where usedGoodId = ?";

		return getSession().createSQLQuery(sql)//
				.setParameter(0, foreignKey)//
				.list();
	}

}
