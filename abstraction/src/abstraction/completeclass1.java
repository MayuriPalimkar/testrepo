package abstraction;

public class completeclass1 extends incompleteclass1 {
    
	public void demo() {
		System.out.println("completeclass");
	}
	public void demo2() {
		System.out.println("i c method declaration1");
	}
	public void demo3() {
		System.out.println("i c method declaration2");
	}
	public static void main(String [] args) {
		completeclass1 cc = new completeclass1();
		cc.demo();
		cc.demo1();
		cc.demo2();
		cc.demo3();
		System.out.println();
		
	//	incompleteclass1 i1 = new incompleteclass1();
		//we cannot instantiate abstract class
		//we need to use dynamic poly to call methods from abstract class
             incompleteclass1 i1=new completeclass1();
             i1.demo1();
             i1.demo2();
             i1.demo3();
		
	}
}
