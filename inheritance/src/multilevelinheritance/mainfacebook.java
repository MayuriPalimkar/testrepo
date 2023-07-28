package multilevelinheritance;

public class mainfacebook {
        
	public static void main(String [] args) {
		facebook1 f1 = new facebook1();
		f1.version1();
		System.out.println();
		
		facebook2 f2 = new facebook2();
		f2.version1();
		f2.version2();
		System.out.println();
		
		facebook3 f3 = new facebook3();
		f3.version1();
		f3.version2();
		f3.version3();
		System.out.println();
		
		facebook4 f4 = new facebook4();
		f4.version1();
		f4.version2();
		f4.version3();
		f4.version4();
		
		
		
		
		
	}
}
