import java.io.*;
public class Main135{
	public static void main(String[]args)throws IOException{
		String content = "Hello World!!";
		File f = new File("./test.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(content.getBytes());
		bos.flush();
		fos.close();
		bos.close();
	}
}
