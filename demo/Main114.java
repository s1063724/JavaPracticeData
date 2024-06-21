public class Main114{
	public static void main(String[]args) throws Exception{
		Thread t = new Foo();
		t.run();
		Thread.sleep(100000);
	}
}
class Foo extends Thread{
	public void run(){
		System.out.println("Hi");
		try{
			Thread.sleep(100000);
		}catch(Exception e){}
	}
}
