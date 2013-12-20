package com.xinghen.domain;

import java.util.Date;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Image {

	private Long id;
	private String imageName;
	private Date uploadDate;
	private UsedGood usedGood;
	private Boolean imageType ;
	
	public Image() {
		super();
	}
	public Image(Image img) {
		setId(img.getId());
		setImageName(img.getImageName());
		setUploadDate(img.getUploadDate());
		setUsedGood(img.getUsedGood());
		setImageType(img.getImageType());
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Boolean getImageType() {
		return imageType;
	}
	public void setImageType(Boolean imageType) {
		this.imageType = imageType;
	}

	
	
	
}
