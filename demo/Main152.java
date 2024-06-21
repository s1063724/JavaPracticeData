import static java.nio.file.StandardOpenOption.*;
import java.io.*;
import java.nio.file.*;
import java.nio.*;
import java.nio.channels.*;
public class Main152{
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("/tmp/t1/test.txt");
		write(p);
		read(p);
		cpAndMv(p);
		list(p);
	}
	private static void write(Path p) throws IOException {
		ByteChannel channel = Files.newByteChannel(p,CREATE,WRITE);
		ByteBuffer buffer = ByteBuffer.allocate(128);
		buffer.put("Hello World!!\n".getBytes());
		buffer.flip();
		channel.write(buffer);
		buffer.clear();
	}
	private static void read(Path p) throws IOException {
		ByteChannel channel = Files.newByteChannel(p,READ);
		ByteBuffer buffer = ByteBuffer.allocate(128);
		int i = channel.read(buffer);
		while(i!=-1){
			buffer.flip();
			byte[] arr = new byte[128];
			buffer.get(arr, buffer.position(), buffer.limit());
			System.out.println(new String(arr));
			buffer.clear();
			i = channel.read(buffer);
		}
	}
	private static void cpAndMv(Path p) throws IOException {
		Files.copy(p, Paths.get("/tmp/t1/test2.txt"));
		Files.move(p, Paths.get("/tmp/t1/test3.txt"));
	}
	private static void list(Path p) throws IOException {
		Files.list(p.getParent()).forEach(System.out::println);
	}	
}
