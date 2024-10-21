package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")
public class User implements Servlet
{
@Override
public void init(ServletConfig scf) throws ServletException{
	
}
@Override
public void service(ServletRequest req,ServletResponse res)throws ServletException,
IOException{
	
	String uName = req.getParameter("uname");
	String Fname = req.getParameter("fname");
	String Lname=req.getParameter("lname");
	String Address=req.getParameter("address");
	String mailId=req.getParameter("mid");
	String Phone=req.getParameter("phno");
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	pw.println("User Name    :"+uName+"<br>");
	pw.println("First name   :"+Fname+"<br>");
	pw.println("Last name    :"+Lname+"<br>");
	pw.println("Full name    :"+Fname+" "+Lname+"<br>");
	pw.println("Address      :"+Address+"<br>");
	pw.println("MailId       :"+mailId+"<br>");
	pw.println("Phone number :"+Phone+"<br>");
	
}

@Override
public void destroy()
{
//NoCode
}
@Override
public String getServletInfo()
{
return "";
}
@Override
public ServletConfig getServletConfig()
{
return this.getServletConfig();
}

}
