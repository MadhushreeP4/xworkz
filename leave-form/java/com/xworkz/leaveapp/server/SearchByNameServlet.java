package com.xworkz.leaveapp.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.leaveapp.entity.LeaveEntity;
import com.xworkz.leaveapp.repository.LeaveRepo;
import com.xworkz.leaveapp.repository.LeaveRepoImpl;
import com.xworkz.leaveapp.service.LeaveService;
import com.xworkz.leaveapp.service.LeaveServiceImpl;

public class SearchByNameServlet extends HttpServlet{
	
	private LeaveService< LeaveEntity> service;
	
	public SearchByNameServlet() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("invoked init");
		LeaveRepo repo=new LeaveRepoImpl();
		this.service=new LeaveServiceImpl(repo);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doPost");
		String name=req.getParameter("name");
		System.out.println(name);
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Search is done");
		writer.println("</h1>");
		
		LeaveEntity entity=this.service.validateAndFindByName(name);
		System.out.println(entity.getName());
		
		writer.println("</body>");
		writer.println("</html>");
	}

}
