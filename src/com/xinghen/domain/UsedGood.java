package com.xinghen.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UsedGood {

	private Long id;
	private String name;
	private String type;
	private Float price;
	private String tradeType;
	private Integer number;
	private String description;
	private String tradeLocation;
	public Set<Image> getImages() {
		return images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

	private Date beginDate;
	private Date endDate;
	private User user;
	private Set<Image> images = new HashSet<Image>();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
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

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set<Image> getShowImages() {
		return images;
	}

	public void setShowImages(Set<Image> showImages) {
		this.images = showImages;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
