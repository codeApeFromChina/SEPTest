package com.xinghen.view.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xinghen.domain.Image;
import com.xinghen.domain.UsedGood;
import com.xinghen.domain.User;
import com.xinghen.service.UsedGoodService;
import com.xinghen.utils.MyIOUtils;

@Controller
@Scope("prototype")
public class GoodAction extends ActionSupport  implements ModelDriven<UsedGood>
{
	@Resource
	private UsedGoodService usedGoodService;
	
	private UsedGood usedGood = new UsedGood();

	private List<File> imageList;

	private List<String> imageListFileName;

	private List<String> imageListContentType;

	private List<String> typeList = new ArrayList<String>();
	
	
	
	public UsedGood getModel() {
		return usedGood;
	}

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

		MyIOUtils.getInstance().inputImage(path, imageList, imagesName,
				getUsedGood());
		
		User tUser = new User();
		tUser.setId(1l);
		usedGood.setUser(tUser);
		usedGoodService.save(usedGood);
		
		usedGood = usedGoodService.getById(usedGood.getId());
	
		Set imageSet = usedGood.getImages();
		
//==================    輸出文件列表的每個文件名
//		Iterator it =imageSet.iterator();
//		
//		while (it.hasNext())
//		{
//			System.out.println(((Image) it.next()).getImageName());
//		}
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


	public void initTypeList (){
		
		typeList.add("二手商品");
		typeList.add("二手书籍");
		
	}
	
	public UsedGood getUsedGood() {
		return usedGood;
	}

	public List<String> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}

	public void setUsedGood(UsedGood usedGood) {
		this.usedGood = usedGood;
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
