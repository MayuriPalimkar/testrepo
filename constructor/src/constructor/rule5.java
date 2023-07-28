package constructor;

public class rule5 {
	//any number of constructor can be declared in java class , construcor name should be same as classname
	//but arguments/ parameters should be different.
  public static void main(String [] args) {
	  rule5 ref = new rule5();
	  rule5 ref1 = new rule5(1);
	  rule5 ref2 = new rule5(1, 2);
	  rule5 ref3 = new rule5(1,2,3);
	  
	  
  }
  
  public rule5() {
	  System.out.println("zero input argument constructor");
  }
  public rule5(int i) {
	  System.out.println("one input argument constructor");
  }
  public rule5(int i, int j) {
	  System.out.println("two input argument constructor");
  }
  public rule5(int i , int j , int k ) {
	  System.out.println("Three input argument construcotr");
  }
}
