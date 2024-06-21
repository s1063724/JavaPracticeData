public class Main33{
	public static void main(String[]args){
		A a = new A();
		a.s="A";
		A b = new A();
		b.s="A";
		System.out.println(a.equals(b));
	}
}
class A{
	public String s;
	public boolean equals(Object o){
		System.out.println(o);
		if(o instanceof A){
			A a = (A) o;
			return this.s.equals(a.s);
		}
		return false;
	/*
		if (o instanceof A a){
			return this.s.equals(a.s);
		}
		return false;
	*/
	}	
	public int hashCode(){
		return 0;
	}
	
}
class B{}

