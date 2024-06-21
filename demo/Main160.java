import java.util.*;
public class Main160{
	public static void main(String[] args){
		ResourceBundle r = ResourceBundle.getBundle("message");
		System.out.println(r.getString("foo.bar"));

		var a=new Locale(args[0],args[1]);
		r = ResourceBundle.getBundle("message", a);
		System.out.println(r.getString("foo.bar"));
		
		Locale l = new Locale("en","US");
		r = ResourceBundle.getBundle("message", l);
		System.out.println(r.getString("foo.bar"));
	}
}
