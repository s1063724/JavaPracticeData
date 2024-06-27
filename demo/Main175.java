package foo;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
public class Main175 {
	public static DataSource getDataSource() {
		BasicDataSource datasource = new BasicDataSource();
		datasource.setUrl("jdbc:derby://localhost:1527/myDB");
		datasource.setUsername("root");
		datasource.setPassword("sa");
		datasource.setInitialSize(15);
		datasource.setMinIdle(10);
		datasource.setMaxTotal(100);
		datasource.setTestOnBorrow(true);
		datasource.setValidationQuery("values 1");
		datasource.setMaxWaitMillis(5000);
		datasource.setMaxConnLifetimeMillis(3600000);
		return datasource;
	}
	public static void main(String[] args) throws Exception {
		//Class.forName("org.apache.derby.jdbc.ClientDriver");
		DataSource datasource = getDataSource();
		try(Connection conn = datasource.getConnection();){
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select id,name from foo");
			while (result.next()) {
				Integer id = result.getInt("id");
				String name = result.getString("name");
				System.out.println(id+"\t"+name);
			}
		}
	}
}
