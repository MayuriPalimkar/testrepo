package star_pattern;

public class right_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("printing left triangle");
		
		for(int i =0; i<=5; i++) {
			for(int j =0; j<=5; j++) {
				if(j>=6-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}	
			System.out.println();
		}
		
	}

	}


