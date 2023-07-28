package thisandsuper;

public class superchild extends superparent {
	int number1 = 150;
	int number2 = 200;
	 // super keyword is used to access global variables from super class to the child class
	public void demo1() {
		int number1 = 250;
		 int number2 = 300;
		 
		 System.out.println(number1);  //250
		 System.out.println(number2);   //300
		 System.out.println();
		 
		 System.out.println(this.number1);  //150
		 System.out.println(this.number2);   //200
		 System.out.println();
		 
		 System.out.println(super.number1);  //50
		 System.out.println(super.number2);    //100
		 
	}
	public static void main(String [] args) {
		superchild c = new superchild();
		c.demo1();
		
		superparent p = new superparent();
		p.demo();
		
	}

}
