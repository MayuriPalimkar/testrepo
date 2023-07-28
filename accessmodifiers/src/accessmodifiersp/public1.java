package accessmodifiersp;

public class public1 {
 public int i =100;
   public static void main(String[] args) {
	public1 p1 = new public1();
	p1.demo();
	p1.demo2();
	System.out.println(p1.i);
	   
}
   public void demo() {
	    int j = 50;
	    System.out.println(j);
	    String name = " viru";
	    System.out.println(name);
	    
   }
   public void demo2() {
	   System.out.println("public method");
   }
}
