package com.pragim;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginsrv")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String username = request.getParameter("uname");
		
		String password = request.getParameter("pwd");
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		if("pragim".equalsIgnoreCase(username) && "pragim".equals(password))
			pw.println("<h1><font color='green'>Login Success</font></h1>");
		else
			pw.println("<h1><font color='red'>Login failed</font></h1>");
	}

}
