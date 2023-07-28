package string;

public class string2 {
	public static void main (String [] args) {
		//by using new keyword
		//syntax--> String srvn = new String ("values");
		
		String s1 = new String ("test");   //heap   + refin scp 
		String s2 = new String ("Test");  //heap      + ref in scp
		String s3 = new String ("Test");    //heap    "
		
		//by using literal
		
		String s4 = "Test";  //scp
		String s5 = "Test";
		String s6 = "Java";   //scp
		String s8 = "Test";
		String s7 = new String ("Java");   //heap + ref in scp
		String s9 = "Java";
		System.out.println(s1==s2);  //false
		System.out.println(s2 == s3);  //false
		System.out.println(s3 == s4);  //false
		System.out.println(s4 == s5);  //true
		System.out.println(s6 == s7); //false
		System.out.println(s5 == s8); //true
		System.out.println(s7 == s9);  //false
		System.out.println(s7 == s7);  //true
	
	}
}
