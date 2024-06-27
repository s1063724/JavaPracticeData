//一些重要方法
public class Main21{
	public static void main(String[]args){
		String s = "  ghjfkdls;  ";
		var s1 = "sckijof";
		var s2 = "cSkiJof";
		var s3 = "ki";
		System.out.println(s.length());	//取得字串長度
		System.out.println(s.isEmpty()); //是否為空值
		System.out.println(s.charAt(5)); //回傳索引字元
		System.out.println(s.getBytes()); //字串用byte回傳
		System.out.println(s.equals(s1)); //字串是否相等
		//不分打小寫比較兩字串
		System.out.println(s1.equalsIgnoreCase(s2));
		//比較兩字串ascii差值
		System.out.println(s1.compareTo(s2));
		//判斷開頭是否想等,offset跳過幾格後與prefix相等
		System.out.println(s1.startsWith(s3, 2));
		System.out.println(s1.indexOf("o")); //判斷字元在字串的哪個位置
	}
}
