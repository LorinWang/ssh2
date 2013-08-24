package com.test.action.user;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.test.service.UserService;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-24
 * Time: 下午11:46
 */
public class ListUserAction extends ActionSupport
{
	private UserService service;
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
		Map request= (Map) ActionContext.getContext().get("request");
		request.put("list",this.service.findAll());
		return SUCCESS;
	}
}
