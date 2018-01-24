package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String n=request.getParameter("uname");  
	    String p=request.getParameter("pass");
	    
	    if(n.equals("sampath") && p.equals("123qwe") )
	    {
	    	response.sendRedirect("Welcome.jsp"); 	
	    	HttpSession session = request.getSession();
	    	session.setAttribute("user", n);
	    	session.setMaxInactiveInterval(30);
	  
	    }
	    else
	    {
	    	response.sendRedirect("Login.jsp");	
	    }
	}



}
