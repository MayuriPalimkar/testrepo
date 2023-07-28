package controlstatement;

public class nestedif {
	//nested if syntax
	//if(codition1)
	//  if(condition2){
	 //     statement1
//       }
	//else{
	// statement2
	//}
	public static void main(String[]args) {
		
	int a=100;
	int b=200;
	int c=400;
	
	if(a>b) {
		if (a>c) {
			System.out.println("A is the greatest number");
		}
		}
	if(b>c) {
		System.out.println("b is the greatest number");
	}
	else {
		System.out.println("c is the greatedt number");
	}
}
}