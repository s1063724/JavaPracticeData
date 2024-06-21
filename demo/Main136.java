import java.io.*;
public class Main136{
	public static void main(String[]args)throws IOException{
		String content = "Hello World!!";
		File f = new File("./test.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		try(fos;bos){
			bos.write(content.getBytes());
			bos.flush();
		}
	}
}
