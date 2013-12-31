package com.xinghen.utils;

import static com.xinghen.base.BaseVar.BOOK_CATEGORY;
import static com.xinghen.base.BaseVar.GOOD_CATEGORY;
import static com.xinghen.base.BaseVar.USED_BOOK_TYPE;
import static com.xinghen.base.BaseVar.USED_GOOD_TYPE;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xinghen.base.BaseVar;
import com.xinghen.domain.DisplayIterm;

public class UsedGoodHandler {

	
	/**设置 description 的显示长度
	 * @param len
	 * @param usedGoodList
	 * @return usedGoodlist
	 */
	static public List shortDisplayItermDesc(int len,
			List<DisplayIterm> usedGoodList) { 
		int listLen = usedGoodList.size();

		for (int i = 0; i < listLen; i++) {
			String desc = usedGoodList.get(i).getDescription();
			
			if (len < desc.length()) {
				String str = desc.substring(0, len);
				usedGoodList.get(i).setDescription(str);
			}
		}
		return usedGoodList;
	}
	
	static public Map getCategoryList (String type ){
		Map categoryMap = new HashMap<String, String>();
		
		
		if (type.equals(USED_BOOK_TYPE)){
			
			categoryMap.putAll(BOOK_CATEGORY);
		}
		if (type.equals(USED_GOOD_TYPE)){
			categoryMap.putAll(GOOD_CATEGORY);
		}
		return categoryMap;
	}
	
	static 	public String translateType (String iType){
		
		String str1 = "B";
		String str2 = "G";
		
		if (iType.equals (str1))
			return BaseVar.USED_BOOK_TYPE;
		
		else if (iType.equals(str2))
			return BaseVar.USED_GOOD_TYPE;
		
		return null;
		
	}
}
