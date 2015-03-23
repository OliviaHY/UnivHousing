package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.User;



public interface UserDAO {
	//����û�
	public void save(User user);
	
	//ɾ���û�
	public void delete(int id);
	
	//�����û�
	public void update(User user);
	
	//��ѯ�����û�
	public List queryAll();
	
	//��id��ѯ�û�
	public User queryByID(int id);
}
