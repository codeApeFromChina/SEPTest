package com.xinghen.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.xinghen.base.BaseAction;
import com.xinghen.base.BaseVar;
import com.xinghen.domain.UsedGood;

@Controller
@Scope("prototype")
public class DisplayAction extends BaseAction<UsedGood> {

	private Long itermId;
	private int requestType ;


	public String showIterm() {
		UsedGood usedGood = displayService.getById(itermId);
		
		ActionContext.getContext().getValueStack().push(usedGood);
		System.out.println("showIterm>>>>>");
		return "oneIterm";
	}
	
	
	public String displayAll (){
		System.out.println(requestType);
		String type = getType (requestType);
		
		List displayIterms = indexService.findByType(12, type);
		ActionContext.getContext().put("displayIterms", displayIterms);
		
		return "displayAll";
	}
	
	

	// ------------------------------------
	
	public String getType (int iType){
		
		switch (iType){
		case 1 :
			return BaseVar.USED_BOOK_TYPE;
		case 2 :
			return BaseVar.USED_GOOD_TYPE;
		
		}

		return null;
		
	}
	
	
	//------------------------------------
	

	public int getRequestType() {
		return requestType;
	}

	public void setRequestType(int requestType) {
		this.requestType = requestType;
	}

	public Long getItermId() {
		return itermId;
	}

	public void setItermId(Long itermId) {
		this.itermId = itermId;
	}

}
