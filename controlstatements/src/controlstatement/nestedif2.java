package controlstatement;

public class nestedif2 {
	public static void main(String[]args) {
		//blood donation
		int age = 20;
		int weight = 85;
		
		if (age>=18) {
			if (weight>=50) { 
				System.out.println("you are eligible for blood donation");
				
			}
		}
		else if (age<=50) {
			System.out.println("you are not eligible for blood donation");
		}
		else {
			System.out.println("age must be greater than 18");
		}
}
}