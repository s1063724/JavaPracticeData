import java.io.*;
public class Main137{
	public static void main(String[]args)throws IOException{
		File f = new File("./test.txt");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] b=new byte[1024];
		try(fis;bis){
			while(bis.read(b)!=-1){
				System.out.println(new String(b));
			}
		}
	}
}
