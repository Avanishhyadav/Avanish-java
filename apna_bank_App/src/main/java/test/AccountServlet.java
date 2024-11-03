package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/create")
public class AccountServlet extends HttpServlet {
////accountNo,userid,password,name,amount,address,phone
	public long caaco() {
		return (long)((Math.random())*1999709000);
		}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		AccounterBean ab = new  AccounterBean();
		
		long acco=caaco();
		
		ab.setAccountNo(acco);
		ab.setUserid(req.getParameter("username"));
		String pa,pb ,pword;
		pa=req.getParameter("password");
		pb=req.getParameter("re-password");
		if(pa.equals(pb))
		{
			pword=pa;
	
		ab.setPassword(pword);
		}
		else
		{
			pword=null;
		
		}
		ab.setName(req.getParameter("name"));
		ab.setAmount(Double.parseDouble(req.getParameter("amount")));
		ab.setAdhar(Long.parseLong(req.getParameter("aadhar")));
	    ab.setPan(req.getParameter("pan"));
	    ab.setAddress(req.getParameter("address"));
	    ab.setMail(req.getParameter("mail"));
	    ab.setPhone(Long.parseLong(req.getParameter("phone")));

	    AccountDAO ob=new AccountDAO();
	   int k= ob.insert(ab);
	   if(k>0) {
		   req.setAttribute("msg", "User registered Successfully...<br>");
		   req.setAttribute("accountNo", ab.getAccountNo());
		   req.setAttribute("userid", ab.getUserid());
		   req.setAttribute("name", ab.getName());
		   req.setAttribute("address", ab.getAddress());
		   req.setAttribute("pan", ab.getPan());
		   req.setAttribute("mail", ab.getMail());
		   req.setAttribute("phone", ab.getPhone());
		   req.setAttribute("adhar", ab.getAdhar());
		   req.setAttribute("amount", ab.getAmount());
		   
		   RequestDispatcher rd = req.getRequestDispatcher("create.jsp");
		   rd.forward(req, res);
	   }
	   else {
		   req.setAttribute("msg", "invalid input...<br>");
		   RequestDispatcher rd = req.getRequestDispatcher("create.jsp");
		   rd.forward(req, res);

	   }
	}
}
