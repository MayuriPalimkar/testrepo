package controlstatement;

public class ifelseleapyear {
  public static void main(String[]args) {
	  int year = 2005;
	  
	  if(year % 4==0 || year % 400 == 0 && year % 100 != 0) {
		  System.out.println("specified year is leap year");
		  
	  }
	  else {
		  System.out.println("year is not a leap year");
	  }
  }
}
