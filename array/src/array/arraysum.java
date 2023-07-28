package array;

public class arraysum {
	public static void main(String [] args) {
		int arr[] = {45,52,68,96,32,12};
		
		System.out.println("length of given array is-->"+arr.length);
		System.out.println();
		
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		
		}
		System.out.println("Sum i -->"+sum);
		
		
	}

}
