public class Main69{
	public static void main(String[]args){
		try{
			System.out.println(f());
			System.out.println(Foo.A);
			System.out.println(Foo.valueOf("D"));
			Foo[] ff=Foo.values();
			for(Foo f:ff){
				System.out.println(f);
			}
		}catch(IllegalArgumentException e){
			System.out.println("錯誤參數");
		}
	}
	public static Foo f(){
		return Foo.A;
	}
}
enum Foo{
	//列舉值(值為固定的常數)
	A,B,C;
}
