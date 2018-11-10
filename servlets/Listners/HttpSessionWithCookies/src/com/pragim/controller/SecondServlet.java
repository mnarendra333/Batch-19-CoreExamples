package com.pragim.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
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
		
		String skill = request.getParameter("skill");
		String exp = request.getParameter("exp");
		
		HttpSession session = request.getSession();
		session.setAttribute("skill", skill);
		session.setAttribute("exp", exp);
		
		out.println("<form action="+response.encodeUrl("turl")+" method=get><body bgcolor='green'><table><tr><td>Prefered City : </td><td><select name=city><option>BANGL</option><option>Chenni</option><option>mumbai</option></select></td></tr><tr><td> expected Salary :</td><td> <input type=text name=sal></td></tr><tr><td>"
				+ "<input type=submit value=store></td></tr></table></body></form>");
		
		
		
		
	}

}
