public class Main179{
	public static void main(String[]args){
		A a=new A();
		System.out.println(a.plusOne(10));
	}
}
class A{
	private int s;
	public int plusOne(int i){
		s=i+100;
		return i+1;
	}
}
