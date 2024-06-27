import java.util.concurrent.atomic.*;
public class Main122{
	public static void main(String[]args){
		AtomicInteger i = new AtomicInteger(5);
		if(i.compareAndSet(5, 30)){
			System.out.println("compareAndSet() "+i);
		}
		i.getAndIncrement();
		System.out.println("getAndIncrement() "+i);
	}
}
