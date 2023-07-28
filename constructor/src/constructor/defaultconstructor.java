package constructor;

public class defaultconstructor {
	/*public defaultconstructor(){
	  super();
    }  
*/
	/* rules--
	 * 1. It is always no argument or zero parameter constructor
	 * 2. Access modifiers of default constructor is always same as class modifiers
	 * 3. Default constructor contains only one line i.e. super() class/keyword
	 */
	
	/*default constructor is used to provide default values to the 
	   object ex.- null , false
	*/
	public static void main(String [] args) {
		defaultconstructor d1 = new defaultconstructor();
		defaultconstructor d2 = new defaultconstructor();
		 
		d1.m1();
		d2. m2(20, 20);
	}
	public void m1() {
		System.out.println("default constructor");
	}
	public void m2(int i, int j) {
		 int add = i+j;
		System.out.println("add = " +add);
		
	}

}
