import java.time.Instant;
public class Main64{
	public static void main(String[]args){
		var i =Instant.now();
		System.out.println("現在時間："+i);
		var j =Instant.parse("2024-04-06T08:00:00Z");
		System.out.println("解析日期格式："+j);
		System.out.println("取得timestamp:"+j.getEpochSecond());
	}
}
