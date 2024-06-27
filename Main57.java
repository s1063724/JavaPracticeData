import java.util.Arrays;
public class Main57{
	public static void main(String[]args){
		int a[]={1,2,3,4,5};
		System.out.println("物件內的方法");
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		System.out.println("Arrays內的方法");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.hashCode(a));
	}
}
