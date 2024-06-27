import java.util.concurrent.*;
public class Main127{
	public static void main(String[]args){
		CyclicBarrier c = new CyclicBarrier(3);
		for(int i=0;i<6;i++){
			new Thread(()->{
				String name = Thread.currentThread().getName();
				System.out.println(name+" start");
				try{
					Thread.sleep(3000);
					System.out.println(name + " await");
					c.await();
				}catch(Exception e){}
				System.out.println(name+" end");
			}, "T"+i).start();
		}
	}
}
