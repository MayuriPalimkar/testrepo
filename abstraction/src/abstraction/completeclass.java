package abstraction;

public class completeclass {

	
	public void demo1() {
		System.out.println("test method1");
		
	}
	public void demo1(int i) {
		System.out.println("test method2");
	}
	public static void main(String [] args) {
		completeclass c1 = new completeclass();
		c1.demo1();
		c1.demo1(10);
	}
}
