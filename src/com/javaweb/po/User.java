package com.javaweb.po;

import java.util.Date;

public class User {
	//�û�ID
	private int id;
	//�û���
	private String username;
	//����
	private String password;
	//����
	private int age;
	//����
	private Date birth;
	//email��ַ
	private String email;

	//�����Ե�setter��getter����
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
