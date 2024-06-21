public class Main30{
	public static void main(String []args){
		A a = new A();
		B b = new B();
		System.out.println(b instanceof A);
		System.out.println(a.equals(b));
	}
}
class A{
	public boolean equals(Object o){
		System.out.println(o);
		if (!(o instanceof A)){
			return false;
		}
		return true;
	}	
	public int hashCode(){
		return 0;
	}
}
class B extends A{}

