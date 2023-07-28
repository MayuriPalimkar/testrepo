package constructor;

public class rule3 {
    public static void main (String [] args) {
    	System.out.println("return type concept is not applicable to constructor even void also");
    	rule3 ref = new rule3();
    }
  /*  public void rule3() {
    	                             not allowed
    }*/
    public rule3() {                      //constructor
    	System.out.println("Rule 3");
    }
}
