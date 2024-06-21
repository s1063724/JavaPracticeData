import java.io.*;
import java.util.*;
public class Main85{
	public static void main(String[]args){
		Properties p = new Properties();
		try(FileInputStream f = new FileInputStream("test.properties")){
			p.load(f);
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(p.getProperty("name"));
	}
}
