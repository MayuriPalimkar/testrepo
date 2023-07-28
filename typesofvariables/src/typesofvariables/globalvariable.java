package typesofvariables;

public class globalvariable {
	//static global variables
	static int number = 300;  //static global variable
	//variables which are declared outside the body of method are called as global variables
	
	public static void main(String[]args) {
		System.out.println(number);
	globalvariable.m1();
	globalvariable obj = new globalvariable();
	obj.m2();
	
		
	}
	public static void m1() {
		System.out.println(number); //300
		  number = 400;
		  System.out.println(number);  //400
		  
		
		}
	public void m2() {
		number = 500;
		System.out.println(number);//500
		
		
	}

}
