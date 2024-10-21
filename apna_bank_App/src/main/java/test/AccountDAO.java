package test;
import java.sql.*;

public class AccountDAO {

	int k=0;
	public int insert(AccounterBean ab)
	{
		try
		{ 
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into  accountUser values(?,?,?,?,?,?,?,?,?,?)");
			ps.setLong(1, ab.getAccountNo());
			ps.setString(2,ab.getUserid());
			ps.setString(3,ab.getPassword());
			ps.setString(4, ab.getName());
			ps.setDouble(5,ab.getAmount());
			ps.setLong(6,ab.getAdhar());
			ps.setString(7, ab.getPan());
			ps.setString(8,ab.getAddress());
			ps.setString(9, ab.getMail());
			ps.setLong(10, ab.getPhone());
			k=ps.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return k;
	}
}
