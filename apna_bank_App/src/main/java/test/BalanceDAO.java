package test;
import java.sql.*;

public class BalanceDAO {

	int k=0;
	public int select(BalanceBean ab)
	{
		try
		{ //accountNo,userid,password,name,amount,aadhar_number,pan_number,address,mailid,phone
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from accountUser where accountNo=? and userid=? and password=?");
			ps.setLong(1, ab.getAccountNo());
			ps.setString(2,ab.getUserid());
			ps.setString(3,ab.getPassword());
			
			if(ps.execute())
			{
				k=1;
				ResultSet rs=ps.executeQuery();
				while (rs.next()) {

					String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", rs.getLong(1), rs.getString(2), rs.getString(3),
							rs.getString(4), rs.getDouble(5),rs.getLong(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getLong(10));
					
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return k;
	}
}

