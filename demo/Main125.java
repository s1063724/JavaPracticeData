import java.util.concurrent.*;
public class Main125{
	public static void main(String[]args){
		Semaphore s= new Semaphore(3);
		for(int i=0;i<5;i++){
			new Thread(()->{
				String name = Thread.currentThread().getName();
				try{
					s.acquire();
					System.out.println(name+" acquire");
					Thread.sleep(3000);
				}catch(Exception e){}
				s.release();
				System.out.println(name+" release");
			}, "T"+i).start();
		}
	}
}
