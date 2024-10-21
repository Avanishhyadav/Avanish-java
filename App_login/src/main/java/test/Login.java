package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")
public class Login implements Servlet
{
@Override
	public void destroy() {}
	@Override
	public ServletConfig getServletConfig() {return null;}
	@Override
	public String getServletInfo() {return null;}
	@Override
	public void init(ServletConfig arg0) throws ServletException {}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("user");
		String p=req.getParameter("pword");
		PrintWriter pw=res.getWriter();
		pw.print("<html><body>");
        pw.print("<div style='color: green; font-size: 40px; "
        		+ "background-image: linear-gradient(43deg, #d041a5 0%, #dfca15 46%, #0ee444 100%); "
        		+ "padding: 100hv;height:590px;display:flex; border: 20px solid gold;"
        		+ " align-items: center;justify-content: center;flex-direction: column;'>");
       
       
        pw.println("<h2>USER LOGIN </h2>");
		if(name.equals("avvi@123")&& p.equals("123456"))
		{
		pw.println("you login successfully");	
		}
		else
		{
			pw.println("userId and password is not matched!!!!");
		}
		pw.println("<h2> </h2>");
        pw.println("<a href=\"user.html\">Back to Login</a>");
       pw.println("</body></html>");
	}

}
