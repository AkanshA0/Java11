package com.servletdemo;


import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class Add extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
	
	PrintWriter out=res.getWriter();
	
	Date today=new Date();
	out.println(
	         "<html>\n" +
	            "<body><h3>Date: " + today + "</h3>\n" +
	            "</body></html>"
	      );
	
	int a=Integer.parseInt(req.getParameter("n1"));
	int b=Integer.parseInt(req.getParameter("n2"));
	int c=a+b;
	
		
		out.println("Sum is : "+c);
		
	ServletContext context=getServletContext();  
	String authorName=context.getInitParameter("author");  
	out.println("author name is : "+authorName);  
	
	try{
		RequestDispatcher rd=req.getRequestDispatcher("m");
		req.setAttribute("sum",c);
		rd.include(req,res);
		}catch(Exception e){}
	   
	
}
/*
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
	int a=Integer.parseInt(req.getParameter("n1"));
	int b=Integer.parseInt(req.getParameter("n2"));
	int c=a+b;
	//System.out.println(c);
	
	
		PrintWriter out=res.getWriter();
		out.println("Sum is : "+c);
		
	try{
		RequestDispatcher rd=req.getRequestDispatcher("/sq");
		rd.include(req,res);
		}catch(Exception e){}
		
		ServletContext context=getServletContext();  
		String authorName=context.getInitParameter("author");  
		out.println("author name is : "+authorName);  
	
}
*/

}
