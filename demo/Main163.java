import java.util.*;
import java.text.*;
public class Main163{
	public static void main(String[] args){
		Locale l1 = Locale.TAIWAN;
		Locale l2 = Locale.JAPAN;
		NumberFormat n1 = NumberFormat.getCurrencyInstance(l1);
		NumberFormat n2 = NumberFormat.getCurrencyInstance(l2);
		System.out.println(n1.format(1000));
		System.out.println(n2.format(1000));
	}
}
