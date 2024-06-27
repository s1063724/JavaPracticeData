import java.util.*;
public class Main99{
	public static void main(String[]args){
		var list = List.of(1,6,3,2,4,5);
		var set = Set.of(5,3,2,9,6,4,1);
		var map = Map.of("A",1,"B",5,"C",5,"D",4);
		var map1 = Map.ofEntries(
			Map.entry("A",2),
			Map.entry("B",5),
			Map.entry("C",6),
			Map.entry("D",2),
			Map.entry("E",3),
			Map.entry("F",4)
		);
		System.out.println(list);
		System.out.println(set);
		System.out.println(map);
		System.out.println(map1);
	}
}
