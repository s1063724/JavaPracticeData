public class Main17{
	public static void main(String[]args){
		A a = new B();
		B b = (B) a;
		a.qoo();
		b.qoo();
	}
}
class A{
	public static void qoo(){
		System.out.println("qoo!!");
	}
}
class B extends A{
	public static void qoo(){
		System.out.println("qoo好喝！");
	}
}
