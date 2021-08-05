package com.xworkz.leaveapp.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.ParseInfo;
import com.xworkz.leaveapp.entity.LeaveEntity;
import com.xworkz.leaveapp.repository.LeaveRepo;
import com.xworkz.leaveapp.repository.LeaveRepoImpl;
import com.xworkz.leaveapp.service.LeaveService;
import com.xworkz.leaveapp.service.LeaveServiceImpl;

public class LeaveServlet extends HttpServlet{
	
	private LeaveService< LeaveEntity> service;
	
	public LeaveServlet() {
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
		String mail=req.getParameter("email");
		String leaves=req.getParameter("leaves");
		String reason=req.getParameter("reason");
		String startDate=req.getParameter("start");
		System.out.println(name);
		System.out.println(mail);
		System.out.println(leaves);
		System.out.println(reason);
		System.out.println(startDate);
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Leave Application");
		writer.println("</h1>");
		writer.println("<h3>");
		LeaveEntity entity=new LeaveEntity(name, mail, leaves, reason, startDate);
		boolean valid=this.service.validateAndSave(entity);
		if(valid) {
			System.out.println("data is saved");
			writer.println("Application submitted Successfully for "+name);
		}else {
			System.out.println("data is not saved");
			writer.println("Application submission Failed for "+name);
		}
		writer.println("</h3>");
		writer.println("</body>");
		writer.println("</html>");
		
		
	}

}
