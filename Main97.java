import java.util.*;
public class Main97{
	public static void main(String[]args){
		Deque<String> q = new ArrayDeque<>();
		q.add("A");
		q.push("Z");
		q.add("B");
		q.add("C");
		q.push("X");
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.pop());
		System.out.println(q);
	}
}
