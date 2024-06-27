import java.util.concurrent.*;
public class Main129{
	public static void main(String[]args){
		Phaser p = new Phaser(3){
			@Override 
			protected boolean onAdvance(int phase, int registeredParties){
				System.out.println("======"+phase+"=========");
				return super.onAdvance(phase, registeredParties);
			}
		};
		for(int i=0;i<3;i++){
			new Thread(()->{
				String name = Thread.currentThread().getName();
				System.out.println(name+" start");
				try{
					for(int j =0;j<3;j++){
						Thread.sleep(3000);
						System.out.println(name + " await");
						p.arriveAndAwaitAdvance();
					}
				}catch(Exception e){}
				System.out.println(name+" end");
			}, "T"+i).start();
		}
	}
}
