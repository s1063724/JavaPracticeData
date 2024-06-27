public class Main70{
	public static void main(String []args){
		System.out.println(Foo.A);
		System.out.println(Foo.A.getName());
		System.out.println(Foo.valueOf(args[0]));
		System.out.println(Foo.valueOf(args[0]).getName());
	}
}
enum Foo{
	A("Mary"),
	B("John"),
	C("Jason");
	private String name;
	Foo(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
}
