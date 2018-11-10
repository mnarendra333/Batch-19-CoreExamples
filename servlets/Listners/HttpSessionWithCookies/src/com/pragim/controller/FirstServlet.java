package com.pragim.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
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
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("name", name);
		session.setAttribute("age", age);
		session.setAttribute("address", address);
		
		
		
		out.println("<form action="+response.encodeUrl("surl")+" method=get><body bgcolor='yellow'><table><tr><td>Skill Set : </td><td><select name=skill><option>J2EE</option><option>J2EE</option><option>J2EE</option></select></td></tr><tr><td> No of yrs of Exp :</td><td> <input type=text name=exp></td></tr><tr><td>"
				+ "<input type=submit value=store></td></tr></table></body></form>");
	}

}
