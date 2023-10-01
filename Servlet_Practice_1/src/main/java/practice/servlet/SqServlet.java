package practice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		int c = (int) req.getAttribute("c"); // for RequestDispatcher
		
		int c = Integer.parseInt(req.getParameter("c"));
		c = c*c;
		
		PrintWriter out = res.getWriter();
		out.println("the Sq of sum is " + c);
	}

}
