package runtime;

public class test {
  public static void main(String[] args) {
	
	  father f1 = new father();
	  f1.car();
	  f1.home();
	  f1.money();
	  System.out.println();
	  
	  child c1 = new child();
	  c1.bike();
	  c1.car();
	  c1.home();
	  c1.money();
	  System.out.println();
	  
	 father f2 = new child();
	  f2.car();
	  f2.home();
	  f2.money();
	  
	  
	  
}
}
