package com.test.dao.impl;

import com.test.bean.User;
import com.test.dao.UserDAO;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-23
 * Time: 上午12:56
 */
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO
{
	@Override
	public void saveUser(User user)
	{
		this.getHibernateTemplate().save(user);
	}

	@Override
	public List<User> findAllUsers()
	{
		String hql="from User as user order by user.id desc";
		return (List<User>)this.getHibernateTemplate().find(hql);

	}

	@Override
	public void removeUser(User user)
	{
		this.getHibernateTemplate().delete(user);
	}
}
