public class Main22{
	public static void main(String[]args){
		String s = "vjfidk";
		System.out.println(s.lastIndexOf("d"));//字元最後出現的位置
		System.out.println(s.substring(4)); //返回子字串
		System.out.println(s.substring(2,6)); //從開始切到最後的前一個
		System.out.println(s.replace('i','q')); //字元置換
		System.out.println(s.replace("vj","dr")); //字串置換
		String s1 = "a,b,,c,";
		String [] strList = s1.split(",",2); //切字串
		System.out.println(strList.length);
		for(String i: strList){
			System.out.println(i);
		}
	}
}
