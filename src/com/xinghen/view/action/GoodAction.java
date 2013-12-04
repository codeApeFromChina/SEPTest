package com.xinghen.view.action;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xinghen.domain.UsedGood;
import com.xinghen.domain.User;
import com.xinghen.service.UsedGoodService;
import com.xinghen.utils.MyIOUtils;

/**
 * @author xinghen
 *
 */
@Controller
@Scope("prototype")
public class GoodAction extends ActionSupport // implements ModelDriven
												// <UsedGood>
{
	@Resource
	private UsedGoodService usedGoodService;

	private List<File> images;

	private UsedGood usedGood;

	private List<String> imagesFileName;
	
	private List <String> imagesContentType; 


	



	/**显示添加商品界面的action
	 * @return
	 * @throws Exception
	 */
	public String saveUI() throws Exception {

		System.out.println("show images UI ~~~");
		return "save";
	}

	


	/**添加商品action
	 * @return
	 * @throws Exception
	 */
	public String addGood() throws Exception {

		String path = ServletActionContext.getServletContext().getRealPath("/");
		List<String> imagesName = getImagesFileName();
		
		MyIOUtils.getInstance().inputImage(path, images, imagesName, getUsedGood());
		User tUser = new User();
		tUser.setId(1l);
		usedGood.setUser(tUser);
		usedGoodService.save(usedGood);
		
		System.out.println("==========================>>>>");

		System.out.println(usedGood.getId());
		
		usedGood = usedGoodService.getById(usedGood.getId());
		ActionContext.getContext().put("usedGood", usedGood);
		
		return "toUploadResult";
	}
	
	/**展示添加的商品界面的action
	 * @return
	 * @throws Exception
	 */
	public String showGoodUI () throws Exception {
		
		
		return "list";
	}
	
	
	public List<File> getImages() {
		return images;
	}


	public void setImages(List<File> images) {
		this.images = images;
	}


	public UsedGood getUsedGood() {
		return usedGood;
	}


	public void setUsedGood(UsedGood usedGood) {
		this.usedGood = usedGood;
	}


	public List<String> getImagesFileName() {
		return imagesFileName;
	}


	public void setImagesFileName(List<String> imagesFileName) {
		this.imagesFileName = imagesFileName;
	}

	public List<String> getImagesContentType() {
		return imagesContentType;
	}


	public void setImagesContentType(List<String> imagesContentType) {
		this.imagesContentType = imagesContentType;
	}



	// public List<File> getFile() {
	// return images;
	// }
	//
	// public void setFile(List<File> file) {
	// this.images = file;
	// }
	//
	// public List<String> getFileFileName() {
	// return imagesFileName;
	// }
	//
	// public void setFileFileName(List<String> fileFileName) {
	// this.imagesFileName = fileFileName;
	// }
	//
	// public List<String> getFileContentType() {
	// return imagesContentType;
	// }
	//
	// public void setFileContentType(List<String> fileContentType) {
	// this.imagesContentType = fileContentType;
	// }

}
