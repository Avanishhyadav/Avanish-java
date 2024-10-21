package test;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrieve_data {  

	public static void main(String [] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1522:xe","Avanish","vishal");
			PreparedStatement ps=con.prepareStatement("select * from emp101");
			ResultSet rs = ps.executeQuery();
			try {
				FileWriter fw = new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\Data\\info1.csv");
				fw.write("Id,NAME,AGE,SALARY,PHONO NO., ADDRESS,GENDER , PROFELE,HOBBY");
				while (rs.next()) {

					String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", rs.getInt(1), rs.getString(2), rs.getInt(3),
							rs.getDouble(4), rs.getLong(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
					fw.write('\n');
					fw.write(line);
				}
				fw.close();

			} catch (IOException e) {
				System.out.println(e.toString());
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Success");
	}

}
