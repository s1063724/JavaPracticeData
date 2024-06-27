public class Main46{
	public static void main(String[]args){
		A:
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					System.out.println("Hi");
					continue A;
				}
				System.out.println("Never do");
			}
		System.out.println("world!");
	}
}
