package runtime;

public class test1 {
	//method overriding- method present in parent class and child class having same name and same number of input parameters
	
	
	public static void main(String[] args) {
		
	 car c1 = new car();  //parent class
	 c1.start();
	 c1.stop();
	 c1.refuel();
	 c1.brakes();
	 System.out.println();
	 
	 maruti m1 = new maruti();    //child class objet   static poly+ run time poly 
	 m1.start();
	 m1.stop();                     //child class overiding parent class
	 m1.brakes();
	 m1.refuel();                      //
	 m1.theftydafty();
	 System.out.println();
	 
	     car c2=new maruti();  //dynamic poly + runtime poly  + top casting
	     c2.brakes();
	     c2.start();   //maruti start
	     c2.stop();    //maruti stop
	}

}
