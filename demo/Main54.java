public class Main54{
	public static void main(String[]args){
		foo();
	}
	public static void foo(){
		throw new MyException();
	}
}
class MyException extends RuntimeException{}
