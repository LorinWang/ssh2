package com.test.action.user;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-23
 * Time: 上午12:43
 */
public class SaveUserAction extends ActionSupport
{
	private User user;

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
		return super.execute();    //To change body of overridden methods use File | Settings | File Templates.
	}

}
