import java.nio.*;
import java.nio.file.*;
public class Main147{
	public static void main(String[] args){
		Path p1 = FileSystems.getDefault().getPath("/usr/local/openjdk-8/bin/java");
		Path p2 = Paths.get("/usr/local/openjdk-8/bin/java");
		System.out.println(p1+"\n"+p2);
	}
}
