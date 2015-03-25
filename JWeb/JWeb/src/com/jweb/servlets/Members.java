package com.jweb.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jweb.forms.FormMembers;

public class Members extends HttpServlet
{
	public void			doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FormMembers		members = new FormMembers();
		List<Map<String, String>>	memb;

		memb = new ArrayList<Map<String, String>>();
		memb = members.getAllMembers();
		request.setAttribute("allMembers", memb);
		this.getServletContext().getRequestDispatcher("/adminPage/member.jsp").forward(request, response);
	}

	public void			doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FormMembers		members = new FormMembers();
		List<Map<String, String>>	memb;
		
		memb = new ArrayList<Map<String, String>>();
		memb = members.getAllMembers();
		request.setAttribute("allMembers", memb);
		this.getServletContext().getRequestDispatcher("/adminPage/member.jsp").forward(request, response);		
	}
}
