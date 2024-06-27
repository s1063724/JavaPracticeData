public class Main89{
	public static void main(String[]args){
		StringBuffer s = new StringBuffer("0123456789");
		System.out.println(s.capacity());
		System.out.println(s.substring(2));
		System.out.println(s.substring(0,2));
		System.out.println(s);
		System.out.println(s.replace(0,3,"Java"));
		System.out.println(s);
		System.out.println(s.delete(4,100));
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		s.setLength(2);
		System.out.println(s.length());
		s.append("son");
		System.out.println(s);
	}
}
