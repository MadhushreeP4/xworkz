package com.xworkz.integration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IntegrationServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doPost");
		String name=req.getParameter("name");
		String phone=req.getParameter("phone");
		String company=req.getParameter("company");
		String mail=req.getParameter("mail");
		String area=req.getParameter("area");
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println(name+" "+phone+" "+company+" "+mail+" "+area);
		writer.println("</body>");
		writer.println("</html>");
	}

}
