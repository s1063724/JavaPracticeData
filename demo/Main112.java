public class Main112{
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
	public int i;
}
