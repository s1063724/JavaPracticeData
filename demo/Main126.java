import java.util.concurrent.*;
public class Main126{
	public static void main(String[]args){
		CountDownLatch latch= new CountDownLatch(3);
		for(int i=0;i<5;i++){
			new Thread(()->{
				String name = Thread.currentThread().getName();
				try{
					Thread.sleep(3000);
					System.out.println(name + " countDown");
					latch.countDown();
				}catch(Exception e){}
			}, "T"+i).start();
		}
		try{
			latch.await();
			System.out.println("Ok");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
