import java.util.Arrays;
public class BinarySearch{
	public static void main(String[]args){
		BinarySearch b = new BinarySearch();
		int a[] = {5,2,15,62,34,95,85,22,65,45};
		int arr[] = Arrays.sort(a);
		int target = 34;
		int result = b.binarysearch(arr, target);
		System.out.println(result);
	}
	public static int binarysearch(int []arr,int target){
		int left = arr[0];
		int right = arr[arr.length-1];
		while(left<=right){
			int mid = (left+right)/2;
			if(arr[mid]==target){
				return mid;
			}else if(arr[mid]>target){
				right = mid - 1;
			}else{
				left = mid + 1;
			}
		}
		return -1;
	}
}
