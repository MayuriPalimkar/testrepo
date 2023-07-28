package methodsregular;

public class methodsr {
	public static void main (String [] args){   //main method
		  //starting point of main method
		    methodsr.demo();
		    methodsr.demo1("Rahul");
		    methodsr ref = new methodsr();
		    ref.demo2();
		    ref.demo3('B');



		     }
		   public static void demo(){   //static regular method
		    int i = 15;
		    int j =25;
		    int k = i+j;
		  System.out.println("addition is -->" + k);
		}

		  public static void demo1(String name){   //static regular method with one input parameter
		   name= "ketan";
		 System.out.println("name is -->" + name);
		}

		public void demo2(){     //non static regular method
		  int rollno = 15;
		  int marks = 95;
		System.out.println("Roll no and marks are-->" +rollno+" "+marks);
		}

		   public void demo3(char grade){   //non static regular method with one input parameter
		     grade = 'A';
		     System.out.println("grade-->"+grade);
		}

}
