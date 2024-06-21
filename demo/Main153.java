import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
public class Main153{
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("/etc/passwd");
		PosixFileAttributes attrs = Files.readAttributes(p, PosixFileAttributes.class);
		System.out.println("BasicFileAttributes");
		System.out.println(attrs.creationTime());
		System.out.println(attrs.lastAccessTime());
		System.out.println(attrs.lastModifiedTime());
		System.out.println(attrs.isDirectory());
		System.out.println(attrs.isRegularFile());
		System.out.println(attrs.isSymbolicLink());
		System.out.println(attrs.size());
		System.out.println("PosixFileAttributes");
		System.out.println(attrs.owner());
		System.out.println(attrs.group());
		System.out.println(attrs.permissions());
	}
}
