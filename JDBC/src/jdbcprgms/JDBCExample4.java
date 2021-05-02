package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class JDBCExample4 {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/employeedb", "postgres","lipsita");
			Statement stmt=con.createStatement();
			String sql="update test set address='hyd' where id=102";
		    boolean ret=stmt.execute(sql);
			System.out.println(ret);
			 
			 
			stmt.close();
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
