package test;

import jakarta.servlet.GenericServlet;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/employee")
public class Employee extends GenericServlet
{
	@Override
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
{
		RequestDispatcher rd = req.getRequestDispatcher("Display.jsp");
		rd.forward(req, res);
}
}
