package typesofvariables;

public class nonstaticglobal {
	int age = 28;
	String name = "ketan";
	
	public static void main(String[]args) {
		
		//non static global variables declaration
		
		nonstaticglobal obj = new nonstaticglobal();
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		obj.demo();
	}
	public void demo() {
		int age1 = 50;
		name = "rahul";
		System.out.println(age1);
		System.out.println(name);
		
	}

}
