package com.xinghen.view.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.xinghen.base.BaseAction;
import com.xinghen.domain.DisplayIterm;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.IndexService;
import com.xinghen.utils.UsedGoodHandler;

@Controller
@Scope("prototype")
@SuppressWarnings({ "unchecked"})
public class IndexAction extends BaseAction<UsedGood> {

	private List usedGoodList = new ArrayList<DisplayIterm>();

	public String homePageUI() {
		ActionContext actionContext = ActionContext.getContext();

		String queryType;
		queryType = "二手商品";
		usedGoodList = indexService.findByType(queryType);

		queryType = "二手书籍";
		List usedBookList = indexService.findByType(queryType);

		List sliderList = new ArrayList<DisplayIterm>();
		sliderList.addAll(usedBookList);
		sliderList.addAll(usedGoodList);

		sliderList = UsedGoodHandler.shortDisplayItermDesc(80, sliderList);
		actionContext.put("sliderList", sliderList);

		usedGoodList = UsedGoodHandler.shortDisplayItermDesc(40, usedGoodList);
		actionContext.put("usedGoodList", usedGoodList);

		usedBookList = UsedGoodHandler.shortDisplayItermDesc(40, usedBookList);
		actionContext.put("usedBookList", usedBookList);

		return "homePageUI";
	}

	// --------------------

	public List getDisplayItermList() {
		return usedGoodList;
	}

	public void setDisplayItermList(List displayItermList) {
		this.usedGoodList = displayItermList;
	}

}
