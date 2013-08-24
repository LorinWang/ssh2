package com.test.dao;

import com.test.bean.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-23
 * Time: 上午12:55
 */
public interface UserDAO
{
	public void saveUser(User user);
	public List<User> findAllUsers();
	public void removeUser(User user);
	public void updateUser(User user);
	public User findUserById(Integer id);
}
