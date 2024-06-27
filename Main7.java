public class Main7{
	public static void main(String []args){
		B b = new B();
		b.a();
		b.b();
	}
}
class A{
	int a = 15;
	public void a(){
		this.a = a;
		System.out.println(a);
	}
}
class B extends A{
	int b = 10;
	public void b(){
		this.b = b;
		super.a = a;
		super.a();
		System.out.println(a+b);
	}
}
