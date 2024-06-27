import java.util.Scanner;
public class Main60{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String users[][]={
			{"AAA","5656"},
			{"BBB","7878"},
			{"CCC","9898"}
		};
		System.out.print("輸入帳號：");
		String acc = sc.next();
		System.out.print("輸入密碼：");
		String pwd = sc.next();
		var isLogin=false;
		for(String[] s: users){
			if(acc.equals(s[0]) && pwd.equals(s[1])){
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
