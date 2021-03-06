package com.test.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.User;
import com.test.service.UserService;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-25
 * Time: 上午12:57
 */
public class UpdatePUser extends ActionSupport
{
	private User user;
	private UserService service;
	public UserService getService()
	{
		return service;
	}

	public void setService(UserService service)
	{
		this.service = service;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	@Override
	public String execute() throws Exception
	{
		this.user=this.service.findById(user.getId());
		return SUCCESS;
	}
}
