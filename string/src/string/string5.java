package string;

public class string5 {
	public static void main(String [] args) {
		//1.charAt methods - it returns particular / specified values
		
		String s1 = "velocity";
	System.out.println("Index-->"+ s1.charAt(5));
	System.out.println("Index-->"+ s1.charAt(7));
	//System.out.println("Index-->"+s1.charAt(10));  StringindexOutOfBoundException
	//System.out.println("Index-->"+s1.charAt(-1));  negativeindexexception
	
	//2.length(); it returns the length /size
	System.out.println(s1.length());
	
//	3. .equals it checks the equality of string with given object
	
	String s2 = "velocity";
	String s3 = "velocity";
	String s4 = new String ("velocity");
	
	System.out.println(s2.equals(s4));  //true
	System.out.println(s2.equals(s3));  //true
	System.out.println(s3.equals(s4));  //true
	
	//4. isempty- te check whether the string is empty or not
	
	String s5 = "Automation";
	System.out.println(s5.isEmpty());
	String s6 = "";
	System.out.println(s6.isEmpty());
	
	//5. Replace
	String s7 = "Automation";
	System.out.println( s7.replace('A','z'));
	System.out.println(s7.replace('t', 'p'));
	System.out.println(s7.replace('n', 'm'));
	
	//6.replaceAll
	
	String s8 = "Java Python Cpp classes";
	System.out.println(s8.replaceAll("Java Python", "Ruby"));
	System.out.println(s8.replaceAll("Cpp", "Ruby"));
	
	//7.Substring- it returns substring for given string
   // strating index is include and ending index is excluded
	
	String s9 = "velocity classes";
	      //     0123456789
	System.out.println(s9.substring(4,8));
	System.out.println(s9.substring(9, 12));
	System.out.println(s9.substring(9, 16));
	
	//8.indexof
	String s10 = "automation";
	System.out.println("Index-->"+s10.indexOf('m'));
	System.out.println("Index of t-->"+ s10.indexOf('t', s10.indexOf ('t')+1 ));
	System.out.println("Index of A-->"+ s10.indexOf('A'));
	System.out.println("Index of -->"+ s10.indexOf('a')+ s10.indexOf('a')+1);
	
	
	//9.lastindexof
	String s11 = "python";
	System.out.println(s11.lastIndexOf('n'));
	System.out.println(s11.lastIndexOf('o'));
	
	//10.tolowercase
	String s12 = "WELCOME";
	System.out.println(s12.toLowerCase());
	
	//11.touppercase
	String s13 = "welcome";
	System.out.println(s13.toUpperCase());
	
	
	//12.trim - it removes beginning and ending space of the string
	
	String s14 = "  python  ";
	System.out.println(s14.trim());
	
	String s15 = " Ruby ";
	System.out.println(s15.trim());
	
	
	//13.split
	String s16 = "hello/world/test/java";
	String s17[] = s16.split("/");
	for(int i =0; i<s17.length; i++) {
		System.out.print(s17[i]);
	}
	System.out.println();
	String date = "07-05-2023";
	String date1[]= date.split("-");
	for (int j =0; j< date1.length; j++) {
		System.out.print(date1[j]);
	}
	System.out.println();
	
	String s18 = "velocity";
	System.out.println(s18.toUpperCase());
    String s19 = s18.toUpperCase();
	System.out.println(s19);
	System.out.println(s19.substring(4));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
