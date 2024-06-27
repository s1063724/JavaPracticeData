import java.util.*;
public class Main96{
	public static void main(String []args){
		Set<String> set = new HashSet<>();
		System.out.println(set.add("A"));
		System.out.println(set.add("B"));
		System.out.println(set.add("C"));
		System.out.println(set.add("A"));
		System.out.println(set.add("B"));
		System.out.println(set);
		for(String s:set){
			System.out.println(s);
		}
	}
}
