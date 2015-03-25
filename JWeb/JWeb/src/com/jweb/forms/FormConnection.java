package com.jweb.forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.jweb.beans.Users;

public class FormConnection
{
	Map<String, String>	error;
	Connection			connexion = null;
	boolean				isTrue = true;
	
	public Users connectUser(HttpServletRequest request)
	{
		String				name;
		String				password;
		Users				user = new Users();
		List<String>		msg;
		
		msg = new ArrayList<String>();
		error = new HashMap<String, String>();
		name = request.getParameter("name");
		password = request.getParameter("password");
		
		try
		{
			validateName(name);
		}
		catch (Exception e)
		{
			error.put("name", e.getMessage());
		}
		
		try
		{
			validatePassword(password);
		}
		catch (Exception e)
		{
			error.put("password", e.getMessage());
		}
		
		try
		{
			isTrue = verifyAccount(name, password);
		}
		catch (Exception e)
		{
			error.put("invalid", e.getMessage());
		}
		
		if (isTrue == false)
			return (null);
		user.setName(name);
		user.setMsg(msg);
		return (user);
	}

	private boolean		verifyAccount(String name, String password) throws Exception
	{
		List<String>		msgs;
		String				url = "jdbc:mysql://localhost:3306/bdd_jweb";
		String				username = "jweb";
		String				passwordSql = "ggvL9k.:";
		
		isTrue = true;
		
		msgs = new ArrayList<String>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e)
		{
			msgs.add(e.getMessage());
			error.put("forName", e.getMessage());
		}
		
		try
		{
			connexion = DriverManager.getConnection(url, username, passwordSql);
			Statement			statement = connexion.createStatement();
			
			ResultSet result = statement.executeQuery("SELECT * FROM users");
			while (result.next())
			{
				String		resultName = result.getString("name");
				String		resultPassword = result.getString("password");
			
				if (resultName.equals(name) && resultPassword.equals(password))
				{
					isTrue = true;
					break;
				}
				isTrue = false;
			}
		}
		catch (SQLException e)
		{
			msgs.add(e.getMessage());
		}
		catch (Exception e)
		{
			msgs.add(e.getMessage());			
		}
		finally
		{
			if (connexion != null)
			{
				try
				{
					connexion.close();
				}
				catch (SQLException ignore)
				{
					
				}
			}
		}
		return (isTrue);
	}
	
	private void			validatePassword(String password) throws Exception
	{
		if (password.trim().length() <= 1)
		{
			throw new Exception("Veuillez saisir votre mot de passe");
		}
	}
	
	private void			validateName(String name) throws Exception
	{
		if (name != null && name.trim().length() < 3)
		{
			throw new Exception("Le nom doit contenir au minimum 3 charactères");
		}
		else if (name == null || name.trim().length() <= 1)
			throw new Exception("Veuillez saisir votre nom");
	}


	public	Map<String, String>			getErrors()
	{
		return (this.error);
	}
}
