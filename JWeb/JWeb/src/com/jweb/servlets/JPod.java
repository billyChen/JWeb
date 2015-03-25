package com.jweb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JPod extends HttpServlet
{

	public JPod()
	{
		// TODO Auto-generated constructor stub
	}

	public void			doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.getServletContext().getRequestDispatcher("/WEB-INF/jpod.jsp").forward(request, response);
	}
	
	public void			doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.getServletContext().getRequestDispatcher("/WEB-INF/jpod.jsp").forward(request, response);		
	}

}
