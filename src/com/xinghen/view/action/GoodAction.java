package com.xinghen.view.action;

import java.io.File;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.xinghen.base.BaseAction;
import static com.xinghen.base.BaseVar.*;

import com.xinghen.domain.UsedGood;
import com.xinghen.domain.User;
import com.xinghen.utils.MyIOUtils;

@Controller
@Scope("prototype")
@SuppressWarnings("unchecked")
public class GoodAction extends BaseAction<UsedGood> {

	private List<File> imageList;

	private List<String> imageListFileName;

	private List<String> imageListContentType;

	private Map bookCategory = new HashMap<String, String>();

	private Map goodCategory = new HashMap<String, String>();

	/**
	 * 显示添加商品界面的action
	 * 
	 * @return
	 * @throws Exception
	 */
	public String saveUI() throws Exception {

		initTypeList();
		ActionContext.getContext().put("bookCategory", bookCategory);
		ActionContext.getContext().put("goodCategory", goodCategory);

		System.out.println("show images UI ~~~");
		return "save";
	}

	/**
	 * 添加商品action
	 * 
	 * @return
	 * @throws Exception
	 */
	public String addGood() throws Exception {

		String path = ServletActionContext.getServletContext().getRealPath("/");
		List<String> imagesName = getImageListFileName();
		UsedGood usedGood = getModel();

		setType(usedGood);

		MyIOUtils.getInstance().inputImage(path, imageList, imagesName,
				usedGood);

		User tUser = (User) ActionContext.getContext().getSession().get("user");
		
		usedGood.setUser(tUser);
		usedGoodService.save(usedGood);

		usedGood = usedGoodService.getById(usedGood.getId());

		return "toShowUI";
	}

	/**
	 * 展示添加的商品界面的action
	 * 
	 * @return
	 * @throws Exception
	 */
	public String showGoodUI() throws Exception {

		return "toShowUI";
	}

	// ===================================================================================

	public void setType(UsedGood usedGood) {

		String rowType = usedGood.getType();
		String type1 = USED_BOOK_TYPE;
		String type2 = USED_GOOD_TYPE;
		String str[] = rowType.split(":");
		System.out.println(str[0]);
		System.out.println(str[1]);

		if (str[0].equals("B")) {
			usedGood.setType(type1);
			usedGood.setDetailedCategory(str[1]);
		} else {

			usedGood.setType(type2);
			usedGood.setDetailedCategory(str[1]);
		}
	}

	public void initTypeList() {
		bookCategory.putAll(BOOK_CATEGORY);
		goodCategory.putAll(GOOD_CATEGORY);
	}

	public Map getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(Map bookCategory) {
		this.bookCategory = bookCategory;
	}

	public Map getGoodCategory() {
		return goodCategory;
	}

	public void setGoodCategory(Map goodCategory) {
		this.goodCategory = goodCategory;
	}

	public List<File> getImageList() {
		return imageList;
	}

	public void setImageList(List<File> imageList) {
		this.imageList = imageList;
	}

	public List<String> getImageListFileName() {
		return imageListFileName;
	}

	public void setImageListFileName(List<String> imageListFileName) {
		this.imageListFileName = imageListFileName;
	}

	public List<String> getImageListContentType() {
		return imageListContentType;
	}

	public void setImageListContentType(List<String> imageListContentType) {
		this.imageListContentType = imageListContentType;
	}

}
