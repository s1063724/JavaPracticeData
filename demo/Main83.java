import java.util.Optional;
import java.util.function.Consumer;
import java.lang.Runnable;
public class Main83{
	public static void main(String []args){
		var x = Optional.ofNullable("java");
		x.ifPresentOrElse(
			s->System.out::println,
			()->System.out::println
		);
		x.or(()->Optional.ofNullable("ok")).get();
		x.stream().findFirst().orElse("yes");
	}
}
