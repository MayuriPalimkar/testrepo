package array1;

public class arraysum {
	public static void main(String [] args) {
		int arr [] = {52, 96, 63 , 75 , 35 , 28, 46};
		 System.out.println(arr.length);
		 System.out.println();
		 
		 int sum = 0;
		 for (int i=0; i<arr.length; i++) {
			 sum = sum + arr[i];
			// System.out.println("sum of given array is -->"+sum);
		 }
		 System.out.println("sum of given array is -->"+sum);
	}

}
