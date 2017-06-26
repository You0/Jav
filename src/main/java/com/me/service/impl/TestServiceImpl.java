package com.me.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.dao.IUserDao;
import com.me.entity.Test;
import com.me.service.ITestService;

@Service("userService")
public class TestServiceImpl implements ITestService{

	@Autowired
	private IUserDao userDao;
	
	public Test getTestById(int id) {
		
		return userDao.getTestById(id);
	}

}
