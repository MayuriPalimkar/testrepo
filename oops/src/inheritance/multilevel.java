package inheritance;

public class multilevel {
public static void main(String[] args) {
	 
	whatsappv1 ref = new whatsappv1();
	ref.textmsg();
	System.out.println();
	
	whatsappv2 ref2 = new whatsappv2();
	ref2.textmsg();
	ref2.audiocalling();
	System.out.println();
	
	whatsappv3 ref3 = new whatsappv3();
	ref3.textmsg();
	ref3.audiocalling();
	ref3.videocalling();
	System.out.println();
	
	
	whatsappv4 ref4 = new whatsappv4();
	ref4.textmsg();
	ref4.audiocalling();
	ref4.videocalling();
	ref4.payment();
		
}
}
