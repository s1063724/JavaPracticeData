public class Main184{
	public static void main(String[] args) throws Exception {
		Foo f = s->"Hello "+s;
		System.out.println(f.bar1("jason"));
		System.out.println(f.bar2("jason"));
		System.out.println(Foo.bar3("jason"));
	}
}
@FunctionalInterface
interface Foo {
	public String bar1(String s);
	public default String bar2(String s) {
		return "Hi "+s;
	}
	public static String bar3(String s) {
		return "Hi!! "+s;
	}
}
