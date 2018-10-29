package com.pragim;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.ws.RequestWrapper;

@Path("/welcome")
public class WelcomeController {
	
	
	
	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHello(){
		
		String message="welcome to Jersy framework...!";
		Map<String,String> map = new HashMap<String, String>();
		map.put("msg", message);
		return Response.ok().entity(map).build();
	}
	
	@GET
	@Path("/cube/{number}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response calCube(@PathParam(value = "number") String num){
		
		int no = Integer.parseInt(num);
		int cube = no*no*no;
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("cube", cube);
		
		return Response.ok().entity(map).build();
	}
	
	
	
	@GET
	@Path("/rev")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInput(@QueryParam(value="key1") String input){
		
		StringBuffer sb = new StringBuffer(input);
		String newStr = sb.reverse().toString();
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("str", newStr);
		
		return Response.ok().entity(map).build();
	}
	
	

}
