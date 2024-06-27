public class Main5{
	public static void main(String []args){
		Animal  a = new Cat();
		a.voice();
	}
}
class Animal{
	public void voice(String s){
		System.out.println("voice!"+s);
	}
}
class Cat extends Animal{
	@Override	
	public void voice(){
		System.out.println("Meow");
	}
}
