package array1;

public class arraysmall {

	public static void main(String[] args) {
		int arr [] = {856, 963, 321 ,147, 852 ,456, 951};
		
		System.out.println("length of given array is-->"+arr.length);
		System.out.println();
		int min = arr[0];
		for(int i =0; i< arr.length; i++) {
			if( arr[i]< min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		
	}
}
