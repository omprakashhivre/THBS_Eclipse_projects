package Jdbc_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.protocol.Resultset;
//import com.mysql.cj.xdevapi.Statement;

public class JdbcDemo {
	static Connection con;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/xcali";
			String usr = "root";
			String pass = "admin";
		
			con = DriverManager.getConnection(url, usr, pass);
			String qry = "select * from inc;";
			java.sql.Statement st  = con.createStatement();	
			ResultSet rs = st.executeQuery(qry);
			
			while(rs.next()) {
				System.out.println("id : "+rs.getInt(1));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
