import java.nio.*;
import java.nio.file.*;
public class Main148{
	public static void main(String[] args){
		Path p = Paths.get("/usr/share/../local/./openjdk-8/bin/java");
		System.out.println(p);
		System.out.println(p.getFileName());
		System.out.println(p.getParent());
		System.out.println(p.getRoot());
		System.out.println(p.getNameCount());
		System.out.println(p.normalize());
		System.out.println(p.toUri());
		System.out.println(p.toAbsolutePath());
	}
}
