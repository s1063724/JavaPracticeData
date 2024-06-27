import java.util.*;
public class Main107<T extends Number> implements Inf<T>{
	T t;
	public T getT(){
		return this.t;
	}
	public void setT(T t){
		this.t = t;
	}
	public static void main(String[]args){
		Main107<Long> m = new Main107<>();
		m.setT(1L);
		test(m);
	}
	public static void test(Inf<? super Integer> i){
		System.out.println(i.getT());
	}
}
interface Inf<T>{
	public T getT();
	public void setT(T t);
}
