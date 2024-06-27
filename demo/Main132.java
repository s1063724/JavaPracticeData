import java.util.concurrent.*;
public class Main132{
	public static void main(String []args)throws Exception{
		ExecutorService exec = Executors.newFixedThreadPool(5);
		var f = exec.submit(()->{
			try{
				Thread.sleep(3000);
			}catch(Exception e){}
			System.out.println("Ok");
		});
		try{
			Thread.sleep(5000);
		}catch(Exception e){}
		System.out.println(f.get());
		exec.shutdown();
	}
}
