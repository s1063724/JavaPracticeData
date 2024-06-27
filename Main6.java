public class Main6{
	public static void main(String []args){
		Animal a = new Cat();
		a.voice();
	}
}
class Animal{
	public void voice(){
		System.out.println("Voice!!");
	}
}
class Cat extends Animal{
	@Override	
	private void voice(){
		System.out.println("Meow");
	}
}
