package com.jweb.beans;

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


public class ProductQuery
{
	Connection		connexion;

	public List<Map<String, String>>			getProduct(HttpServletRequest request)
	{
		String			reference;
		List<String>	error;
		String			url = "jdbc:mysql://localhost:3306/bdd_jweb";
		String			username = "jweb";
		String			password = "ggvL9k.:";
		List<Map<String, String>>		dataList;
		Map<String, String>				data;
		
		dataList = new ArrayList<Map<String, String>>();
		error = new ArrayList<String>();
		reference = request.getParameter("ref");
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
			connexion = DriverManager.getConnection(url, username, password);
			Statement 	statement = connexion.createStatement();
			ResultSet		result;
			
			result = statement.executeQuery("SELECT * FROM product WHERE name = '" + reference + "'");
			while (result.next())
			{
				data = new HashMap<String, String>();
				data.put("name", result.getString("name"));
				data.put("description", result.getString("description"));
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
