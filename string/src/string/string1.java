package string;

public class string1 {
	public static void main(String [] args) {
		
		//string is nothing but a collection of characters
        //string by using string literal
		String str = "Automation";    //scp   string constant pool area
		String str1 = "Automation";     //scp
		
		//by using new keyword
		//syntax--> String rvn = new String(values);
		String s3 = new String("Java");    //heap
		String s4 = new String ("Java");   //heap
		String s5 = new String ("Automation");   //heap
		
		System.out.println(str == str1);    //true
		System.out.println(str1== s5);   //false
		System.out.println(s3 == s4);   //false
		
	}

}
