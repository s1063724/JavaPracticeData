import java.util.Optional;
public class Main80{
	public static void main(String []args){
		var s = Optional.ofNullable("aaa");
		var x = Optional.ofNullable(null);
		if(s.isPresent()){
			System.out.println(s.get());
		}
		if(x.isPresent()){
			System.out.println(x.get());
		}
	}
}
