package Exception_handling;

public class Stack_overflow_error {

	public static void main(String[] args) {
		m1();
		System.out.println("program completed");

	}
	public static void m1() {
		m2();
	}
	public static void m2() {
		m3();
	}
	public static void m3() {
		int number =100;
		System.out.println(number);
	}

}
