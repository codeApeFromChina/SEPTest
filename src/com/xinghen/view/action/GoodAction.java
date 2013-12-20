package com.xinghen.view.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xinghen.base.BaseAction;
import com.xinghen.domain.UsedGood;
import com.xinghen.domain.User;
import com.xinghen.service.UsedGoodService;
import com.xinghen.utils.MyIOUtils;

@Controller
@Scope("prototype")
public class GoodAction extends BaseAction<UsedGood> {

	private List<File> imageList;

	private List<String> imageListFileName;

	private List<String> imageListContentType;

	private List<String> typeList = new ArrayList<String>();

	/**
	 * 显示添加商品界面的action
	 * 
	 * @return
	 * @throws Exception
	 */
	public String saveUI() throws Exception {

		initTypeList();
		ActionContext.getContext().put("typeList", typeList);
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
		MyIOUtils.getInstance().inputImage(path, imageList, imagesName,
				usedGood);

		User tUser = new User();
		tUser.setId(1l);
		usedGood.setUser(tUser);
		usedGoodService.save(usedGood);

		usedGood = usedGoodService.getById(usedGood.getId());

		Set imageSet = usedGood.getImages();

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

	public void initTypeList() {

		typeList.add("二手商品");
		typeList.add("二手书籍");

	}

	public List<String> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
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
