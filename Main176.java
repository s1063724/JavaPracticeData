public class Main176{
	public static void main(String []args){
		var sum=0;
		for(int i=0;i<11;i++){
			sum+=i;
		}
		System.out.println(sum);
		System.out.println(sum(0,10));
	}
	private static int sum(int s,int e){
		if(e==0){
			return s;
		}else{
			return sum(s+e,e-1);
		}
	}
}
