package methodspractice;

public class method13 {
 public static void main(String[]args) {
	 
	 // non static and static regular method without parameter
	 System.out.println("main method started");
	 //direct calling 
	 method13.demo();
	 
	 method13 obj = new method13();/*object creation 
	                                    classname variable name = new classname();
	                                    variablename.methodname();
	                                    */
	 obj.demo2();
	 
	 
	 System.out.println("main method ended");
	 
 }
 public static void demo() {
	 int i =58;
	 int j = 69;
	 int k = i*j;
	 System.out.println("multiplication of i and j i -->"+k);
	 
 }
 public void demo2() {
	 int i = 500;
	 int j = 25;
	 int k = i/j;
	 System.out.println("i divided by j is -->"+k);
	 
	 
 }
}
