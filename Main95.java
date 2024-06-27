import java.util.*;
public class Main95{
	public static void main(String[]args){
		List<String> list = new ArrayList<>();
		System.out.println(list.add("A"));
		System.out.println(list.add("B"));
		System.out.println(list.add("C"));
		System.out.println(list);
		for(String s:list){
			System.out.println(s);
		}
	}
}
