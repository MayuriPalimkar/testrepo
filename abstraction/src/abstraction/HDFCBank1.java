package abstraction;

public class HDFCBank1 extends RBIbank {

	public void funds() {
		System.out.println("HDFC--funds");
	}
	public void debitcard() {
		System.out.println("HDFC--debitcard");
	}
	public void creditcard() {
		System.out.println("HDFCbank--creditcard");
	}
	
	public static void main(String [] args) {
		HDFCBank1 hb = new HDFCBank1();
		hb.funds();
		hb.loan();
		hb.debitcard();
		hb.creditcard();
		System.out.println();
		
	RBIbank rb= new HDFCBank1();
	rb.loan();
	rb.debitcard();
	rb.creditcard();
	
	
		
	}
}
