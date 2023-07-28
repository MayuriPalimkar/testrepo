package array;

public class duplicatearray {

	public static void main(String [] args) {
		
		int arr[] = {5,6,7,2,6,9,4,2,5};
		
		System.out.println("duplicate numbers in given array");
		System.out.println("length of given array-->"+arr.length);
		
		for (int i =0; i< arr.length; i++) {
			for(int j = i+1; j< arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]+" ");
				}
			}
		}
	}
}
