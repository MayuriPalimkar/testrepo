package array1;

public class largestnumber2 {

	public static void main(String [] args) {
		
		int arr[] = {2,5,7,65,9,3,45};
		System.out.println("length of array-->"+arr.length);
		System.out.println();
		
		int max = arr[0]; //2
		//i=2
		//i=5
		//i=7
		//i = 65
		//i = 9
		//i=3
		//i = 45
		for(int i =0; i< arr.length; i++) {
			
			if(arr[i]>max) {//2>2  false
				             //5>2  true
				//7>5  true
				//65>7  true
				//9>65  false
				//9>65  false
				//45>65 false
				max= arr[i]; //  5 7  65
			}
		}
		 System.out.println("largest number is-->"+max);
	}
}
