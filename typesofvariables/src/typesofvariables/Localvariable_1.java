package typesofvariables;

public class Localvariable_1 {
	public static void main(String[]args) {
		//all local variables are  non static
		// local variables are always declared inside the body of the method
		//to declare local variables we need to call the method call in main method
		//syntax--> classname.methodname();
		
		Localvariable_1.m1();
		Localvariable_1.m2();
		// to call non static method we need to create an object
		//object creation--> classname variablename= new classname;
		//                    variablename.methodname();
		Localvariable_1 obj = new Localvariable_1();
		obj.m3();
		
		
	}
	public static void m1() {
    	int a= 86;
		int b= 96;
		int c= a*b;
		System.out.println("multiplication of a and b is- "+c);
		
	}
	 public static void m2() {
		 String name = "Viransh";
		 System.out.println(name);
	 }
	 public void m3() {
		 String surname = "Handre";
		 System.out.println(surname);
		 
		
	 }

}
