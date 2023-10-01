package practice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int c = a+b;
		
		//req.setAttribute("c", c); used in all 3 below!
		
		// to display in web browser
//		PrintWriter out = res.getWriter();
//		out.println("The result is "+ c);
		
		// 1 Way of calling Servlet to Servlet
//		RequestDispatcher rd = req.getRequestDispatcher("sq"); 
//		rd.forward(req, res);
		
		// 2nd Way, also known as URLRewriting
		//res.sendRedirect("sq?c="+c);
		
		//Using Session
		HttpSession session = req.getSession();
		session.setAttribute("c",c );
		res.sendRedirect("sq");
		
		
		
		

	}

}
