package methodspractice;

public class method10 {
	public static void main(String[]args) {
		System.out.println("main method started");
		//object creation
		//syntax--> classname variablename = new classname();
		method10 test= new method10();
		
		//variablename.methodname();
		test.demo5();
		demo6();
		System.out.println("main method ended");
	}
  public void demo5() {
	  System.out.println("non static regular method calling from same class ");
	  
  }
  public static void demo6() {
	  System.out.println("static regular method calling from same class");
  }
  
}
