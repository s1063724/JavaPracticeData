import java.util.*;
import java.text.*;
public class Main161{
	public static void main(String[] args){
		Locale l = Locale.TAIWAN;
		Date now = new Date();
		DateFormat d1 = DateFormat.getDateInstance(DateFormat.SHORT, l);
		DateFormat d2 = DateFormat.getDateInstance(DateFormat.MEDIUM, l);
		DateFormat d3 = DateFormat.getDateInstance(DateFormat.LONG, l);
		DateFormat d4 = DateFormat.getDateInstance(DateFormat.FULL, l);
		System.out.println(d1.format(now));
		System.out.println(d2.format(now));
		System.out.println(d3.format(now));
		System.out.println(d4.format(now));
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", l);
		SimpleDateFormat s2 = new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss", l);
		SimpleDateFormat s3 = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss", l);
		System.out.println(s1.format(now));
		System.out.println(s2.format(now));
		System.out.println(s3.format(now));
	}
}
