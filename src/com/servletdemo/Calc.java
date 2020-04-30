package com.servletdemo;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class Calc extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		PrintWriter out=res.getWriter();
		
		int a=Integer.parseInt(req.getParameter("n1"));
		int b=Integer.parseInt(req.getParameter("n2"));
		String option = req.getParameter("R1"); 
        
        
        if(option.equals("Addition")){
             out.println("<br>Addition : "+(a+b));
        }
        else if(option.equals("Subtraction")){
             out.println("<br>Subtraction : "+(a-b));
        }
        else if(option.equals("Multiplication")){
             out.println("<br>Multiplication : "+(a*b));
        }
        else if(option.equals("Division")){
            out.println("<br>Division : "+(a/b));
        }
       
		}

}
