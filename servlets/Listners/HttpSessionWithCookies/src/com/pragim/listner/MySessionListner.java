package com.pragim.listner;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListner
 *
 */
public class MySessionListner implements HttpSessionListener {

	long startTime;
    /**
     * Default constructor. 
     */
    public MySessionListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent hse)  { 
         // TODO Auto-generated method stub
    	
    	startTime = System.currentTimeMillis();
    	ServletContext ctx = hse.getSession().getServletContext();
    	
    	ctx.log("session created at "+startTime);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent hse)  { 
         // TODO Auto-generated method stub
    	ServletContext ctx =  hse.getSession().getServletContext();
    	ctx.log("session destoryed time "+(System.currentTimeMillis()-startTime));
    }
	
}
