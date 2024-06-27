import java.util.Arrays;
public class Main61{
	public static void main(String[]args){
		int[] arr = {12,4,1,5,55,67,343,45,655,123,355,86,74};
		var sum = 0;
		var max = Integer.MIN_VALUE;
		var min = Integer.MAX_VALUE;
		for(var i:arr){
			sum += i;
			if(max<i){
				max = i;
			}
			if(min>i){
				min = i;
			}
		}
		var average = (double)sum/arr.length;
		System.out.printf("總和：%d \n",sum);
		System.out.printf("平均：%.4f \n",average);
		System.out.printf("最大值：%d \n",max);
		System.out.printf("最小值：%d \n",min);
	}
}
