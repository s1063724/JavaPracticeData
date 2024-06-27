public class Main76{
	public static void main(String []args){
		var u = new User("1","Jason");
		System.out.println(u.id());
		System.out.println(u.name());
		System.out.println(u);
	}
}
record User(String id, String name){}
