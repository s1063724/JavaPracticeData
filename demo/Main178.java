public class Main178{
	public static void main(String []args){
		System.out.println(sum(0,10));
	}
	private static int sum(final int s,final int e){
		return e==0?s:sum(s+e,e-1);
	}
}
