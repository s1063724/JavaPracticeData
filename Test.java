public class Test{
	public static void main(String []args){
		Root r = new D();
		r.say();
	}
}
sealed interface Root permits A,B,C{
	default void say(){
		System.out.println("Ok");
	}
}
sealed class A implements Root permits B{}
non-sealed class B extends A implements Root{}
final class C implements Root{}
class D extends B{}
