public class Main20{
	public static void main(String[]args){
		int i =100;
		System.out.println(i);
		i = foo(i);
		System.out.println(i);	
	}
	static int foo(int i){
		return i+=100;
	}
}

