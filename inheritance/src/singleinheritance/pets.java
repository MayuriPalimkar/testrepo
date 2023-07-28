package singleinheritance;

public class pets extends animals{
	
	public void rabbit() {
		System.out.println("rabbit eats carrot");
	}
	public void cat() {
		System.out.println("cat sleeps a lot");
		
	}
    public void dog() {
    	System.out.println("dog protects us");
    }
    
    public static void main(String [] args) {
    	pets p1 = new pets();    //run time /early bining
    	p1.rabbit();
    	p1.cat();
    	p1.dog();
    	System.out.println();
    	
    	
    	animals a1 = new animals();
    	a1.pets();
    	a1.cat();
    	a1.dog();
    	System.out.println();
    	
    	animals a2 = new pets();
    	a2.cat();
    	a2.dog();
    	a2.pets();
    }
}
