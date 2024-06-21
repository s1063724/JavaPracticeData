import java.nio.*;
import java.nio.file.*;
public class Main149{
	public static void main(String[] args){
		Path p = Paths.get("/usr/share/../local/./openjdk-8/bin/java");
		System.out.println(p);
		System.out.println(p.subpath(3,5));
		System.out.println(p.resolve("abc"));
		System.out.println(p.resolve("/home/jason"));
		System.out.println(p.relativize(Paths.get("/home/jason")));
	}
}
