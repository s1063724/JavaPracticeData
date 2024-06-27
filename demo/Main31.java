public class Main31{
	public static void main(String[]args){
		A a = new A();
		B b = new B();
		int [] i=new int[3];
		System.out.println(null instanceof String);
		System.out.println(i instanceof Object);
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
class B{}
