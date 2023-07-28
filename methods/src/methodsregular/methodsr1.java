package methodsregular;

public class methodsr1 {
	public static void main(String [] args){
		  //starting point of the program
		    

		 methodsr1.demo();    //static regular method calling
		 methodsr1 ref = new methodsr1();   //object creation
		 ref.demo1();    //non static regular method calling


		}

		  public static void demo(){   //static regular method
		  int i = 52;
		  int j = 65;
		 int k = i*j;
		  System.out.println(k);
		}

		  public void demo1(){    //non static regular method
		  String name = "Viransh";
		   int marks = 97;
		 System.out.println(name+" got "+marks+" marks");
		}
	
	
}
