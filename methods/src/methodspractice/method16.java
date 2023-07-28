package methodspractice;

public class method16 {
	public static void main(String[]args) {
		//static and non static regular methods call from same clASS
		//calling static regular method from same class
		//syntax--> classname.methodname
		method16.demo();
		
		//calling non static regular method from same class
		//Syntax for object creation--> classname variablename = new classname
		// variablename.methodname();
		method16 objt = new method16();
		objt.demo2();
		objt.demo3(10, 20);
		
		
	}
	public static void demo() {
		int a=10;
		int b= 20;
		int c= a+b;
		
		System.out.println(c);
	}
	public void demo2() {
		int a =50;
		int b= 60;
		int c= a*b;
		
		System.out.println(c);
	}
	public  void demo3(int a, int b) {
		int c;
		a=10;
		b=20;
		c=b%a;
		System.out.println(c);
		
		a=10;
		b=20;
		c=a/b;
		System.out.println(c);
		
	}

}
