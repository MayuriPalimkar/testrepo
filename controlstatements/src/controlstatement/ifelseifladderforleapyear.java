package controlstatement;

public class ifelseifladderforleapyear {
	public static void main(String[]args) {
		int year = 2004;
		if(year % 4 ==0) {
			System.out.println("Specified year is leap year");
			
		}
		else if(year % 400 == 0) {
			System.out.println("specified year is leap year");
			
		}
		else if (year % 100 == 100) {
			System.out.println("Specified year is a leap year");
			
		}
		else {
			System.out.println("Specified year is not a leap year");
		}
		
	}

}
