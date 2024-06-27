import java.util.Arrays;
public class Main58{
	public static void main(String...args){
		System.out.println(Arrays.toString(args));
		System.out.println(args.length);
		System.out.println("-----------");
		Main58 f = new Main58();
		f.foo1(new String[]{"A","B"});
		f.foo2("A","B","C");
	}
	//固定長度陣列
	public void foo1(String[]args){

	}
	//可變長度的陣列
	public void foo2(String...args){
		//陣列長度至少一個
		if(args.length>=1){
			System.out.println(Arrays.toString(args));
			System.out.println(args.length);
		}else{
			System.out.println("輸入一個以上字串");
		}
	}
}
