import java.util.*;
public class Main104<T extends Number> implements Inf<T>{
	T t;
	public T getT(){
		return this.t;
	}
	public void setT(T t){
		this.t = t;
	}
	public static void main(String[]args){
		Main104<Integer> m = new Main104<>();
		m.setT(1);
		test(m);
	}
	public static void test(Inf<?> i){
		System.out.println(i.getT());
	}
}
interface Inf<T>{
	public T getT();
	public void setT(T t);
}
