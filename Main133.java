import java.util.concurrent.*;
public class Main133{
	public static void main(String[]args)throws Exception{
		String result = CompletableFuture.supplyAsync(()->"Ray")
			.thenCombineAsync(CompletableFuture.supplyAsync(()->"Hi "), (s,u)->u+s)
			.thenComposeAsync(s->CompletableFuture.supplyAsync(()->s+", How are you?"))
			.whenCompleteAsync((s,e)->System.out.println(s+"\n"+e))
			.thenApplyAsync(s->s+" fine.")
			.get();
		System.out.println("result: "+result);
	}
}
