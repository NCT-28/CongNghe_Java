package vn.com.congnghejava.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class thu extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	public thu() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletOutputStream out = response.getOutputStream();

		out.println("<html>");
		out.println("<head><title>Hello Servlet</title></head>");

		out.println("<body>");
		out.println("<h3>Hello World</h3>");
		out.println("Chao mung ban den voi Servlet");
		out.println("</body>");
		out.println("<html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
