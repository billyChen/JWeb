package com.jweb.servlets;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jweb.beans.ProductQuery;

public class Produit extends HttpServlet 
{
	public void				doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ProductQuery					product;
		List<Map<String, String>>		data;
		
		product = new ProductQuery();
		data = product.getProduct(request);		
		request.setAttribute("p", data);
		this.getServletContext().getRequestDispatcher("/WEB-INF/produit.jsp").forward(request, response);
	}

	public void				doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ProductQuery		product;
		List<Map<String, String>>		data;
		
		product = new ProductQuery();
		data = product.getProduct(request);		
		request.setAttribute("data", data);
		this.getServletContext().getRequestDispatcher("/WEB-INF/produit.jsp").forward(request, response);
	}
}
