package Exception_handling;

public class exception_handling3 {

	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		String str = null;
		
		try {
			System.out.println(str.length());
		}
		catch(ArithmeticException e){
			System.out.println("hello");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NullPointerException n) {
			System.out.println(n.getMessage());
			n.printStackTrace();
		}
		finally {
			System.out.println("This is finally block");
		}

	}

}
