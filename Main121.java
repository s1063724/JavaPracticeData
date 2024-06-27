public class Main121{
	public static void main(String[]args) throws Exception{
		Thread t1 = new Thread(()->{
			Thread t = Thread.currentThread();
			String name = t.getName();
			synchronized(t){
				try{
					System.out.println("wait");
					t.wait();
				}catch(Exception e){}
				for(int i=0;i<10;i++)
					System.out.println(name+"\t"+i);
			}
		}, "T1");
		Thread t2 = new Thread(()->{
			String name = Thread.currentThread().getName();
			for(int i=0;i<10;i++)
				System.out.println(name+"\t"+i);
			synchronized(t1){
				t1.notify();
			}
		}, "T2");
		t1.start();
		Thread.sleep(500);
		t2.start();
	}
}
