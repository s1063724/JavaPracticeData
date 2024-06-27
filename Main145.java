import static java.nio.file.StandardOpenOption.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.io.*;
import java.util.*;
public class Main145{
	private static final int capacity = 5;
	private static final File f = new File("./test.txt");
	public static void main(String[] args) {
		try{
			write();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void write() throws IOException {
		ByteBuffer buffer = ByteBuffer.allocate(capacity);
		FileChannel channel = FileChannel.open(f.toPath(), CREATE, WRITE);
		String[] content = split("Hello World!!\n", capacity);
		for(String s: content){
			buffer.put(s.getBytes());
			buffer.flip();
			while(buffer.hasRemaining()){
				channel.write(buffer);
			}
			buffer.clear();
		}
	}
	private static String[] split(String s, int size){
		List<String> list = new ArrayList<>();
		int i = 0, e = size;
		while(i<s.length()){
			list.add(s.substring(i, e));
			e = (i=e)+size>s.length()?s.length():i+size;
		}
		return list.toArray(new String[]{});
	}
}
