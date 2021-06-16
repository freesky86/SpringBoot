package com.freesky.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "password", "uid" })
public class User {
	private Integer age = 18;

	@JsonFormat(locale = "zh", pattern = "yyyy-MM-dd HH:mm:ss a")
	private Date birthday = new Date();

	private String name = "";

//	@JsonIgnore
	private String password = "";

	private Integer uid;
	
	private String desc;
	
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getAge() {
		return age;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	public String getName() {
		return name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	public Integer getUid() {
		return uid;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

}
