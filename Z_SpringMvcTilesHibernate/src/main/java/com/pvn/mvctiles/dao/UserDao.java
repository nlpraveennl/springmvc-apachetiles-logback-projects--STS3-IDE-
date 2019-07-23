package com.pvn.mvctiles.dao;

import com.pvn.mvctiles.model.UserDetails;

public interface UserDao
{
	public UserDetails authenticateUser(UserDetails userDetails);
}
