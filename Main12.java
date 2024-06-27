public class Main12{
	public static void main(String []args){
		
	}
}
interface A{
	int e = 1;
	void f();
}
interface B extends A{
	int g = 10;
	void h();
}
class C implements B{
	public void f(){
		System.out.println("hh");
	}
}
