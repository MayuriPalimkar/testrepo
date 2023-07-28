package multilevelinheritance;

public class multi {
 public static void main(String[] args) {
	 
	 whatsappv1 v1 = new  whatsappv1 ();
	 v1.version1();
	 
	 whatsappv2 v2 = new  whatsappv2 ();
	 v2.version1();
	 v2.version2();
	 
	 whatsappv3 v3 = new  whatsappv3 ();
	 v3.version1();
	 v3.version2();
	 v3.version3();
	 
	 whatsappv4 v4 = new  whatsappv4 ();
	 v4.version1();
	 v4.version2();
	 v4.version3();
	 v4.version4();
}
}
