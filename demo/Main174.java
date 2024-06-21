package foo;
import java.sql.*;
public class Main174 {
	public static void main(String[] args) throws Exception {
		//Class.forName("org.apache.derby.jdbc.ClientDriver");
		String url = "jdbc:derby://localhost:1527/myDB;user=root;password=sa";
		Connection conn = DriverManager.getConnection(url);
		conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
		conn.setAutoCommit(false);
		try{
			Statement statement = conn.createStatement();
			statement.execute("update foo set name = 'John' where id = 2");
			conn.commit();
		}catch (SQLException e) {
			conn.rollback();
		}finally {
			conn.close();
		}
	}
}
