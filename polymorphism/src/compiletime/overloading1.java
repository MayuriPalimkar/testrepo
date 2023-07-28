package compiletime;

public class overloading1 {
 public static void main(String [] args) {
	 overloading1 m1 = new overloading1();
	 m1.demo();
	 m1.demo(1);
	 m1.demo(1, 2);
	overloading1.demo("viru");
 }
 public void demo() {
	 System.out.println("name-->Viransh");
	 
 }
 public void demo(int i) {
	 System.out.println("Surname--> Handre");
 }
 public void demo(int i, int j) {
	 System.out.println("Scchool name-->Scholar kids");
	 
 }
 public static void demo(String name) {
	 System.out.println("nickname--> viru");
 }
}
