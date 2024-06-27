public class Main{
	public static void main(String[]args){
		Main.Foo f = new Main.Foo();
		System.out.println("Hi~"+f.getName());
	}
	public static class Foo{
		public String getName(){
			return "Jason";
		}
	}
}
