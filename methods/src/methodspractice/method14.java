package methodspractice;

public class method14 {
  public static void main(String[]args) {
	  //static regular with parameters
	  System.out.println("main method started");
	  method14.addition(58,42, 60);
	  method14.addition(85, 45, 63);
	  method14.substraction(89, 9, 23);
	  method14.substraction(200, 100, 50);
	  method14.sum(85, 8, 542);
	  
	  
	  System.out.println("main method ended");
	 
	  
  }
  public static void addition(int a, int b, int c) {
	  int d = a+b+c;
	  System.out.println("addition of a+b+c-->"+d);
	  
  }
  public static void substraction(int a,int b, int c) {
	  int d = a-b-c;
	  System.out.println("substraction of a-b-c-->"+d);
  }
  public static void sum(int a, int b, int c) {
	  int d = a*b+c;
	  System.out.println("output of equation a*b+c-->"+d);
  }
}
