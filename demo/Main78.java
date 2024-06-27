public class Main78{
	static {
		System.out.println("static");
	}
	public Main78(){
		System.out.println("object");
	}
	public static void main(String []args){
		System.out.println("class");
		Main78 m = new Main78();
	}
}
