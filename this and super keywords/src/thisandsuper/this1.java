package thisandsuper;

public class this1 {
    int Number = 100;
    int num = 200;
    String name = "Automation";
    
    //this keyword is used to access global variables from the same class
    public void demo() {
    	int Number = 300;
    	int num = 400;
    	System.out.println(Number);
    	System.out.println(num);
    	System.out.println(name);
    	System.out.println();
    	
    	System.out.println(this.Number);
    	System.out.println(this.num);
    }
    
    public static void main(String [] args) {
    	this1 t = new this1();
    	t.demo();
    }
   
}
