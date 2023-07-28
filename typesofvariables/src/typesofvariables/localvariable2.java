package typesofvariables;

public class localvariable2 {  // class body
	public static void main(String[]args) {  //main method body
		// non static local variables
		//calling static regular method 
		//direct calling--> methodname();
		n1();
		//calling by classname-->classname.methodname();
		localvariable2.n1();
		//calling non static regular method--> classname variablename = new classname();
		//                                        variablename.methodname();
		localvariable2 demo = new localvariable2();
		demo.n2();
		
	}
	public static void n1() {  //static regular method body
		int num1 = 852741;  //non static regular method
		int num2 = 963123;
		int addition = num1 + num2;
		System.out.println(addition);  //printing statement
		//static int num3 = 451;   we cannot declare static variables inside the method body
	}
	public void n2() {  // non static regular method
		int num1 = 89646;
		int num2 = 22;
		int modulo = num1 % num2;
		System.out.println(modulo);
	}

}
