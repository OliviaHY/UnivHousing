package com.javaweb.dao;

import java.util.List;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.javaweb.po.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	// ����û�
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	// ɾ���û�
	public void delete(int id) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(User.class, id));
	}

	//�����û�
	public void update(User user) {
		this.getHibernateTemplate().saveOrUpdate(user);
	}

	//��ѯ�����û�
	public List queryAll() {
		return this.getHibernateTemplate().find("from User");
	}

	//��id��ѯ�û�
	public User queryByID(int id) {
		return (User) this.getHibernateTemplate().get(User.class, id);
	}

}
