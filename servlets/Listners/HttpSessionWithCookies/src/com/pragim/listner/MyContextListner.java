package com.pragim.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyContextListner
 *
 */
public class MyContextListner implements ServletContextListener {
	long startTime;
    /**
     * Default constructor. 
     */
    public MyContextListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	ServletContext ctx = sce.getServletContext();
    	ctx.log("context destoryed time "+(System.currentTimeMillis()-startTime));
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sre)  { 
         // TODO Auto-generated method stub
    	startTime = System.currentTimeMillis();
    	ServletContext ctx = sre.getServletContext();
    	ctx.log("context created at "+startTime);
    }
	
}
