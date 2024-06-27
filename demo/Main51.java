import java.io.*;
public class Main51{
	public static void main(String[]args){
		try{
			System.out.println("ok");
			throw new IOException();
		}catch(IOException e){
			System.out.println("IO");
		}catch(Exception e){
			System.out.println("");
		}
	}
}
