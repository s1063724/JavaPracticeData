import java.util.Optional;
public class Main82{
	public static void main(String []args){
		var s = Optional.ofNullable("aaa");
		var x = Optional.ofNullable(null);
		System.out.println(s.orElse("xx"));
		System.out.println(x.orElse("xx"));
	}
}
