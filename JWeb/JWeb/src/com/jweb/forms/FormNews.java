package com.jweb.forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class FormNews 
{
	Map<String, String> errors;
	
	public List<String>			addNews(HttpServletRequest request)
	{
		String			title;
		String			content;
		List<String>	msgs;
		Connection		connexion;
		String				url = "jdbc:mysql://localhost:3306/bdd_jweb";
		String				username = "jweb";
		String				passwordSql = "ggvL9k.:";
		Statement			statement;

		msgs = new ArrayList<String>();
		title = request.getParameter("newsTitle");
		content = request.getParameter("newsContent");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e)
		{
			msgs.add(e.getMessage());
		}
		
		if (msgs.isEmpty())
		{
			try
			{
				connexion = DriverManager.getConnection(url, username, passwordSql);
				statement = connexion.createStatement();
				
				statement.executeUpdate("INSERT INTO news (title, content, date) VALUES('" + title +"', '" + content + "', NOW())");
				msgs.add("News ajouté");
			}
			catch (SQLException e)
			{
				msgs.add(e.getMessage());
			}
		}
		return (msgs);
	}
}
