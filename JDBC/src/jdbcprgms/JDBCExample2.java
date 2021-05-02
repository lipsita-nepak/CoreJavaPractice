package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCExample2 {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/employeedb", "postgres","lipsita");

			
			PreparedStatement stmt=con.prepareStatement("insert into test values(?,?,?)");
			stmt.setInt(1, 103);
			stmt.setString(2, "TEDDY");
			stmt.setString(3, "bnglr");
			
			int i=stmt.executeUpdate();
			
			System.out.println(i+" records inserted");
			
			stmt.close();
			
	        con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
