public class Main{
	public static void main(String[]args){
		Inf f = new Inf(){
			public String say(){
				return "Hi Ray";
			}
		};
		System.out.println(f.say());
		bar(new Dar(){
			public String getNum(){
				return "25365";
			}
			//可以被編譯但不能被呼叫
			public void aa(){}
		});
	}
	public static void bar(Dar d){
		System.out.println(d.getNum());
		d.aa();
	}
}
interface Inf{
	public String say();
}
interface Dar{
	public String getNum();
}
