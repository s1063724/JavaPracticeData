package foo;
import java.sql.*;
public class Main171 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		String url = "jdbc:derby://localhost:1527/myDB;user=root;password=sa";
		Connection conn = DriverManager.getConnection(url);
		CallableStatement call = conn.prepareCall("{CALL GET_NAME(?,?)}");
		call.setLong(1, 1L);
		call.registerOutParameter(2, Types.VARCHAR);
		call.execute();
		System.out.println(call.getString(2));
		conn.close();
	}
}
