package array;

public class array6 {

	public static void main(String [] args) {
		
		Object obj[] = new Object[5];  // to print the non similar / heterogeneous data
		
		obj[0] = 10;
		obj[1] = 'A';
		obj[2] = 54.5d;
		obj[3] = "viransh";
		obj[4] = true;
		
		System.out.println(obj.length);
		System.out.println();
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}
