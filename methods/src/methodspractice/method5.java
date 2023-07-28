package methodspractice;

public class method5 {  //class body
	
	public static void main(String[]args) {
		System.out.println("main method started");
		//calling from different class
		
		//syntax--> classname.methodname();
		method4.Test1();
		method4.Test2();
		method5.staticmethod3();
		
		System.out.println("main method ended");
		
	}
	public static void staticmethod3() {
		System.out.println("static regular method calling from same class-->staticmethod3");
	}

}
