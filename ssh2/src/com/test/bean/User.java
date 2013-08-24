package com.test.bean;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-23
 * Time: 上午1:40
 */
public class User
{
	private Integer id;
	private String firstname;
	private String lastname;
	private Integer age;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		if (age != null ? !age.equals(user.age) : user.age != null) return false;
		if (firstname != null ? !firstname.equals(user.firstname) : user.firstname != null) return false;
		if (id != null ? !id.equals(user.id) : user.id != null) return false;
		if (lastname != null ? !lastname.equals(user.lastname) : user.lastname != null) return false;

		return true;
	}

	@Override
	public int hashCode()
	{
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
		result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
		result = 31 * result + (age != null ? age.hashCode() : 0);
		return result;
	}
}
