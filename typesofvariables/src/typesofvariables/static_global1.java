package typesofvariables;

public class static_global1 {
	int n = 300;
	
	
	public static void main(String[]args) {
		//non static global variable
		static_global1 obj = new static_global1();
	
		System.out.println(obj.n);
		static_global1.m1();
		obj.m2();
	}
	
	public static void m1() {
		int num = 100;
		int num2 = 200;
		System.out.println(num+ " "+num2);
		
	}
  public void m2() {
	  n = 400;
	  System.out.println(n);
	  
  }
}
