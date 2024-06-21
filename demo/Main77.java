public class Main77{
	public static void main(String []args){
		var u1 = new User("1","Jason");
		System.out.println(u1);
		var u2 = new User("2");
		User.plus();
		System.out.println(u2);
		System.out.println(u1.getX());
		System.out.println(u2.getX());
	}
}
record User(String id, String name){
	public static int x;
	public User{
		System.out.println("OK");
	}
	public User(String id){
		this(id,"None");
	}
	public static void plus(){
		x++;
	}
	public int getX(){
		return x;
	}
}
