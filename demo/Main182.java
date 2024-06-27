public class Main182{
	public static void main(String[]args){
		final var s=bar("AAA", n->"hi "+n);
		System.out.println(s);
	}
	private static String bar(final String name, final Foo f){
		return f.hi("BB",f.hi(name));
		//return f.hi(name);
	}
}
@FunctionalInterface
interface Foo{
	public String hi(String name);
	public default String hi(String a,String b){
		return a+" "+b;
	}
}
@FunctionalInterface
interface Foo2{
	public String hi(String name);
}
