import java.util.regex.*;
public class Main93{
	public static void main(String[]args){
		Pattern p = Pattern.compile("Java [EMS]{2}.*",Pattern.CASE_INSENSITIVE);
		Matcher m1 = p.matcher("Java SE 6");
		Matcher m2 = p.matcher("Java sE 7");
		Matcher m3 = p.matcher("Java Se 8");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
	}
}
