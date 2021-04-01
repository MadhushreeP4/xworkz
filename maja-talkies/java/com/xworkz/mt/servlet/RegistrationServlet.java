package com.xworkz.mt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{
	
	public RegistrationServlet() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created doPost from RegistrationServlet");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String location=req.getParameter("location");
		String hobbies=req.getParameter("hobbies");
		
		System.out.println(name+" "+email+" "+location+" "+hobbies);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/index.jsp");
		if(!name.isEmpty() && !email.isEmpty() && !location.isEmpty() && !hobbies.isEmpty()) {
			System.out.println("registration is successfull");	
			req.setAttribute("msg", "registration is successfull");	
		}else {
			System.out.println("registration failed");
			req.setAttribute("msg", "registration failed..!!");
		}
		dispatcher.forward(req, resp);
	}

}
