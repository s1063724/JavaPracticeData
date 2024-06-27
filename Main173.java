package foo;
import javax.sql.rowset.*;
public class Main173 {
	public static void main(String[] args) throws Exception {
		//Class.forName("org.apache.derby.jdbc.ClientDriver");
		String url = "jdbc:derby://localhost:1527/myDB";
		try(CachedRowSet cached = RowSetProvider.newFactory().createCachedRowSet();){
			cached.setUrl(url);
			cached.setUsername("root");
			cached.setPassword("sa");
			cached.setCommand("select id,name from foo");
			cached.execute();
			while(cached.next()) {
				int id = cached.getInt("id");
				String name = cached.getString("name");
				System.out.println(id+"\t"+name);
			}
		}
	}
}
