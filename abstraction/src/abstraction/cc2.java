package abstraction;

public class cc2 extends ic2 {

	public void demo11() {
		System.out.println("Complete methods");
		
	}
	public void demo2() {   //abstract class method complete
		System.out.println("ic2 method declaration1");
	}
	public void demo3() {
		System.out.println("ic2 method declaration2");
		
	}
	
	public static void main(String [] args) {
		
		cc2 c = new cc2();  //object creation for cc2 class
		c.demo11();  //Complete methods
		c.demo2();   //ic2 method declaration1"
		c.demo3();    //ic2 method declaration2"
		System.out.println();
		
		//as we cannot instantiate abstract class we need to use dynamic poly to call methods of abstract class
		
		ic2 i2 = new cc2();
		i2.demo1();  //incompleteclass
		i2.demo2();   //ic2 method declaration1"
		i2.demo3();   //ic2 method declaration2
	}
	
	
}
