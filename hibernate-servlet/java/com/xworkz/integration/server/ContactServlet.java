package com.xworkz.integration.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.integration.entity.ContactEntity;
import com.xworkz.integration.repository.ContactRepo;
import com.xworkz.integration.repository.ContactRepoImpl;
import com.xworkz.integration.service.ContactService;
import com.xworkz.integration.service.ContactServiceImpl;

public class ContactServlet extends HttpServlet{
	
	private ContactService< ContactEntity> service;
	
	public ContactServlet() {
		System.out.println("created ContactServlet");
		
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		//ContactRepo repo=new ContactRepoImpl();
		service=new ContactServiceImpl();
		
	}
	
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
		writer.println("<h1>");
		writer.println("contact details");
		writer.println("</h1>");
		writer.println("<h2>");
		ContactEntity entity=new ContactEntity(name, phone, company, mail, area);
		//entity.setId(2);
		
		
		boolean valid=this.service.validateAndSave(entity);
		if(valid) {
			System.out.println("data is saved");
			writer.println("contact details saved for user "+name);
		}else {
			System.out.println("data is not saved");
			writer.println("contact details not saved for user "+name);
		}
		writer.println("<h2>");
		writer.println("<a href='login.html'>login for another contact details</a>");
		
		//writer.println(name+" "+phone+" "+company+" "+mail+" "+area);
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
		
	}

}
