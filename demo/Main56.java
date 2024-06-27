public class Main56{
	public static void main(String[]args){
		Main56 f = new Main56();
		f.foo(2);
		f.foo(-2);
	}
	private void foo(int i){
		assert i>-1: "Fail";
		System.out.println(i);
	}
}
