package constructor;

public class rule1 {
	//cannot create a constructor inside a method
	public static void main(String [] args) {
		System.out.println("Rule 1");
		
		/*public rule1() { 
			
		}*/
		rule1 ref = new rule1();
	}
	public rule1() {  //constructor
		System.out.println("hello");
	}

}
