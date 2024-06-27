import java.util.*;
public class Main102<T extends Number>{
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
		Main102<String> m = new Main102<>();
		m.setT("1");
		System.out.println(m.getT());
		System.out.println(m.say("Ray"));
	}
}
