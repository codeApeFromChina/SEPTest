package com.xinghen.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xinghen.service.DisplayService;
import com.xinghen.service.ImageService;
import com.xinghen.service.IndexService;
import com.xinghen.service.UsedGoodService;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

	@Resource
	protected UsedGoodService usedGoodService;
	@Resource
	protected IndexService indexService;
	@Resource 
	protected DisplayService displayService;
	@Resource
	protected ImageService imageService;
	
	protected T model;

	public BaseAction() {
		try {
			Class clazz;
			ParameterizedType pt = (ParameterizedType) this.getClass()
					.getGenericSuperclass();
			clazz = (Class) pt.getActualTypeArguments()[0];
			model = (T) clazz.newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public T getModel() {

		return model;
	}

}
