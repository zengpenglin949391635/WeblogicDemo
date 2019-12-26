package com.helloservlet.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends  HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("进入doGet了");
		 resp.setContentType("text/html;charset=UTF-8");  
	        PrintWriter out = resp.getWriter();  
	        out.println("hello world,servlet123456");  
	        out.close();  	
	        System.out.println("执行完毕！---");
	}
	
}
