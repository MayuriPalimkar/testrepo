package compiletime;

public class overloading3 {

	
	public static void main(String [] args) {
		
		overloading3 ol = new overloading3();
		ol.demo();
		ol.demo(2);
		ol.demo(1, 2);
		ol.demo("add");
		
	}
	
	public void demo() {
		System.out.println("adition");
	}
	
	public void demo(int i) {
		System.out.println(i);
	}
	
	public void demo(int i, int j) {
		int k = i+j;
		System.out.println(k);
		
	}
	public void demo(String name) {
		System.out.println(name);
	}
}
