public class Main180{
	public static void main(String[]args){
		Foo f = new Foo(){
			@Override
			public String hi(String name){
				return "Hello "+name;
			}
		};
		System.out.println(f.hi("jason"));	

		Foo f1 = name->"Hello "+name;
		System.out.println(f1.hi("jason"));
	}
}
interface Foo{
	public String hi(String name);
}
