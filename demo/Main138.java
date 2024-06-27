import java.io.*;
public class Main138{
	public static void main(String[]args)throws IOException{
		File f = new File("./test.txt");
		FileWriter w = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(w);
		try(w;bw){
			bw.write("Hi~~".toCharArray());
			bw.flush();
		}
	}
}
