package foo;
import bar.Hello;
public class Main{
    public static void main(String[] args){
         Hello h = new Hello(); // 物件⽣成
         String result = h.say("jason"); // ⽅法呼叫
         System.out.println(result); // 印出結果
         h.say(); // ⽅法呼叫(無回傳值)
    }
}
