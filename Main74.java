public class Main74{
	public static void main(String []args){
		Foo f = Foo.valueOf(args[0]);
		switch(f){
			case A:
				System.out.println(f.say());
				break;
			case B:
				System.out.println(f.say());
				break;
			case C:
				System.out.println(f.say());
				break;
		}
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
