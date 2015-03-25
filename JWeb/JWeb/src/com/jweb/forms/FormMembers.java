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

public class FormMembers
{
	Connection				connexion;
	public List<Map<String, String>>			getAllMembers()
	{
		List<String>			error;
		List<Map<String, String>>		dataList;
		String					url = "jdbc:mysql://localhost:3306/bdd_jweb";
		String					username = "jweb";
		String					passwordSQL = "ggvL9k.:";
		
		dataList = new ArrayList<Map<String, String>>();
		error = new ArrayList<String>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (Exception e)
		{
			error.add(e.getMessage());
		}
		
		try
		{
			connexion = DriverManager.getConnection(url, username, passwordSQL);
			Statement statement	= connexion.createStatement();
			Map<String, String>		data;
			ResultSet		result;
			result = statement.executeQuery("SELECT * FROM users");
			while (result.next())
			{
				data = new HashMap<String, String>();
				data.put("name", result.getString("name"));
				data.put("password", result.getString("password"));
				dataList.add(data);
			}
		
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
		return (dataList);
	}
}
