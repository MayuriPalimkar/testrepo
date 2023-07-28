package inheritance;

public class hierarchical {

	public static void main(String [] args) {
		hfather f1 = new hfather();
		f1.car();
		f1.home();
		f1.money();
		System.out.println();
		
		son1 s1 = new son1();
		s1.car();
		s1.home();
		s1.money();
		s1.bike();
		System.out.println();
		
		son2 s2 = new son2();
		s2.car();
		s2.home();
		s2.money();
		s2.laptop();
		System.out.println();
		
		son3 s3 = new son3();
		s3.car();
		s3.home();
		s3.money();
		s3.mobile();
		
		
	}
}
