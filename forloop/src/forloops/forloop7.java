package forloops;

public class forloop7 {
//WAP for leap year
	//condition for leap year 
	//year should be divisible by 4 and 400 and not by 100
	
	public static void main(String[]args) {
		
	int year = 2004;
	if (year%4==0) {
		if (year%400==0) {
			System.out.println("year is leap year");
		}
	}
		else if(year%100!=0) {
			System.out.println("year is not leap year");
		}
		else {
		
	System.out.println("program completed");
	}
}
}
