public class Main117{
	public static void main(String[]args){
		Bar b = new Bar();
		for(int i = 0;i<10;i++){
			Thread t = new Thread(new Foo(b), "T" + i);
			t.start();
		}
	}
}
class Foo implements Runnable{
	private Bar b;
	public Foo(Bar b){
		this.b = b;
	}
	public void run(){
		String name = Thread.currentThread().getName();
		b.bar1(name);
	}
}
class Bar{
	public synchronized void bar1(String name){
		for(int i =0;i<15;i++){
			System.out.println(name + "\t"+i);
		}
	}
}
