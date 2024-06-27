public class Main53{
	public static void main(String[]args) throws MyException{
		foo();
	}
	public static void foo() throws MyException { 
		throw new MyException();
	}
}
class MyException extends Exception{}
