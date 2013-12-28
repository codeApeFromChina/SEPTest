package com.xinghen.testaction;

public class Image  {
	
	public String url;
	public int height;
	public Image (String url, int height){
		this.url = url;
		this.height = height;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}