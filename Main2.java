package foo;
public class Main2 {
	public static void main(String[] args){
		Leo a = new Leo();
		a.eat();
	}
}
class Animal {
	public void eat(){
		System.out.println("Animal Eat");
	}
}
class Cat extends Animal {
	protected int leg = 4;
	public void eat(){
		System.out.println("Cat Eat");
	}
	public void jump(){
		System.out.println("Cat Jump");
	}
}
class Tiger extends Cat {
	public void eat(){
		System.out.println("Tiger Eat");
	}
}
class Leo extends Cat {
}
