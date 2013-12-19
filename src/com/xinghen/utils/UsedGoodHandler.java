package com.xinghen.utils;

import java.util.List;

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

}
