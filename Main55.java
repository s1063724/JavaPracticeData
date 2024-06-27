public class Main55{
	public static void main(String[]args){
		try{
			foo();
		}catch(MyException e){
			e.printStackTrace();
		}
	}
	public static void foo() throws MyException{
		throw new MyException("aaa");
	}
}
class MyException extends Exception{
	public MyException(){
		super();
	}
	public MyException(String msg){
		super(msg);
	}
	public MyException(Throwable e){
		super(e);
	}
	public MyException(String msg,Throwable e){
		super(msg,e);
	}
}
