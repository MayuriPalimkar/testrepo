package forloops;

public class forloopt {
	//WAP to print odd numbers from 1 to 30 using for loop
	/*syntax -->
	 * for(initialization; condition ; inc/dec){
	 * printing statement
	 * }
	 */
	
	public static void main(String[]args) {
		
		int i;
		for(i=1; i<=30; i=i+2) {
			System.out.println(i);
		}
		System.out.println("for loop completed");
	}

}
