public class Main25{
	public static void main(String[]args){
		A a =new A();
		B b =new B();
		System.out.println(a==b); //沒辦法比,==只能比原生型態
		System.out.println(a.equals(b));
	}
}
class A{}
class B extends A{}
