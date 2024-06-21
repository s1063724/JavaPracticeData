import java.io.*;
import java.nio.file.*;
public class Main151{
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("/tmp/t1/t2");
		Path p2 = Paths.get("/tmp/t1/t2/test.txt");
		System.out.println(Files.createDirectories(p1));
		System.out.println(Files.createFile(p2));
		System.out.println(Files.deleteIfExists(p2));
	}
}
