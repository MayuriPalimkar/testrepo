package runtime;

public class son1 extends father1 {
  
	public void bike() {
		System.out.println("bike--> re");
		
	}
	@override
	public void car() {
		System.out.println("car--bmw");
	}
	
	public static void main(String [] args) {
		son1 s1 = new son1();
		s1.bike();
		s1.car();
		s1.home();                 //static poly
		s1.money();
		System.out.println();
		
		father1 f1 = new father1();
		f1.car();                       //static poly
		f1.home();
		f1.money();
		System.out.println();
		
		father1 f2 = new son1();
		f2.car();    //bmw
		f2.home();
		f2.money();
		
	}
}

