package foo;
import java.sql.*;
public class Main172 {
	public static void main(String[] args) throws Exception {
		//Class.forName("org.apache.derby.jdbc.ClientDriver");
		String url = "jdbc:derby://localhost:1527/myDB;user=root;password=sa";
		Connection conn = DriverManager.getConnection(url);
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery("select id,name from foo");
		ResultSetMetaData metadata = result.getMetaData();
		int count = metadata.getColumnCount();
		for(int i=1;i<=count;i++) {
			String name = metadata.getColumnName(i);
			String type = metadata.getColumnTypeName(i);
			System.out.println(name+"\t"+type);
		}
		conn.close();
	}
}
