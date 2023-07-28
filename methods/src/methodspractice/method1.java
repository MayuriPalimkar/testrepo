package methodspractice;

public class method1 {
	public static void main(String[]args) { //main method body 
		
		//static regular method calling from same class
		//starting point of the program
		
		System.out.println("main method started");
		//direct calling static method from same class 
		//syntax--> methodname();
		demo1();
		demo2();
		
		//calling by classname 
		//syntax--> classname.methodname();
		
		method1.demo1();
		
		
		
		
		//calling by class name from same class
		//syntax-->classname.mehodname();
		method1.demo2();
		
		
		System.out.println("main method ended/completed");
		
	}
   public static void demo1() {
	   System.out.println("static regular method calling from same class--> demo1");
	   
   }
   public static void demo2(){
	   System.out.println("static regular method calling from same class--> demo2");
	   
   }
}
