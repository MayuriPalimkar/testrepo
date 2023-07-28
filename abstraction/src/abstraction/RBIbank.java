package abstraction;

public abstract class RBIbank {
  
	public void loan() {
		System.out.println("loan");
	}
	public abstract void debitcard();
	
	public abstract void creditcard();
}
