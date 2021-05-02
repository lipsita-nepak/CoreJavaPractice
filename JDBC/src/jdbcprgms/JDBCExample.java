package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCExample {

	
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		String Createsql=null;
		
		try {
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/employeedb", "postgres","lipsita");
			stmt=conn.createStatement();
			
			Createsql="create table test(id int primary key, name varchar(30), address varchar(30))";
			stmt.executeUpdate(Createsql);
			
			System.out.println("table created successfully");
			
			
			stmt.close();
			conn.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
