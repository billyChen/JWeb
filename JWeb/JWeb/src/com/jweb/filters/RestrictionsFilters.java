package com.jweb.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jweb.beans.Users;

public class RestrictionsFilters implements Filter
{

	public void destroy()
	{
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException 
	{
		HttpServletRequest 	request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession(false);
		Users				user;

		if (session.getAttribute("sessionConnected") == null)
		{
			response.sendRedirect(request.getContextPath() + "/Accueil");
		}
		else
		{
			user = ((Users)session.getAttribute("sessionConnected"));
			if (user.getName().equals("admin"))
				chain.doFilter(request, response);
			else
				response.sendRedirect(request.getContextPath() + "/Accueil");				
		}
	}

	public void init(FilterConfig arg0) throws ServletException
	{
	
	}

}
