package singleinheritance;

public class test {
public static void main(String[] args) {
	father f = new father();
	f.car();
	f.home();
	f.money();
	
	
	son s = new son ();
	s.bike();
	s.car();
	s.home();
	s.money();
}
}
