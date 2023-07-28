package variables;

public class localvariables {


	 public static void main(String [] args){
	     int i = 10;
	   System.out.println("i="+i);
	   localvariables.demo();
	   localvariables ref = new localvariables();   //object creation
	   ref.demo1();
	    }
	   
	public static void demo(){   //static regular method
	 int a = 50;   //non static local variables
	 int b = 50;
	 int add = a+b;
	 System.out.println(add);

	}

	  public void demo1(){  //non static regular method
	  int rollno = 15;    //local variable
	 System.out.println(rollno);
	}

}
