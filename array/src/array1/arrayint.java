package array1;

public class arrayint {

	public static void main(String [] args) {
		
		int arr[] [] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		for (int i =0; i<arr.length; i++) {
			for (int j = 0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
