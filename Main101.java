import java.util.*;
public class Main101<T extends Number>{
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
		Main101<Integer> m = new Main101<>();
		m.setT(1);
		System.out.println(m.getT());
		System.out.println(m.say("Ray"));
	}
}
