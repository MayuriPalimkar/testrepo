package typesofvariables;

public class svcallfromdiffclass {
	
	public static void main(String[]args) {
		
		//to call static variable from another class syntax-->
		// system.out.println(classname.variablename);
		
		System.out.println(callclass.age);
		System.out.println(callclass.name);
		
		System.out.println();
		
		nonstaticglobal ref = new nonstaticglobal();
		System.out.println(ref.age);
		System.out.println(ref.name);
		
		
		
		
		
	}

}
