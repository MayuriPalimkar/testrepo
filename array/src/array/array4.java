package array;

public class array4 {

	public static void main(String [] args) {
		
		//datatype arrayname[] = new datatype[index size];
		String str[] = new String[4];    //array declaration
		
		str[0]= "Rohit";
		str[1] = "Viransh";    //array initialization
		str[3] = "7865";
	//	str[4] = "viru";       arrayoutofboundexception
		
		System.out.println(str.length);
		System.out.println();
		
		System.out.println(str[2]);
		
		for (int i = 0; i <= str.length-1; i++) {
			System.out.println(str[i]);
		}
		
		
		
	}
}
