import java.util.concurrent.*;
public class Main130{
	public static void main(String []args){
		ExecutorService exec = Executors.newCachedThreadPool();
		Future<String> f = exec.submit(()->{
			Thread.sleep(3000);
			return "Ok";	
		});
		try{
			System.out.println("do something to wait submit");
			String result = f.get();
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}
		exec.shutdown();
	}
}
