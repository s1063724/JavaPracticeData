import java.util.Arrays;
public class Main59{
	public static void main(String[]args){
		String users[][]={
			{"AAA","5656"},
			{"BBB","7878"},
			{"CCC","9898"}
		};
		var isLogin=false;
		for(String[] s: users){
			if(args[0].equals(s[0]) && args[1].equals(s[1])){
				isLogin = true;
			}
		}
		if(isLogin){
			System.out.println("Login ok");
		}else{
			System.out.println("Login fail");
		}
	}
}
