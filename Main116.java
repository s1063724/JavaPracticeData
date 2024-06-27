public class Main116{
	public static void main(String[]args) throws Exception{
		var u = new User();
		var logic = new UserLogic();
		logic.process(u);
		System.out.println(u.i);
	}
}
class UserLogic{
	public void process(User u){
		u.i = 10;
	}
}
class User{
	private int i;
	//getter()
	public int getI(){
		return i;
	}
	//setter()
	public synchronized void setI(int i){
		this.i=i;
	}
}
