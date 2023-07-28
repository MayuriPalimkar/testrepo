package runtime;

public class testbhk {
  public static void main(String [] args) {
	  bhk1 b1 = new bhk1();
	  b1.test();
	  b1.test(1);
	  b1.test(1, 2);
	  b1.furnished();
	  System.out.println();
	  
	  bhk2 b2 = new bhk2();
	  b2.test();
	  b2.test(1);
	  b2.test(1, 2);
	  b2.furnished();
	  b2.extra();
	  System.out.println();
	  
	 bhk1 b3=new bhk2();
	 b3.furnished();
	 b3.test();
  }
}
