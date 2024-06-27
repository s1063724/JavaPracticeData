public class Main71{
	public static void main(String[]args){
		Foo f = null;
		try{
			f = Foo.valueOf(args[0]);
		}catch(IllegalArgumentException e){
			System.out.println("非法引數");
		}
		System.out.println(f);
	}
	public static Foo f(){
		return Foo.A;
	}
}
enum Foo{
	//列舉值(值為固定的常數)
	A,B,C;
}
