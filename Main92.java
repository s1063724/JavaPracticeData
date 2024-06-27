public class Main92{
	public static void main(String[]args){
		StringBuffer s = new StringBuffer("123456");
		System.out.println(s);
		s.setLength(2);
		System.out.println(s);
		System.out.println(s.capacity());
		s.setLength(6);
		System.out.println(s);
		System.out.println(s.capacity());		
	}
}
