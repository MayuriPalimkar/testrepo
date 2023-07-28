package controlstatement;

public class elseladder1 {
	public static void main(String[]args) {
		
		/*  if else-if ladder
		 * if(condition 1){
		 * statement 1   executed when condition 1 is true
		 * }
		 * else if(condition 2){
		 * statement2   executed when condion 2 is true
		 * }
		 * else if (condition 3){
		 * statement 3   executed when condition 3 is true
		 * }
		 * else{
		 * statement 4    executed when all conditions are false 
		 * }
		 * 
		 */
		
		int marks = 90;
		
		if (marks>=75) {
			System.out.println("Distinction");
		}
		else if (marks>=60) {
			System.out.println("first class");
		}
		else if (marks>=50) {
			System.out.println("higher second class");
		}
		else if (marks>=45) {
			System.out.println("second class");
		}
		else if (marks>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("failed");
			
		}
	}
	

}
