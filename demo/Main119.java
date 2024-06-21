public class Main119{
	public static void main(String []args){
		Thread t1 = new Thread(()->{
			String name = Thread.currentThread().getName();
			while(!Thread.interrupted()){
				System.out.println(name+" running");
			}
			System.out.println(name+" finish");
		}, "T1");
		t1.start();
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
		t1.interrupt();
	}
}
