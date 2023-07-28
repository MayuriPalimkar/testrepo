package abstraction;

public abstract class abstractclassconstructor {
     
	public abstractclassconstructor() {
	    this(200, 100);
		System.out.println("abstract class constructor");
	}
	
	
	public abstractclassconstructor(int i) {
		System.out.println("one input parameter");
	}
	private abstractclassconstructor(int i, int j) {
		System.out.println("two input parameter");
	}
}
