import java.util.*;
public class Main100<T>{
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
		Main100<Integer> m = new Main100<>();
		m.setT(1);
		System.out.println(m.getT());
		System.out.println(m.say("Ray"));
	}
}
