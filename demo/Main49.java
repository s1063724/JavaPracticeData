public class Main49{
	public static void main(String[]args){
		int sum=0;
		for(int i=1;i<101;i++){
			sum+=i;
		}
		System.out.println(sum);
		System.out.println(sum(0,100));
	}
	public static int sum(int s,int e){
		if(e == 0){
			return s;
		}else{
			return sum(s+e,e-1);
		}
	}
}
