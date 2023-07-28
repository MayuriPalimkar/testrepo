package array;

public class array12 {

public static void maim(String [] args) {
		
		int arr[]= {2,5,6,7,5,2,6,9,78};
		
		System.out.println("length of given array is-->"+arr.length);
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
		       if (arr[i]== arr[j]) {
		    	   System.out.println(arr[j]);
		       }
			}
		}
	}
	
}
