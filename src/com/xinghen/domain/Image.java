package com.xinghen.domain;

import java.util.Date;

public class Image {

	private Long id;
	private String imageName;
	private Date uploadDate;
	private UsedGood usedGood;
	private String imageType ;
	
	public String getImageName() {
		return imageName;
	}
	
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public UsedGood getUsedGood() {
		return usedGood;
	}
	public void setUsedGood(UsedGood usedGood) {
		this.usedGood = usedGood;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
