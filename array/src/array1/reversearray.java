package array1;

public class reversearray {

	public static void main(String [] args) {
		
		int arr[] = {2,3,4,5,6,7};
		
		System.out.println("length of given array is-->"+ arr.length);
		System.out.println();
		for (int j = 0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		for (int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
