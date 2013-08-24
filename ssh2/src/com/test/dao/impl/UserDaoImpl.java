package com.test.dao.impl;

import com.test.bean.User;
import com.test.dao.UserDAO;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

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
}
