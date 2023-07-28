package Exception_handling;

public class Exception_handling1 {

	public static void main(String[] args) {
		//Types of exception
		//1.checked Exception
		//2.Unchecked exception
		
		//1.Arithmetic Exception
		//2.ArrayoutofboundException
		//3.NullpointerException
		//4.NumberFormatException
		
		System.out.println("Hi ...good evening");
		
		int number = 25;
	//	System.out.println(number/0);   //Arithmetic Exception
		System.out.println("Hi ...good evening");
		
		String str = "Rohit";
		
		//Integer.parseInt(str);   // java.lang.NumberFormatException
		String test = null;
	//	System.out.println(test.length());
	//	 java.lang.NullPointerException: Cannot invoke "String.length()" because "test" is null
		
		int arr[] = new int[-5];    // java.lang.NegativeArraySizeException: -5
		arr[0] = 33;
		arr[5] = 50;   //arrayOutOfBoundException
		

	}

}
