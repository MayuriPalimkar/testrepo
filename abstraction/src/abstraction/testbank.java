package abstraction;

public class testbank {
  
	public static void main(String [] args) {
		HDFCbank hb = new HDFCbank();
		hb.creditcard();
		hb.debitcard();
		hb.funds();
		System.out.println();
		
		rbi rb = new HDFCbank();
		rb.creditcard();
		rb.debitcard();
		rb.loan();
	}
}
