package com.xinghen.utils;

import java.util.List;

import com.xinghen.domain.DisplayIterm;

public class UsedGoodHandler {

	static public List shortDisplayItermDesc(List<DisplayIterm> usedGoodList) {
		DisplayIterm displayIterm = new DisplayIterm();
		int listLen = usedGoodList.size();

		for (int i = 0; i < listLen; i++) {
			String str = usedGoodList.get(i).getDescription().substring(0, 40);
			usedGoodList.get(i).setDescription(str);
		}
		return usedGoodList;
	}

}
