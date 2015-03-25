package com.jweb.beans;

import java.util.List;

public class Users 
{
	String			name;
	List<String>	msg;
	
	public Users() 
	{
	}
	
	public void			setMsg(List<String> val)
	{
		msg = val;
	}
	
	public List<String>	getMsg()
	{
		return msg;
	}
	
	public void			setName(String name)
	{
		this.name = name;
	}
	
	public String			getName()
	{
		return (this.name);
	}
}
