package constructor1;

public class rule {
  public static void main(String [] args) {
	    
	  rule r = new rule();
	  rule r1 = new rule(1);
	  rule r2 = new rule("viru",15);
	  
  }
  
  public rule() {
	  System.out.println("zero i/p para");
  }
  public rule(int i) {
	  System.out.println("1 i/p para");
  }
  public rule(String name , int a ) {
	  System.out.println("two i/p para");
	  
  }
}
