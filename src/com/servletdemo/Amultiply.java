package com.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Amultiply extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		
		
			PrintWriter out=res.getWriter();
			out.println("<p>Multiply Servlet<br>");
			int a=Integer.parseInt(req.getParameter("n1"));
			int b=Integer.parseInt(req.getParameter("n2"));
			int multi=a*b;
			out.println("<br>Multiplication: "+multi);
			int sum=Integer.parseInt(req.getAttribute("sum").toString());
			out.println("<br>Difference between sum and multiplication is: "+(sum-multi));
		
		
	}
	
}