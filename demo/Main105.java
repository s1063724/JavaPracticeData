import java.util.*;
public class Main105<T extends Number> implements Inf<T, String>{
	T t;
	public T getT(){
		return this.t;
	}
	public void setT(T t){
		this.t = t;
	}
	public static void main(String[]args){
		Main105<Integer> m = new Main105<>();
		m.setT(1);
		test(m);
	}
	public static void test(Inf<?, ?> i){
		System.out.println(i.getT());
	}
}
interface Inf<T, A>{
	public T getT();
	public void setT(T t);
}
