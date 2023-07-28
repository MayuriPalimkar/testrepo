package array1;

public class largestnumber {

	public static void main(String [] args) {
		
		int arr[] = new int[5];
		arr[0]= 4;
		arr[1]= 85;
		arr[2]= 78;
		arr[3]= 663;
		arr[4]= 8;
		
	   int	max = arr[0];
		
	   for (int i=0; i<arr.length; i++) {
		   if(arr[i]> max) {
			  max= arr[i];
		   } 
	   }
	   System.out.println("largest number is-->"+max);
	}
}
