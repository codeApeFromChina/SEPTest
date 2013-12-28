package com.xinghen.view.action;

import static com.xinghen.base.BaseVar.USED_BOOK_TYPE;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.xinghen.domain.DisplayIterm;
import com.xinghen.service.IndexService;
@Controller
public class JsonAction {
	
	@Resource
	private IndexService indexService;
	private Map result = new HashMap();
	private String requestType ;
	
	private int limitNum = 10;
	
	public String nextPage (){
		List<DisplayIterm> displayList; 
		System.out.println("==========================>>>>");
		
		displayList = indexService.findByType(limitNum, USED_BOOK_TYPE);
		result.put("displayList", displayList);
		return "nextPage";
	}
	
	
	//------------------------------


	public Map getResult() {
		return result;
	}


	public String getRequestType() {
		return requestType;
	}


	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}


	public void setResult(Map result) {
		this.result = result;
	}

//	public Map getDataMap() {
//		return dataMap;
//	}
//
//
//	public void setDataMap(Map dataMap) {
//		this.dataMap = dataMap;
//	}
}
