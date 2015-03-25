package com.jweb.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jweb.beans.Users;
import com.jweb.forms.FormConnection;

public class handleConnection extends HttpServlet
{
	public void				doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.getServletContext().getRequestDispatcher("/WEB-INF/handleConnection.jsp").forward(request, response);
	}

	public void				doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FormConnection		connexion 	= new FormConnection();
		Users				user		= new Users();
		HttpSession			session = request.getSession();
		
		user = connexion.connectUser(request);
		if (connexion.getErrors().isEmpty())
			session.setAttribute("sessionConnected", user);
		else
			session.setAttribute("sessionConnected", null);
	
		request.setAttribute("form", connexion);
		request.setAttribute("user", user);
		response.sendRedirect(request.getContextPath() + "/Accueil");
	}
	
}
