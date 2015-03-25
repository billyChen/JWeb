package com.jweb.forms;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class FormNewsletter 
{
	Connection		connexion;

	public	List<String>		SignNewsletter(HttpServletRequest request)
	{
		List<String>			error;
		String					email;
		String				url = "jdbc:mysql://localhost:3306/bdd_jweb";
		String				username = "jweb";
		String				passwordSql = "ggvL9k.:";
		
		error = new ArrayList<String>();
		email = request.getParameter("newsletter");
		try
		{
			emailValidity(email);
		}
		catch (Exception e)
		{
			error.add(e.getMessage());
		}
		
		if (error.isEmpty() == true)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch (ClassNotFoundException e)
			{
				error.add(e.getMessage());
			}
			
			try
			{
				connexion = DriverManager.getConnection(url, username, passwordSql);
				Statement		statement = connexion.createStatement();
				
				statement.executeUpdate("INSERT into newsletter(email) VALUES('" + email + "')");
			}
			catch (Exception e)
			{
				error.add(e.getMessage());
			}
			finally
			{
				if (connexion != null)
				{
					try
					{
						connexion.close();
					}
					catch (SQLException ignore)
					{
						
					}
				}
			}
		}
		return (error);
	}
	
	private void emailValidity( String email ) throws Exception
	{
	    if ( email != null && email.trim().length() != 0 )
	    {
	        if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) )
	        {
	            throw new Exception( "Merci de saisir une adresse mail valide." );
	        }
	    }
	    else
	    {
	        throw new Exception( "Merci de saisir une adresse mail." );
	    }
	}
}
