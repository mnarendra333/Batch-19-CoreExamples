package com.pragim.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String city = request.getParameter("city");
		String sal = request.getParameter("sal");
		
		HttpSession session = request.getSession();
		
		
		String name= (String)session.getAttribute("name");
		String age= (String)session.getAttribute("age");
		String address= (String)session.getAttribute("address");
		
		String skill= (String)session.getAttribute("skill");
		String exp= (String)session.getAttribute("name");
		session.invalidate();
		out.println(name+" "+age+" "+address+" "+skill+" "+exp+" "+city+" "+sal);
	
	}

}
