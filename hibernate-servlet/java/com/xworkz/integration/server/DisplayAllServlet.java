package com.xworkz.integration.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.integration.entity.ContactEntity;
import com.xworkz.integration.service.ContactService;
import com.xworkz.integration.service.ContactServiceImpl;

public class DisplayAllServlet extends HttpServlet{
	
	private ContactService<ContactEntity> service;
	
	public DisplayAllServlet() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("invoked init from DisplayAllServlet");
		this.service=new ContactServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doGet from DisplayAllServlet");
		List<ContactEntity> list=this.service.displayAll();
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Saved Data</h1>");
		writer.println("<table border='1'>");
		for (ContactEntity contactEntity : list) {
			
			writer.println("<tr>");
			writer.println("<td>"+contactEntity.getName()+"<td>");
			writer.println("<td>"+contactEntity.getEmail()+"<td>");
			writer.println("<td>"+contactEntity.getPhone()+"<td>");
			writer.println("<td>"+contactEntity.getCompany()+"<td>");
			writer.println("<td>"+contactEntity.getAboutUs()+"<td>");
			writer.println("</tr>");
			
		}
		/*writer.println("<table border='1'>");
		Iterator<ContactEntity> iterator=list.iterator();
		while(iterator.hasNext()) {
			ContactEntity entity=iterator.next();
			writer.println("<tr>");
			writer.println("<td>"+entity.getName()+"<td>");
			writer.println("<td>"+entity.getEmail()+"<td>");
			writer.println("<td>"+entity.getPhone()+"<td>");
			writer.println("<td>"+entity.getCompany()+"<td>");
			writer.println("<td>"+entity.getAboutUs()+"<td>");
			writer.println("</tr>");
			
		}*/
		writer.println("</table>");
		writer.println("</body>");
		writer.println("</html>");
		
	}

}
