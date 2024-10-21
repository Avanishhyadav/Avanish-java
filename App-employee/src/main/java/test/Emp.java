package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/dis")
public class Emp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = res.getWriter();

        try {
            int id = Integer.parseInt(req.getParameter("empid"));
            String name = req.getParameter("ename");
            int age = Integer.parseInt(req.getParameter("eage"));
            double sal = Double.parseDouble(req.getParameter("esal"));
            long phno = Long.parseLong(req.getParameter("ephNo"));
            String addr = req.getParameter("eaddr");
            String gender = req.getParameter("gen");
            String devp = req.getParameter("dev");
            String[] hob = req.getParameterValues("hobby");

            pw.print("<html><body>");
            pw.print("<div style='color: green; font-size: 40px; "
                    + "background-image: linear-gradient(43deg, #d041a5 0%, #dfca15 46%, #0ee444 100%); "
                    + "padding: 100hv;height:590px;display:flex; border: 20px solid gold;"
                    + " align-items: center;justify-content: center;flex-direction: column;'>");

            pw.println("<h2>********Employee Details*********** </h2>");
            pw.println("Employee id:" + id + "<br>");
            pw.println("Employee Name:" + name + "<br>");
            pw.println("Employee Age:" + age + "<br>");
            pw.println("Employee Salary:" + sal + "<br>");
            pw.println("Employee Phone No.:" + phno + "<br>");
            pw.println("Employee Address:" + addr + "<br>");
            pw.println("Employee Gender:" + gender + "<br>");
            pw.println("Employee Developer:" + devp + "<br>");
            pw.println("Employee Hobbies: " + "<br>");
            String hobby = "";
            for (String i : hob) {
                pw.println(i + "<br>");
                hobby += i + " ";
            }

            EmpBean eb = new EmpBean();
            eb.setId(id);
            eb.setName(name);
            eb.setAge(age);
            eb.setAddress(addr);
            eb.setSalary(sal);
            eb.setPh(phno);
            eb.setGender(gender);
            eb.setProfile(devp);
            eb.setHobbies(hobby);

            EmpDAO e = new EmpDAO();
            int k = e.empDB(eb);
            if (k > 0) {
                pw.println("Data Inserted Successfully...");
            } else {
                pw.println("Insertion failed");
            }
            pw.println("<h2> </h2>");
            pw.println("<a href=\"user.html\">Back to login</a>");
            pw.println("</body></html>");
           
        } catch (NumberFormatException e) {
            pw.println("Invalid input format. Please ensure all fields are correctly filled.");
        } finally {
        	 
            pw.close();
        }
    }
}
