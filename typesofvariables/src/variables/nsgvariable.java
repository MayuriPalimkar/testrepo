package variables;

public class nsgvariable {
	int age = 50;
	   String name = " ketan";
	 public static void main(String [] args){
	  nsgvariable ref = new nsgvariable();

	  System.out.println(ref.age);
	  System.out.println(ref.name);
	 ref.demo();

	}
	  public void demo (){
	  age = 60;
	  name = " rahul";
	System.out.println(age);
	System.out.println(name);
	}

}
