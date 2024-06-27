public class Main73{
	public static void main(String []args){
		bar(Foo.valueOf(args[0]));
	}
	public static void bar(Foo f){
		System.out.println(f.say());
	}
}
enum Foo{
	A("Mary"){
		public String say(){
			return "AAA";
		}
	},
	B("John"){
		public String say(){
			return "Hello";
		}
	},
	C("Jason"){
		public String say(){
			return "CCC "+super.say();
		}
	};
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
