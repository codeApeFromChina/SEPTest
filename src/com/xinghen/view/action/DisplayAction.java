package com.xinghen.view.action;

import static com.xinghen.base.BaseVar.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	private String requestType ;
	private Integer limit_num = 12;

	
	public String showIterm() {
		UsedGood usedGood = displayService.getById(itermId);
		
		ActionContext.getContext().getValueStack().push(usedGood);
		System.out.println("showIterm>>>>>");
		return "oneIterm";
	}
	
	public String displayAll (){
		System.out.println(requestType);
		String[] tmp = requestType.split (":");
		
		String type = getType (tmp[0]);
//		String category = tmp[1];
		
		Map categoryMap = getCategory(type);
		
		ActionContext.getContext().put("categoryMap", categoryMap);
		
		List displayIterms = indexService.findByType(limit_num, type);
		
		ActionContext.getContext().put("displayIterms", displayIterms);
		
		return "displayAll";
	}
	
	public String displayByCategory (){
		
		String [] tmp = requestType.split(":");
		String type = getType (tmp[0]);
		String category = tmp [1];
		
		Map categoryMap = getCategory(type);
		ActionContext.getContext().put("categoryMap", categoryMap);
		
		List displayIterms = displayService.findByCategory(limit_num, type, category);
		ActionContext.getContext().put("displayIterms", displayIterms);

		
		return "displayByCategory";
	}
	
	

	// ------------------------------------
	
	public Map getCategory (String type ){
		Map categoryMap = new HashMap<String, String>();
		
		
		if (type.equals(USED_BOOK_TYPE)){
			
			categoryMap.putAll(BOOK_CATEGORY);
		}
		if (type.equals(USED_GOOD_TYPE)){
			categoryMap.putAll(GOOD_CATEGORY);
		}
		return categoryMap;
	}

	
	public String getType (String iType){
		
		String str1 = "B";
		String str2 = "G";
		
		if (iType.equals (str1))
			return BaseVar.USED_BOOK_TYPE;
		
		else if (iType.equals(str2))
			return BaseVar.USED_GOOD_TYPE;
		
		return null;
		
	}
	
	//------------------------------------
	
	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	

	public Long getItermId() {
		return itermId;
	}

	public void setItermId(Long itermId) {
		this.itermId = itermId;
	}

}
