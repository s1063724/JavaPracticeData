public class Main72{
	public static void main(String []args){
		System.out.println(Foo.A.say());
		System.out.println(Foo.B.say());
		System.out.println(Foo.C.say());
	}
}
enum Foo{
	A("Mary"),
	B("John"){
		public String say(){
			return "Hello";
		}
	},
	C("Jason");
	private String name;
	Foo(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public String say(){
		return "Hi~~";
	}
}
