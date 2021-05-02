package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample3 {

	public static void main(String[] args) {
		  try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/employeedb", "postgres","lipsita");
			String query="select * from test";
		     Statement stmt=con.createStatement();
			 ResultSet rs=stmt.executeQuery(query);
			 while(rs.next()) {
				 int id=rs.getInt(1);
				 String name=rs.getString(2);
				 String address=rs.getString(3);
				 
				 System.out.println(id+","+name+","+address);
			 }
			stmt.close();
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
