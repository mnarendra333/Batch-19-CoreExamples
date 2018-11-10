package com.pragim.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class MyReqListner
 *
 */
public class MyReqListner implements ServletRequestListener {

	long startTime;
    /**
     * Default constructor. 
     */
    public MyReqListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	
    	ServletContext ctx = sre.getServletContext();
    	ctx.log("request processing time "+(System.currentTimeMillis()-startTime));
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	
    	startTime = System.currentTimeMillis();
    	ServletContext ctx = sre.getServletContext();
    	ctx.log("request started at "+startTime);
    }
	
}
