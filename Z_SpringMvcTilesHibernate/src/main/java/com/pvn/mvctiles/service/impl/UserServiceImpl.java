package com.pvn.mvctiles.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvn.mvctiles.dao.UserDao;
import com.pvn.mvctiles.model.UserDetails;
import com.pvn.mvctiles.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserDao userDao;
	
	@Override
	public UserDetails authenticateUser(UserDetails userDetails)
	{
		return userDao.authenticateUser(userDetails);
	}

}
