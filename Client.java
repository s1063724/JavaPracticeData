import java.io.*;
import java.net.*;
public class Client{
	public static void main(String[] args){
		try(
			Socket socket = new Socket("localhost", 9000);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();){
			os.write("Hello, Server!\0".getBytes());
			int b;
			while ((b = is.read()) != 0) {
				System.out.print((char) b);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
