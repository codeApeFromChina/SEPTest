package com.xinghen.view.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.xinghen.domain.DisplayIterm;
import com.xinghen.service.JsonRequestService;
import com.xinghen.utils.UsedGoodHandler;

@Controller
@Scope("prototype")
public class JsonAction {

	@Resource
	private JsonRequestService jsonRequestService;

	private Map<String, List<DisplayIterm>> result = new HashMap<String, List<DisplayIterm>>();
	private String requestType;
	private int pageNum;
	private boolean hasNext = true;

	private int limitNum = 10;

	public String nextPage() {
		List<DisplayIterm> displayList = null;
		System.out.println("==========================>>>>");
		String[] tmp = requestType.split(":");
		String type = UsedGoodHandler.translateType(tmp[0]);

		if (hasNext == true) {

			if (tmp.length == 1) {
				displayList = jsonRequestService.findNextPage(pageNum, limitNum,
						type, null);

			} else if (tmp.length == 2) {

				displayList = jsonRequestService.findNextPage(pageNum, limitNum,
						type, tmp[1]);
			}
			if (displayList.size() < limitNum) {
				hasNext = false;
			}
			result.put("displayList", displayList);
		}

		if (displayList != null)
			System.out.println("list length is : " + displayList.size());

		System.out.println("nextPage : " + pageNum + " requestType : "
				+ type);
		return "nextPage";
	}

	// ------------------------------

	public Map<String, List<DisplayIterm>> getResult() {
		return result;
	}

	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public void setResult(Map<String, List<DisplayIterm>> result) {
		this.result = result;
	}

	// public Map getDataMap() {
	// return dataMap;
	// }
	//
	//
	// public void setDataMap(Map dataMap) {
	// this.dataMap = dataMap;
	// }
}
