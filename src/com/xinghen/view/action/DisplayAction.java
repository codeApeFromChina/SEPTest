package com.xinghen.view.action;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.xinghen.base.BaseAction;
import com.xinghen.domain.Image;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.DisplayService;

@Controller
@Scope("prototype")
public class DisplayAction extends BaseAction<UsedGood> {

	private Long itermId;

	public String showIterm() {
		UsedGood usedGood = displayService.getById(itermId);

		usedGood.setImages(new HashSet<Image>(imageService
				.getByForeignKey(itermId)));
		
		System.out.println("=======>>>>");
		System.out.println("showIterm>>>>>");
		return "showItermUI";
	}

	// ------------------------------------
	public Long getItermId() {
		return itermId;
	}

	public void setItermId(Long itermId) {
		this.itermId = itermId;
	}

}
