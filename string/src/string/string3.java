package string;

public class string3 {
	public static void main(String [] args) {
		String s1 = new String("Java");  //heap   scp
		String s2 = new String ("java");//heap
		
		System.out.println(s1==s2);//ref comparison      false
		System.out.println(s1.equals(s2));//content comparison    true
		
		//by using literal
		
		String s3 = "Java";  //scp
		String s4 = "Java";
		
		System.out.println(s3==s4); //ref comparison add/location //true
		System.out.println(s3.equals(s4)); //content comparison true
		System.out.println(s2==s3);
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
		
		System.out.println(s1.charAt(3));
		String s5 = "Automation";
		System.out.println(s5.charAt(4));
		System.out.println(s5.length());
		System.out.println(s5.charAt(1));
	}

}
