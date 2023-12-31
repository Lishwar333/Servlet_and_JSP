package practice.servletandjsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


//@WebServlet("sq")
public class SqServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		int c = (int) req.getAttribute("c"); // for RequestDispatcher
		
//		int c = Integer.parseInt(req.getParameter("c")); // for redirect, with URLRewriting
		
//		HttpSession session = req.getSession();
//		int c = (int) session.getAttribute("c"); // with session
		
		ServletConfig cg = getServletConfig();
		String name = cg.getInitParameter("name");
		
		int c=0;
		Cookie[] cookie = req.getCookies();
		for(Cookie ck: cookie) {
			
			if(ck.getName().equals("c")) {
				c = Integer.parseInt(ck.getValue()); //with Cookie
			}	
		}
		
		c = c*c;
		
		PrintWriter out = res.getWriter();
		out.println("the Sq of sum is " + c+ " by "+ name);
	}

}
