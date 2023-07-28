package Exception_handling;

public class Exception_handling2 {

	public static void main(String[] args) {
		int number = 100;
		
		try {
			System.out.println(number/100);
			
		}
		catch (ArithmeticException e){
			System.out.println("hello");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//finally block is used to excute the code whether the exception is handled or not
		finally {
			System.out.println("This is finally block");
		}

	}

}
