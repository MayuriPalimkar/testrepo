package controlstatement;

public class nestedif1 {
	public static void main(String [] args) {
	 String un = "abc";
	 String pwd = "12ab";
	 
	 if (un =="abc") {
		 if (pwd == "1ab") {
			 System.out.println("correct username and password");
			 System.out.println("login successful");
			 
		 }
	 }
	 else {
		 System.out.println("incorrect username or password");
		 System.out.println("log in failed");
	 }
}

}