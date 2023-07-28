package controlstatement;

public class leapyear2 {
	public static void main(String[]args) {
		int year= 1955;
		
		if (year%4==0) {
			System.out.println("leap year");
			
		}
		else if (year%100!=0) {
			System.out.println(" leap year");
		}
		else if (year%400==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
