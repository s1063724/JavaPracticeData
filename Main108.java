import java.util.*;
public class Main108<T extends Number> implements Inf<T>{
	T t;
	public T getT(){
		return this.t;
	}
	public void setT(T t){
		this.t = t;
	}
	public static void main(String[]args){
		Inf<Number> m = new Main108<Number>();
		m.setT(1);
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
