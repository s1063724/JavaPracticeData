import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
public class Main155{
	public static void main(String[] args) throws IOException {
		Iterable<FileStore> store = FileSystems.getDefault().getFileStores();
		for(FileStore s: store) {
			System.out.println(s.name());
			System.out.println(s.getTotalSpace());
			System.out.println(s.getUsableSpace());
		}
	}
}
