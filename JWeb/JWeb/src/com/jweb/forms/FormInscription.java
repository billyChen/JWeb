package com.jweb.forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.jweb.beans.Users;

public class FormInscription
{
	Connection			connexion = null;
	List<String>	error;
	public List<String>  SignUser(HttpServletRequest request)
	{
		String				name;
		String				password;
		Users				user = new Users();
		List<String>		msg;
		
		error = new ArrayList<String>();
		name = request.getParameter("name");
		password = request.getParameter("password");
		
		try
		{
			validateName(name);
		}
		catch (Exception e)
		{
			error.add(e.getMessage());
		}
		
		try
		{
			validatePassword(password);
		}
		catch (Exception e)
		{
			error.add(e.getMessage());
		}
		
		if (error.isEmpty())
		{
			try
			{
				addAccount(name, password);
			}
			catch (Exception e)
			{
				error.add(e.getMessage());
			}
		}
		return (error);
	}

	private void		addAccount(String name, String password) throws Exception
	{
		List<String>		msgs;
		String				url = "jdbc:mysql://localhost:3306/bdd_jweb";
		String				username = "jweb";
		String				passwordSql = "ggvL9k.:";
		
		
		msgs = new ArrayList<String>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e)
		{
			msgs.add(e.getMessage());
			error.add(e.getMessage());
		}
		
		try
		{
			connexion = DriverManager.getConnection(url, username, passwordSql);
			Statement			statement = connexion.createStatement();
			ResultSet			result;
			
			result = statement.executeQuery("SELECT * FROM users");
			
			while (result.next())
			{
				if (result.getString("name").equals(name))
				{
					throw new Exception("Nom déjà pris");
				}
			}
			if (error.isEmpty())
				statement.executeUpdate("INSERT INTO users (name, password) VALUES('" + name +"', '" + password + "')");
		}
		catch (SQLException e)
		{
			error.add(e.getMessage());
		}
		catch (Exception e)
		{
			error.add(e.getMessage());			
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

	public	List<String>			getErrors()
	{
		return (this.error);
	}
}
