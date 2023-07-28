package variables;

public class globalvariables2 {
	static int number = 400;
	static String name = "Rahul";
	public static void main(String [] args){
	  globalvariables2 ref = new globalvariables2();
	  ref.test();
	  ref.test1();
	 globalvariables2.test2();

	}

	 public void test(){
	System.out.println(number);
	System.out.println(name);
	 number = 500;
	 name = "Rohit";
	}
	  public void test1(){
	 System.out.println(number);
	System.out.println(name);
	}
	 public static void test2(){
	 number = 600;
	 name =" ketan"; 
	System.out.println(number);
	System.out.println(name);
	}

	
	
	
}

