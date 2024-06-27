import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
public class Main156{
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("/home/wuray/demo");
		Files.walkFileTree(p, new MyFileVisitor());
	}
}
class MyFileVisitor implements FileVisitor<Path> {
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		System.out.println("--preVisitDirectory--");
		System.out.println(dir);
		return FileVisitResult.CONTINUE;
	}
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
		System.out.println("--posVisitDirectory--");
		System.out.println(dir);
		return FileVisitResult.CONTINUE;
	}
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println("--visitFile--");
		System.out.println(file);
		return FileVisitResult.CONTINUE;
	}
	public FileVisitResult visitFileFailed(Path file, IOException exc) {
		System.out.println("--visitFileFailed--");
		System.out.println(file);
		return FileVisitResult.CONTINUE;
	}
}
