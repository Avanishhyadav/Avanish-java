package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDAO {
	public int empDB(EmpBean emp)
	{
		int k=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1522:xe","Avanish","vishal");
			PreparedStatement ps=con.prepareStatement("insert into emp101 values(?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getAge());
			ps.setDouble(4, emp.getSalary());
			ps.setLong(5, emp.getPh());
			ps.setString(6, emp.getAddress());
			ps.setString(7, emp.getGender());
			ps.setString(8, emp.getProfile());
			ps.setString(9, emp.getHobbies());
       
			k=ps.executeUpdate();
		System.out.println("k="+k);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return k;
	}
}

