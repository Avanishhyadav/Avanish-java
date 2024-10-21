<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String Eid=request.getParameter("empid");
String Ename=request.getParameter("empname");
String Edesg=request.getParameter("empdesg");
double esal=Double.parseDouble(request.getParameter("empsal"));
String email=request.getParameter("empmailid");
long phno=Long.parseLong(request.getParameter("empphno"));
out.println("============Employee details=========");
out.println("<br>Employee Id: "+Eid);
out.println("<br>Employee Name: "+Ename);
out.println("<br>Employee Desgination: "+Edesg);
out.println("<br>Employee Salary: "+esal);
out.println("<br>Employee MailId: "+email);
out.println("<br>Employee Phono No.: "+phno);

%>
</body>
</html>