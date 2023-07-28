package methodspractice;

public class method8 {
   public static void main(String []args) {
	   
	   //non static regular method calling from same class
	   
	   System.out.println("main method started");
	   /*direct calling method
	    * syntax-->methodname();
	    * demo1();
	    * demo2();
	    * demo3();
	    * 
	    * calling by class name
	     syntax--> classname.methodname();
	    method8.demo1();
	     method8.demo2();
	     method8.demo3();
	  */
	   
	   /*object creation
	    * syntax-->classname variablename = new classname();
	    */
	   method8 obj = new method8();
	   //non static regular method calling 
	   //syntax--> variablename.methodname();
	   obj.demo1();
	   obj.demo2();
	   obj.demo3();
	   
	   
	   
	   
	   System.out.println("main method ended");
	   
   }
   public void demo1() {
	   System.out.println("non static regular method calling from same class-->demo1");
	   
	   
   }
   public void demo2() {
	   System.out.println("non static regular method calling from same class-->demo2");
   }
   public void demo3() {
	   System.out.println("hello");
   }
}
