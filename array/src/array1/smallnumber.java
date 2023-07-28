package array1;

public class smallnumber {

	public static void main(String [] args) {
		int arr[] = {85,5,69,3,54,2};
		
		System.out.println("length of given array is-->"+ arr.length);
		System.out.println();
		
		int small = arr[0];//85
		//85           0<6
		//5             1<6
		//69            2<6
		//3             3<6
		//54             4<6
		//2               5<6
		        //6<6  false out of loop
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<small) {
				//85<85   false
				//5<85    true
				//69<5    false
				//3<5   true
				//54<3  false
				//2<3   true
				small = arr[i];
				//5   3    2
			}
		}
		System.out.println("smallest number is-->"+small);  //2
		
	}
}
