import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
public class Main157{
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("/home/wuray/demo/Main.java");
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:/**/*.{java,sh}");
		System.out.println(matcher.matches(p));
	}
}
