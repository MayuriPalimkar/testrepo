package methodspractice;

public class method17 {
	public static void main(String[]args) {
		
		method17.demo(20, 200);
		method17 var = new method17();
		var.demo2(22, 44);
	}
	public static void demo(int a ,int b) {
		int c = a+ b;
		System.out.println(c);
		
	}
	public void demo2(int a , int b) {
		int c = a*b;
		System.out.println(c);
		
	}

}
