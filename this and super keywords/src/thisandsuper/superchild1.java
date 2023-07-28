package thisandsuper;

public class superchild1 extends superparet1 {
 int number1 = 150;
 int number2 = 250;
   public void demo() {
	   int number1 = 1;
	   int number2 = 2;
	    System.out.println(number1);
	    System.out.println(number2);
	    
	    System.out.println();
	    System.out.println(this.number1);
	    System.out.println(this.number2);
	    
	    System.out.println();
	    System.out.println(super.number1);
	    System.out.println(super.number2);
	    
   }
   public static void main(String [] args) {
	   superchild1 c1 = new superchild1();
	   c1.demo();
	   
   }
}
