package com.javaweb.service;

import java.util.List;

import com.javaweb.po.User;


public interface UserService {
	//����û�
	public boolean addUser(User user);
	
	//ɾ���û�
	public boolean deleteUser(int id);
	
	//�����û�
	public boolean updateUser(User user);
	
	//��ѯ�����û�
	public List queryAllUser();
	
	//��id��ѯ�û�
	public User queryUserByID(int id);
}
