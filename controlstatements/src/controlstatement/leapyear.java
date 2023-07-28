package controlstatement;

public class leapyear {
	public static void main(String[]args) {
		int year = 2000;
		if ((year% 4== 0)  && (year%100!=0) || (year%400 == 0)) {
			System.out.println("specified year is leap year"+year);
		}
		else {
			System.out.println("specified year is not a leap year"+ " "+year);
		}
	}

}
