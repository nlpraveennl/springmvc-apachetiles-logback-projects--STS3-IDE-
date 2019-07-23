package com.pvn.mvctiles.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pvn.mvctiles.dao.UserDao;
import com.pvn.mvctiles.model.UserDetails;

@Component
public class UserDaoImpl implements UserDao
{

	Logger			OUT	= LoggerFactory.getLogger(UserDaoImpl.class);

	@Autowired
	SessionFactory	sessionFactory;

	@Override
	public UserDetails authenticateUser(UserDetails userDetails)
	{
		try (Session session = sessionFactory.openSession();)
		{
			@SuppressWarnings("unchecked")
			Query<UserDetails> query = session.createQuery("FROM UserDetails WHERE userName = ?1 AND password = ?2");
			query.setParameter(1, userDetails.getUserName());
			query.setParameter(2, userDetails.getPassword());
			OUT.info("{}", query.getQueryString());
			List<UserDetails> list = query.getResultList();
			OUT.info("{}" + list.size());
			if (list.size() == 1)
				return list.get(0);
			else
				return null;
		}
		catch (Exception e)
		{
			OUT.error("Exception - {}", e);
			return null;
		}
	}

}
