package variables;

public class globalvariables {
	
	 static int number =400;   //static global variables

	 public static void main (String [] args){   //main method
	   globalvariables ref = new globalvariables();  //object creation
	    ref.demo();
	    ref.demo1();
	  globalvariables.demo2();  //static regular method calling


	}
	public void demo(){    //non static regular method
	 System.out.println(number);
	  number = 500;  
	 System.out.println(number);
	}

	public void demo1(){
	 number = 600;
	System.out.println(number);
	}

	public static void demo2(){
	 number =700;
	System.out.println(number);
	}



}
