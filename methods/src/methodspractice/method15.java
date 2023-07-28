package methodspractice;

public class method15 {
	//static regular method with parameter
	public static void main(String[]args) {
		System.out.println("main method started");
		method15.demo("Rahul","   Patil");
		method15.demo("viransh",  "Handre");
		
		method15.demo1(15,    'A');
		method15.demo1(16,   'C');
		System.out.println("main method ended");
	}
	public static void demo(String firstname, String lastname) {
		System.out.println("firstname is -->"+ firstname  + " " +"Lastname is -->"+lastname);
		
		
		
	}
	public static void demo1(int Rollno , char grade) {
		System.out.println("Roll no-->"+ Rollno+ " " +"grade-->"+ grade);
	}

}
