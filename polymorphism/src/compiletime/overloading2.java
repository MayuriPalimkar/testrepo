package compiletime;

public class overloading2 {
  public static void main(String [] args) {
	  overloading2 d = new overloading2();
	  d.dog();
	  d.dog(1);
	  d.dog(1, 2);
	  overloading2.dog("task");
	  
  }
  public void dog() {
	  System.out.println("dog plays");
	  
  }
  public void dog(int i) {
	  System.out.println("dog barks");
	  
  }
  public void dog (int i, int j) {
	  System.out.println("dog eats");
	  
  }
  public static void dog(String task) {
	  System.out.println("dog protects");
  }
}
