package com.test.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.User;
import com.test.service.UserService;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-25
 * Time: 上午1:16
 */
public class UpdateUserAction extends ActionSupport
{
	private User user;
	private UserService service;

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public UserService getService()
	{
		return service;
	}

	public void setService(UserService service)
	{
		this.service = service;
	}

	@Override
	public String execute() throws Exception
	{
		this.service.update(user);
		return SUCCESS;    //To change body of overridden methods use File | Settings | File Templates.
	}
}
