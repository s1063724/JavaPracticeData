import java.util.*;
public class Main103<T extends Number>{
	T t;
	public T getT(){
		return this.t;
	}
	public void setT(T t){
		this.t = t;
	}
	public <O> String say(O o){
		return "Hi "+o.toString();
	}
	public static void main(String[]args){
		Main103<Long> m = new Main103<>();
		m.setT(1L);
		System.out.println(m.getT());
		System.out.println(m.say("Ray"));
	}
}
