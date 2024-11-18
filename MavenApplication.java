package aaa.bbb.MavenProj1;
import java.sql.*;
public class DBProg1 {

	public static void main(String[] args) 
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paul","root","root");  
			Statement stmt=con.createStatement();  
			stmt.executeUpdate("insert into emp3 values(103,'Sathish','#4 Nagu vilas');");
			ResultSet rs=stmt.executeQuery("select * from emp3");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}
		catch(Exception e)
		{ System.out.println(e); 
	}   }
}
