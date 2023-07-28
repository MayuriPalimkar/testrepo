package string;

public class string9 {

	public static void main(String [] args) {
		String str = "welcome to java and automation";
		
		System.out.println(str.length());
		
		String Rev = "";
		for (int i = str.length()-1; i>=0;i--) {
			Rev = Rev + str.charAt(i) ;
		}
		System.out.println(Rev);
		
		String Str2 = Rev;
		System.out.println(Str2.replaceAll(Str2,"automation and java to welcome"));
	}
}
