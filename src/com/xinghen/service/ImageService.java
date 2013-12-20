package com.xinghen.service;

import java.util.List;

import com.xinghen.base.BaseService;
import com.xinghen.domain.Image;

public interface ImageService extends BaseService<Image> {

	List<Image> getByForeignKey(Long foreignKey);
}
