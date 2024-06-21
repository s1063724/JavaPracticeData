package foo;
import java.sql.*;
public class Main165 {
	public static void main(String[] args) throws Exception {
		//Class.forName("org.apache.derby.jdbc.ClientDriver");手動載入4.0版之前
		String url = "jdbc:derby://localhost:1527/myDB;user=root;password=sa";
		Connection conn = DriverManager.getConnection(url);
		Statement statement = conn.createStatement();
		String query = "select id,name from foo where name = 'aaa'";
		ResultSet result = statement.executeQuery(query);
		while(result.next()) {
			Integer id = result.getInt("id");
			String name = result.getString("name");
			System.out.println(id+"\t"+name);
		}
		conn.close();
	}
}
