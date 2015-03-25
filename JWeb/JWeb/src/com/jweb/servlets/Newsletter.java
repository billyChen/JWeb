package com.jweb.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jweb.forms.FormNewsletter;

public class Newsletter extends HttpServlet
{
	public void			doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.getServletContext().getRequestDispatcher("/WEB-INF/newsletter.jsp").forward(request, response);
	}

	public void			doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FormNewsletter	newsletter = new FormNewsletter();
		List<String>	error;
		
		error = new ArrayList<String>();
		error = newsletter.SignNewsletter(request);
		request.setAttribute("error", error);
		this.getServletContext().getRequestDispatcher("/WEB-INF/newsletter.jsp").forward(request, response);
	}
}
