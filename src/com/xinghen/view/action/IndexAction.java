package com.xinghen.view.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xinghen.domain.UsedGood;
import com.xinghen.service.IndexService;


@Controller
@Scope("prototype")
public class IndexAction extends ActionSupport {
	
	@Resource
	private IndexService indexService ;
	private List usedGoodList = new ArrayList<UsedGood> ();
	
	public String homePageUI (){
		
		String queryType ;
		queryType = "二手商品";
		usedGoodList = indexService.findByType (queryType);
//		ActionContext.getContext().put("usedGoodList", usedGoodList);
		
		System.out.println("==========================++++++++++++++=");
		System.out.println(usedGoodList.size());
		
		
		queryType = "used_book";
		List usedBookList = indexService.findByType (queryType);
		
		ActionContext.getContext().put("usedBookList", usedBookList);
		System.out.println("show first page ~~");
		
		return "homePageUI";
	}

	public List getUsedGoodList() {
		return usedGoodList;
	}
	
	public void setUsedGoodList(List usedGoodList) {
		this.usedGoodList = usedGoodList;
	}
}
