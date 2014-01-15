package com.xinghen.utils;

import java.util.ArrayList;

public class UserUtils {

	static private ArrayList<String> privilageList = new ArrayList<String>() {
		{
			add("/goodAction_saveUI");
			add("/userSystem_managementUI");
			add("/userSystem_deleteById");
		}
	};

	static public Boolean hasNoPrivilege(String url) {

		int len = privilageList.size();

		for (int i = 0; i < len; i++) {
			if (privilageList.get(i).equals(url)) {

				return true;
			}
		}

		return false;
	}

}
