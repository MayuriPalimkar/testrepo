package methodspractice;

public class method3 { // class body
	public static void main(String[]args) {
		
		System.out.println("main method started");
		//direct calling from same class
		//syntax-->methodname();
		//staticmethod2();
		
		
		//calling from classname
		//syntax-->classname.methodname();
		method3.staticmethod2();
		
		
		System.out.println("main method ended");
		
	}
	public static void staticmethod2() {
		
		int a = 60;
		int b = 20;
		int c = a-b;
		
		System.out.println("subtraction of a and b-->"+c);
		
		System.out.println("static regular method calling from same class");
	}

}
