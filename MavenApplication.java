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






// mysql> use paul
// Database changed
// mysql> create table emp3(regno int(5), name varchar(20), addr varchar(20));
// Query OK, 0 rows affected (0.04 sec)

// mysql> select * from emp3;
// Empty set (0.01 sec)
// mysql> insert into emp3 values(101,'Raj','10/1 Raghu street');
// Query OK, 1 row affected (0.01 sec)

// mysql> insert into emp3 values(102,'Naveen','324-Ranga street');
// Query OK, 1 row affected (0.00 sec)
