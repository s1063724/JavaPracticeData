import java.util.concurrent.*;
public class Main131{
	public static void main(String []args){
		ExecutorService exec = Executors.newFixedThreadPool(5);
		exec.submit(()->{
			try{
				Thread.sleep(3000);
			}catch(Exception e){}
			System.out.println("Ok");
		});
		try{
			Thread.sleep(5000);
		}catch(Exception e){}
		exec.shutdown();
	}
}
