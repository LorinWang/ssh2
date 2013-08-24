package com.test.service;

import com.test.bean.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-23
 * Time: 上午12:52
 */
public interface UserService
{
	public void save(User user);
	public List<User> findAll();
}
