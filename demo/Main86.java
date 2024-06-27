import java.util.*;
public class Main86{
	public static void main(String[]args){
		System.out.print("name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hi "+name);
		System.err.println("[Err]");
		sc.close();
	}
}
