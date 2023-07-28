package array;

public class multiarray {

	public static void main(String [] args) {
		
		int arr [] = {2,3,4,5,6,7,6,8,};
		
		System.out.println("length of given array is-->"+arr.length);
		System.out.println();
		
		int multi = 1;
		for(int i=0; i<arr.length; i++) {
			multi= multi  * arr[i];
		}
		System.out.println("multiplication of given array is "+multi );
	}
}
