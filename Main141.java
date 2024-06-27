import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		Console console = System.console();
		boolean isValid = false;
		String account = "";
		String password = "";
		do {
			account = console.readLine("%s", "Account: ");
			password = new String(console.readPassword("%s", "Password: "));
			if("jason".equals(account) && "123456".equals(password)){
				System.out.println("Login Success");
				isValid = true;
			} else {
				System.out.println("Login Fail");
			}
		} while(!isValid);
	}
}
