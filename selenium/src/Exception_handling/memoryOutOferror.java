package Exception_handling;

import java.util.ArrayList;

public class memoryOutOferror {

	public static void main(String[] args) {
		
		String str = "Rahul";
		
		ArrayList al = new ArrayList();
		
		while(true) {
			str = str + "test";
			
			al.add(str);   //memoryOutOferror
			//System.out.println(al);
		}

	}

}
