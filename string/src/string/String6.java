package string;

public class String6 {

	public static void main(String [] args) {
		String str = "welcome to java and automation";
		String Rev = "";
		
		System.out.println(str.length());
		
		for (int i=str.length()-1; i>=0; i--) {
			Rev = Rev+str.charAt(i);
		}
		System.out.println(Rev);
	
		//String str1 = "welcome-to-java-and-automation";
		String str2[] = str.split(Rev);
		for (int i =0; i< str2.length; i++) {
			System.out.println(str2[i]);
		}
		
	}
	
}
