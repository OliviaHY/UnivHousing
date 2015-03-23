package com.javaweb.action;

import java.util.List;


import org.apache.struts2.ServletActionContext;

import com.javaweb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllAction extends ActionSupport {
	//ҵ���߼����
	private UserService userService;

	//����ҵ���߼����
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() throws Exception {
		//ͨ������ҵ���߼����������е��û�
		List all = userService.queryAllUser();
		//�������û�List������request��Χ��
		ServletActionContext.getRequest().setAttribute("all", all);
		return SUCCESS;
	}

}
