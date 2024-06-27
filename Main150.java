import java.nio.file.*;
public class Main150{
	public static void main(String[] args){
		Path p = Paths.get("/home/wuray/下載/jdk-21_linux-x64_bin/jdk-21.0.2/bin/java");
		System.out.println(Files.exists(p));
		System.out.println(Files.isReadable(p));
		System.out.println(Files.isWritable(p));
		System.out.println(Files.isExecutable(p));
		System.out.println(Files.isDirectory(p));
	}
}
