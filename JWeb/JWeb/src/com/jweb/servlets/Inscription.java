package com.jweb.servlets;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jweb.forms.FormInscription;

public class Inscription extends HttpServlet
{
	public void			doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	}
	
	public void			doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FormInscription	inscription = new FormInscription();
		List<String>		error;

		error = inscription.SignUser(request);
		request.setAttribute("error", error);
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	}
}
