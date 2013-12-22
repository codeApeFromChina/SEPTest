package com.xinghen.base;

import java.util.HashMap;
import java.util.Map;

public class BaseVar {
	public static String USED_GOOD_TYPE = "二手商品";
	public static String USED_BOOK_TYPE = "二手书籍";
	
	public static Map BOOK_CATEGORY = new HashMap<String, String>() {
		{
			put("B:考研书", "考研书");
			put("B:英语书", "英语书");
			put("B:数学书", "数学书");
		}
	};
	
	public static Map GOOD_CATEGORY = new HashMap<String, String>(){
		{
			put("G:手机", "手机");
			put("G:体育器材", "体育器材");
			put("G:衣服", "衣服");
		}
		
	};

}
