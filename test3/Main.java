public class Main{
	public static void main(String[]args){
		Main m = new Main();
		System.out.println("Hi"+m.say());
		System.out.println("Number is :"+m.Num());
	}
	public String say(){
		class Foo{
			public String getName(){
				return "Ray";
			}
		}
		Foo f = new Foo();
		return f.getName();
	}
	public int Num(){
		class Foo1{
			public int getNum(){
				return 1;
			}
		}
		Foo1 f1 = new Foo1();
		return f1.getNum();
	}
}
