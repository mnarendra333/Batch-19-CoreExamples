package com.pragim.SpringRestWithHibernateNew.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class SampleFilter
 */
@WebFilter("/*")
public class SampleFilter implements Filter {
	
	
	public static final List<String> ALLOWED_ORIGINES = Arrays.asList("http://localhost:4200","");

    /**
     * Default constructor. 
     */
    public SampleFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String incomingRequests = req.getHeader("Origin");
		
		
		if(ALLOWED_ORIGINES.contains(incomingRequests)) {
			res.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
			 res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
		        res.setHeader("Access-Control-Max-Age", "3600");
		        res.setHeader("Access-Control-Allow-Headers", "x-requested-with, authorization, cache-control, content-type, Origin, key");
		}
		
		
		
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
