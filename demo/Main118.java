public class Main118{
	public static void main(String[]args){
		Object obj1 = new Object();
		Object obj2 = new Object();
		new Thread(()->{
			String name = Thread.currentThread().getName();
			synchronized(obj1){
				System.out.println(name+": get obj1 flag");
				try{
					Thread.sleep(10000);
				}catch(Exception e){}
				System.out.println(name+ ": wait obj2 flag");
				synchronized(obj2){
					System.out.println(name+": get obj2 flag");
				}
			}
		},"T1").start();
		new Thread(()->{
			String name = Thread.currentThread().getName();
			synchronized(obj2){
				System.out.println(name+": get obj2 flag");
				try{
					Thread.sleep(10000);
				}catch(Exception e){}
				System.out.println(name+ ": wait obj1 flag");
				synchronized(obj1){
					System.out.println(name+": get obj1 flag");
				}
			}
		},"T2").start();
	}
}
