package com.jweb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jweb.forms.FormNews;

public class addNews extends HttpServlet
{
	public void			doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.getServletContext().getRequestDispatcher("/adminPage/addNews.jsp").forward(request, response);
	}

	public void			doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FormNews		news;
		List<String>	msgs;
		
		news = new FormNews();
		msgs = news.addNews(request);
		request.setAttribute("error", msgs);
		this.getServletContext().getRequestDispatcher("/adminPage/addNews.jsp").forward(request, response);		
	}
}
