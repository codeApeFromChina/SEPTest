package com.xinghen.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User {
	private Long id;
	private String name;
	private String age;
	private String userName;
	private String passWord;
	private Date registDate;
	private String phoneNumber;
	private String schoolName;
	private String location;
	private Date birthday;
	private String email;
	private Set<UsedGood> usedGoods = new HashSet<UsedGood>();

	// private Set<User> friends = new HashSet<User>();
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Date getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<UsedGood> getUsedGoods() {
		return usedGoods;
	}

	public void setUsedGoods(Set<UsedGood> usedGoods) {
		this.usedGoods = usedGoods;
	}

}
