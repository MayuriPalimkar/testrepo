package typesofvariables;

public class globalvariable2 {
	static int number;
	static String name;
	
	public static void main(String[]args){
		number = 173;
		name = "vijay";
		System.out.println(number);
		System.out.println(name);
		System.out.println();
		
		globalvariable2.demo1();
		
		globalvariable2 sv = new globalvariable2();
		sv.demo2();
		sv.demo3();
		
	}
	public static void demo1 () {
		number = 153;
		name = "mayuri";
		System.out.println(number);
		System.out.println(name);
		System.out.println();
		
	}
	public void demo2() {
		number = 2011;
		name = "viransh";
		System.out.println(number);
		System.out.println(name);
		System.out.println();
	}
	public void demo3() {
		number = 122;
		name = "mahesh";
		System.out.println(number);
		System.out.println(name);
		System.out.println("program completed");
	}

}

