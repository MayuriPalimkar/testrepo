package Exception_handling;

public class Throw_keyword {

	public static void main(String[] args) {
		System.out.println("hello");
		
		try {
			throw new Exception ("Automation testing");
		}
		catch ( Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hi");

	}

}
