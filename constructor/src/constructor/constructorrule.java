package constructor;

public class constructorrule {
	
	public static void main(String [] args) {
		//constructorrule b1 = new constructorrule();
		constructorrule b2 = new constructorrule(4);
		constructorrule b3 = new constructorrule(4,2);
		
		b2.rule();
		
	}
	
	public void rule() {
		int i =10;
		int j = 20;
		int add = i+j;
		System.out.println(add);
		
	}
	public  constructorrule(int i) {
		System.out.println(i);
	}
	public constructorrule(int i, int j ) {
		int k = i*j;
		
		System.out.println(k);
	}
	
	
	
}
