import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.io.*;
import java.util.*;
public class Main146{
	private static final int capacity = 5;
	private static final File f = new File("./test.txt");
	public static void main(String[] args) {
		try{
			read();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	private static void read() throws IOException {
		ByteBuffer buffer = ByteBuffer.allocate(capacity);
		FileChannel channel = FileChannel.open(f.toPath());
		int i = channel.read(buffer);
		while(i!=-1){
			buffer.flip();
			byte[] arr = new byte[capacity];
			buffer.get(arr, buffer.position(), buffer.limit());
			System.out.print(new String(arr));
			buffer.clear();
			i = channel.read(buffer);
		}
	}
}
