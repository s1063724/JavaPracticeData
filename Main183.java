public class Main183{
	public static void main(String[] args) throws Exception {
		Bar b = new Bar();
		System.out.println(b.bar("jason"));
	}
}
interface Foo1 {
	public default String bar(String s) {
		return "Hi "+s;
	}
}
interface Foo2 {
	public default String bar(String s) {
		return "Hello "+s;
	}
}
class Bar implements Foo1, Foo2 {
	public String bar(String s) {
		return Foo2.super.bar(s);
	}
}
