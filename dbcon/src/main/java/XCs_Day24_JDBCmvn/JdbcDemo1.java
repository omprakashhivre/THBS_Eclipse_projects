package XCs_Day24_JDBCmvn;

	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.protocol.Resultset;
//import com.mysql.cj.xdevapi.Statement;

	public class JdbcDemo1 {
		static Connection con;
		public static void main(String[] args) throws ClassNotFoundException {
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/bank_system";
				String usr = "root";
				String pass = "admin";
			
				con = DriverManager.getConnection(url, usr, pass);
				String qry = "select * from bank_emp;";
				java.sql.Statement st  = con.createStatement();	
				ResultSet rs = st.executeQuery(qry);
				System.out.println("=============================================================================================================");
				while(rs.next()) {
					System.out.print("id : "+rs.getInt(1)+"\t");
					System.out.println(rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
					System.out.println(rs.getString(5));
					System.out.println(rs.getString(6));
					System.out.println(rs.getString(7)+","+rs.getString(8));					
					System.out.println(rs.getFloat(9));
					System.out.println(rs.getString(10));
					if(rs.getString(11).equals("Y"))
							System.out.println("Married");
					else
						System.out.println("Not married");
					System.out.println("====================================================================================================================");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
