public class Main{
	private String name = "Ray";
	public static void main(String []args){
		Main m=new Main();
		Foo f = m.new Foo();
		f.bar();
	}
	class Foo{
		public void bar(){
			System.out.println(Main.this.name);
		}
		class FooChild{
			public void barChild(){
				System.out.println("hey hey");
			}
		}
	}
	class Foo1{
		public void bar(){
			System.out.println("this is Foo1 bar");
		}
	}
}
