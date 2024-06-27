public class Main52{
	public static void main(String []args){
		try{
			foo();
		}catch(MyException e){
			e.printStackTrace();
		}
	}
	public static void foo() throws MyException{
		throw new MyException();
	}
}
class MyException extends Exception{

}
