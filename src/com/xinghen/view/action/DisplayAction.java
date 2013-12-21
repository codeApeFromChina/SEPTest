package com.xinghen.view.action;

import java.util.HashSet;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.xinghen.base.BaseAction;
import com.xinghen.domain.Image;
import com.xinghen.domain.UsedGood;

@Controller
@Scope("prototype")
public class DisplayAction extends BaseAction<UsedGood> {

	private Long itermId;

	public String showIterm() {
		UsedGood usedGood = displayService.getById(itermId);
		
		ActionContext.getContext().getValueStack().push(usedGood);
		System.out.println("showIterm>>>>>");
		return "oneIterm";
	}

	// ------------------------------------
	public Long getItermId() {
		return itermId;
	}

	public void setItermId(Long itermId) {
		this.itermId = itermId;
	}

}
