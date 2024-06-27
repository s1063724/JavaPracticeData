public class Main75{
	public static void main(String []args){
		var u = new User("1","Jason");
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u);
	}
}
class User{
	private String id;
	private String name;
	public User(String id,String name){
		this.id=id;
		this.name=name;
	}
	public String getId(){return this.id;}
	public String getName(){return this.name;}
	public boolean equals(Object o){return super.equals(o);}
	public int hashCode(){return super.hashCode();}
	public String toString(){return super.toString();}
}
