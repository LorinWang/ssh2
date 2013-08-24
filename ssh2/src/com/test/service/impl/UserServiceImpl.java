package com.test.service.impl;

import com.test.bean.User;
import com.test.dao.UserDAO;
import com.test.service.UserService;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-23
 * Time: 上午12:53
 */
public class UserServiceImpl implements UserService
{

	private UserDAO userDAO;

	public UserDAO getUserDAO()
	{
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO)
	{
		this.userDAO = userDAO;
	}

	@Override
	public void save(User user)
	{
		this.userDAO.saveUser(user);
	}
}
