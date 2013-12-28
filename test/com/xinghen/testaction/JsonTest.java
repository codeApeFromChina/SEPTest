package com.xinghen.testaction;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionSupport;


@Controller
public class JsonTest extends ActionSupport {
	
	private Map dataMap = new HashMap<String, Map<String, Image>> ();
	

	public String execute (){
		
		dataMap.clear();
		Map imageMaps = new HashMap<String, Image>(){{
			
			put("image1", new Image ("img/1.jpg", 400));
			put("image2", new Image ("img/2.jpg", 400));
			put("image3", new Image ("img/3.jpg", 400));
			put("image4", new Image ("img/4.jpg", 400));
			put("image5", new Image ("img/5.jpg", 400));
			put("image6", new Image ("img/6.jpg", 400));
			put("image7", new Image ("img/7.jpg", 400));
			put("image8", new Image ("img/8.jpg", 400));
			
		}};
		
		dataMap.put("imageMaps", imageMaps);
		dataMap.put("success", true);
		System.out.println("json test~~~");
		return "success";
	}


	public Map getDataMap() {
		return dataMap;
	}


	public void setDataMap(Map dataMap) {
		this.dataMap = dataMap;
	}

	

	
}
