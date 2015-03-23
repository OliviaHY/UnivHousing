package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.UserDAO;
import com.javaweb.po.User;


public class UserServiceImpl implements UserService{
	//DAO�������
	private UserDAO userDAO;

	//����DAO���
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	// ����û�
	public boolean addUser(User user) {
		//�ж��Ƿ������ͬID���û�
		if (userDAO.queryByID(user.getId()) == null) {
			//��������ڣ�������DAO������б���
			userDAO.save(user);
		} else {
			return false;
		}
		return true;
	}

	// ɾ���û�
	public boolean deleteUser(int id) {
		//�ж��Ƿ������ͬID���û�
		if (userDAO.queryByID(id) != null) {
			//������ڣ�������DAO�������ɾ��
			userDAO.delete(id);
		} else {
			return false;
		}
		return true;
	}

	// �����û�
	public boolean updateUser(User user) {
		//�ж��Ƿ������ͬID���û�
		if (userDAO.queryByID(user.getId()) != null) {
			//������ڣ�������DAO������и���
			userDAO.update(user);
		} else {
			return false;
		}
		return true;
	}

	// ��ѯ�����û�
	public List queryAllUser() {
		//����DAO������в�ѯ
		return userDAO.queryAll();
	}

	// ��id��ѯ�û�
	public User queryUserByID(int id) {
		//����DAO������в�ѯ
		return userDAO.queryByID(id);
	}


}
