package test;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")

@WebServlet("/balance")
public class BalanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String accountNoStr = request.getParameter("accountNo");
    	long accountNo = 0; 

    	try {
    	    accountNo = Long.parseLong(accountNoStr); 
    	} catch (NumberFormatException e) {
    	    
    	    e.printStackTrace();
    	
    	}

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        BalanceBean bean = new BalanceBean();
        bean.setAccountNo((accountNo));
        bean.setUserid(username);
        bean.setPassword(password);

        BalanceDAO dao = new BalanceDAO();
        int result = dao.select(bean);

        if (result == 1) {
        	Connection con=DBConnection.getCon();
			PreparedStatement ps;
			try {
				ps = con.prepareStatement("select * from accountUser where accountNo=? and userid=? and password=?");
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
        
    }
}
}
