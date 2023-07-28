package compiletime;

public class moverloading {
//method with same name but diff input para or argument and diff datatype within the same class is called as method overloading
	
	public static void main(String[] args) {
		moverloading m1 = new moverloading();
		m1.demo();
		m1.demo(1);
		m1.demo(1, 2);
		m1.demo("viru");
		moverloading.demo(1, "viru", 'A');
	}
	public void demo() {
		System.out.println("zero input para/no input argument");
		
	}
	public void demo(int i) {
		System.out.println("one input parameter");
		
	}
	public void demo(int i, int j) {
		System.out.println("two input parameter");
		
	}
	public void demo(String name) {
		System.out.println("different input argument");
	}
	public static void demo(int i, String name, char A) {
		System.out.println("three input parameter");
		
	}
}
