import java.io.*;
public class Main139{
	public static void main(String[]args)throws IOException{
		File f = new File("./test.txt");
		FileReader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);
		char[] c =new char[1024];
		try(r;br){
			while(br.read(c)!=-1){
				System.out.print(new String(c));
			}
		}
	}
}
