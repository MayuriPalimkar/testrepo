package methodspractice;

public class method2 { //class body
  public static void main(String[]args) {
	  //main method body
	  System.out.println("main method started");
	  //static method direct calling from same class
	  staticmethod1();
	  
	  //calling by class name
	  method2.staticmethod1();
	  
	  
	  
	  
	  System.out.println("main method ended");
	  
	  
  }
  public static void staticmethod1() {
	  int i = 30;
	  int j =50;
	  int k = i + j;
	  
	  System.out.println("addition of i + j ="+k);
	  
	  System.out.println("static regular method calling from same class");
  }
}
