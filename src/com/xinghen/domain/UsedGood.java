package com.xinghen.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UsedGood {

	private Long id;
	private Long displayNum = 0l;
	private String name;
	private String type;
	private Float price;
	private String detailedCategory;
	public String getDetailedCategory() {
		return detailedCategory;
	}
	public void setDetailedCategory(String detailedCategory) {
		this.detailedCategory = detailedCategory;
	}
	private String tradeType;
	private String description;
	private String tradeLocation;
	private Date uploadDate;
	private User user = new User();
	
//	private Image firstImage;
	private Set<Image> images = new HashSet<Image>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDisplayNum() {
		return displayNum;
	}
	public void setDisplayNum(Long displayNum) {
		this.displayNum = displayNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTradeLocation() {
		return tradeLocation;
	}
	public void setTradeLocation(String tradeLocation) {
		this.tradeLocation = tradeLocation;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
//	public Image getFirstImage() {
//		return firstImage;
//	}
//	public void setFirstImage (Image firstImage) {
//		this.firstImage = firstImage;
//	}
	
	public Set<Image> getImages() {
		return images;
	}
	public void setImages(Set<Image> images) {
		this.images = images;
	}
	

	

}
