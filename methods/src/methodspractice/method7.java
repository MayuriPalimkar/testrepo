package methodspractice;

public class method7 {
	public static void main(String[]args) {
		System.out.println("main method started");
		
		//calling static regular method from different class
		//syntax-->classname.methodname();
		method6.demo1();
		System.out.println("main method ended");
	}
  
}
