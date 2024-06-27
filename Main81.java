import java.util.Optional;
import java.util.function.Consumer;
public class Main81{
	public static void main(String []args){
		var s =Optional.ofNullable("aaa");
		if(s.isPresent()){
			System.out.println(s.get());
		}
		s.ifPresent(new Consumer<String>(){
			public void accept(String s){
				System.out.println("AAA "+s);
			}
		});
	}
}
