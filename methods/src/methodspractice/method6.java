package methodspractice;

public class method6 { //class body
	public static void main(String[]args) { //main method body
		
		System.out.println("main method started");
		//direct calling static regular method
		demo1();
		
		//calling by classname static regular method
		//syntax-->classname.methodname();
		//method6.demo1();
		
		
		System.out.println("main method ended");
	}

	public static void demo1() {
		int i  = 50;
		int j = 60;
		int k = i+j;
		
		System.out.println("addition of i and j ="+k);
	}
}
