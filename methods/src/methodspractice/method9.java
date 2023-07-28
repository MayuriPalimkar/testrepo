
 package methodspractice;

public class method9 { //class body
	
	public static void main(String []args) {
		System.out.println("main method started");
		//non static regular method callong from same class
		
		/*object creation for non static regular method
		 * syntax--> classname variablename = new classname();
		 *  syntax for calling non static regular method
		 *  variablename.classname();
		 * 
		 */
		method9 obj1 = new method9(); //object creation for non static regular method
		
		obj1.demo4(); //variable usages
		obj1.demo5();
		
		System.out.println("main method ended");
	}
   public void demo4() {
	   System.out.println("non static regular method calling from same class");
   }
  public void demo5() {
	  System.out.println("hello Mayuri");
  }
}
