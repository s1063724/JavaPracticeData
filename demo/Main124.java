import java.util.concurrent.locks.*;
public class Main123{
	public static void main(String[]args){
		Foo f =new Foo();
		new Thread(()->{
			for(int i =0 ;i<5;i++){
				f.bar1();
			}
		},"T1").start();
		new Thread(()->{
			for(int i=0;i<5;i++){
				f.bar2();
			}
		},"T2").start();
	}
}
class Foo{
	private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
	public void bar1(){
		String name = Thread.currentThread().getName();
		lock.readLock().lock();
		System.out.println(name+" read lock");
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
		lock.readLock().unlock();
		System.out.println(name+" read unlock");
	}
	public void bar2(){
		String name = Thread.currentThread().getName();
		lock.writeLock().lock();
		System.out.println(name+" write lock");
		try{
			Thread.sleep(3000);
		}catch(Exception e){}
		lock.writeLock().unlock();
		System.out.println(name+" write unlock");
	}
}
