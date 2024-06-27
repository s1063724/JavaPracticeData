package foo;
import java.sql.*;
public class Main168 {
	public static void main(String[] args) throws Exception {
		//Class.forName("org.apache.derby.jdbc.ClientDriver");
		String url = "jdbc:derby://localhost:1527/myDB;user=root;password=sa";
		Connection conn = DriverManager.getConnection(url);
		String query = "select id,name from foo where name = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setString(1, args[0]);
		ResultSet result = statement.executeQuery();
		while(result.next()) {
			Integer id = result.getInt("id");
			String name = result.getString("name");
			System.out.println(id+"\t"+name);
		}
		conn.close();
	}
}
