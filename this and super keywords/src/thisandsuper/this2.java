package thisandsuper;

public class this2 {
   int number1 = 100;
   int number2 = 200;
   int add = number1 + number2;
   
   public void demo1() {
	   int number1 = 300;
	   int number2 = 400;
	   int add = number1 + number2;
	   
	   System.out.println(add);
	   System.out.println(this.add);
	    System.out.println();
	    
	    System.out.println(this.number1);
	    System.out.println(this.number2);
   }
   public static void main (String [] args) {
	   this2 t2 = new this2();
	   t2.demo1();
   }
}
