package com.xworkz.integration.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.integration.entity.ContactEntity;
import com.xworkz.integration.repository.ContactRepo;
import com.xworkz.integration.repository.ContactRepoImpl;
import com.xworkz.integration.service.ContactService;
import com.xworkz.integration.service.ContactServiceImpl;

public class FindByEmailServlet extends HttpServlet {

	private ContactService<ContactEntity> service;

	public FindByEmailServlet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("invoked init from FindByEmailServlet");
		//ContactRepo repo = new ContactRepoImpl();
		this.service = new ContactServiceImpl();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("invoked doPost from FindByEmailServlet");
		String mail = req.getParameter("email");
		System.out.println(mail);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>search by Email</h1>\r\n" + 
				"<form action=\"searchByEmail\" method=\"post\">\r\n" + 
				"<input type=\"text\" name=\"email\" placeholder=\"type email here\">\r\n" + 
				"<input type=\"submit\" value=\"search\">\r\n" + 
				"</form>");
		writer.println("<h1>");
		writer.println("search is done");
		writer.println("</h1>");

		ContactEntity entity = service.validateAndFindByEmail(mail);
		if (entity != null) {
			System.out.println(entity);
			writer.println("<p>result found </br> " + entity + "</p>");
		}else {
			System.out.println("entity not found");
			writer.println("<p style='color:red;'>result not found </p>");
		}
		writer.println("</body>");
		writer.println("</html>");

	}

}
