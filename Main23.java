import java.util.stream.Stream;
public class Main23{
	public static void main(String[]args){
		String s = "SjiidDKFJ";
		String s1 = "  vkokp   pldpLL   ";
		System.out.println(s.toUpperCase());//轉大寫
		System.out.println(s.toLowerCase());//轉小寫
		System.out.println(s1.trim());//去除前後空白
		System.out.println(s1.strip());//去除前後空白
		System.out.println(s.toCharArray());//變字元陣列
		System.out.println(s.concat(" !!~~"));//字串相連
		System.out.println(" ".isBlank());//去除空白後判斷是否為空
		String s2 = "Hello\r\nKitty\n";
		Stream<String> li = s2.lines();//根據換行符號取得各行結果
		//java lambda表達式
		li.forEach(System.out::println);
		System.out.println(s.repeat(2));//重複
	}
}
