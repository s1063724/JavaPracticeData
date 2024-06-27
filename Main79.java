import java.util.Optional;
public class Main79{
	public static void main(String []args){
		var s = Optional.ofNullable("aaa");
		System.out.println(s);
		System.out.println(s.get());
		var x = Optional.ofNullable(null);
		System.out.println(x);
		System.out.println(x.get());
	}
}
