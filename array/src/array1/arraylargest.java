package array1;

public class arraylargest {

	public static void main(String[] args) {
		
		int arr [] = {52,657,96,631,52,2,66};
		
		System.out.println("length of given array is--> "+arr.length);
		System.out.println();
		
		int max = arr[0];
		
		for(int i =0; i< arr.length; i++) {
			if (arr[i]> max) {
				max= arr[i];
			}
			
		}
		System.out.println("largest number in given array is "+max);
	}
}
