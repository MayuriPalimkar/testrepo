package string;

public class string7 {
	public static void main(String [] args) {
		String str = "Welcome to java and automation";
		System.out.println(str.length());
		String Rev = "";
		for (int i = str.length()-1; i>=0;i--) {
			Rev = Rev + str.charAt(i);
		}
		System.out.println(Rev);
		
		
		
		String str2[] = str.split(Rev);
		for (int j = 0; j< str2.length; j++) {
			System.out.println(str2[j]);
		}
		
	}

}
