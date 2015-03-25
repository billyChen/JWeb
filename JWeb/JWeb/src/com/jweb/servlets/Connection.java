package com.jweb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.invoke.empty.Empty;

import com.jweb.beans.Users;
import com.jweb.forms.FormConnection;

public class Connection extends HttpServlet
{

	public Connection() 
	{
		
	}
	
	public void				doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession(false);
		
		if (session.getAttribute("sessionConnected") == null)
			this.getServletContext().getRequestDispatcher("/WEB-INF/connection.jsp").forward(request, response);
		else
			response.sendRedirect(request.getContextPath() + "/Accueil");
	}

	public void				doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FormConnection		connection 	= new FormConnection();
		Users				user		= new Users();
		HttpSession			session = request.getSession();
		
		user = connection.connectUser(request);
		if (connection.getErrors().isEmpty() && user != null)
			session.setAttribute("sessionConnected", user);
		else
			session.setAttribute("sessionConnected", null);
	
		request.setAttribute("form", connection);
		request.setAttribute("user", user);
		response.sendRedirect(request.getContextPath() + "/Accueil");
	}
}
