package com.jweb.servlets;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Accueil extends HttpServlet
{

	public Accueil()
	{
	}

	public void			doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		List<String>	msgs;
		Connection		connexion;
		String				url = "jdbc:mysql://localhost:3306/bdd_jweb";
		String				username = "jweb";
		String				passwordSql = "ggvL9k.:";
		Map<String, String> data;
		List<Map<String, String>>		dataList;

		dataList = new ArrayList<Map<String, String>>();
		msgs = new ArrayList<String>();
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
				Statement		statement = connexion.createStatement();
				ResultSet result = statement.executeQuery("SELECT * FROM news");
				
				while (result.next())
				{
					data = new HashMap<String, String>();					
					data.put("title", result.getString("title"));
					data.put("content", result.getString("content"));
					data.put("date", result.getString("date"));
					dataList.add(data);
				}
			}
			catch (SQLException e)
			{
				msgs.add(e.getMessage());
			}
		}
		request.setAttribute("data", dataList);
		this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
	}
	
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward( request, response );
    }

}
