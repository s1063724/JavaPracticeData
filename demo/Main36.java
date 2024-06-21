public class Main36{
	public static void main(String[]args){
		byte a =(byte) 10;
		System.out.println(~a); //a的補數
		System.out.println(a>>1); //右移一格
		System.out.println(a<<2); //左移兩格
		a >>>= 2; //無符號右移兩格
		System.out.println(a);
	}
}
