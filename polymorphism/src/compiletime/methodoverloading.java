package compiletime;

public class methodoverloading {

	public static void main (String [] args) {
		methodoverloading m1 = new methodoverloading();
		m1.demo();
		m1.demo(10);
		m1.demo(10, 20);
		m1.demo(10, 20, 30);
		m1.demo("viru");
		
	}
	public void demo() {
		System.out.println("no input argument method");
		
	}
	public void demo(int i) {
		System.out.println("one i/p para method");
	}
	public void demo(int i, int j) {
		System.out.println("two i/p para method");
	}
	public void demo(int i, int j, int k) {
		System.out.println("three i/p para method");
	}
	public void demo(String name) {
		System.out.println("String i/p para method");
	}
}
