import java.util.regex.*;
public class Main94{
	public static void main(String[]args){
		Pattern p = Pattern.compile("saw");
		Matcher m =p.matcher("I saw a saw");
		while(m.find()){
			System.out.println(m.start()+"~"+m.end());
		}
		System.out.println(m.replaceAll("Java"));
	}
}
