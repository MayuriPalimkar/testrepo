package abstraction;

public class testanimals {
 
	public static void main(String [] args) {
		pets p1 = new pets();
		p1.dog();
		p1.cat();
		p1.rabbit();
		p1.pets();
		p1.pets1();
		System.out.println();
		
		animals a1 = new pets();
		a1.cat();
		a1.dog();
		a1.pets();
		a1.rabbit();
	}
}
