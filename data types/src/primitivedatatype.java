
public class primitivedatatype {
 public static void main(String[]args) {
	 /*primitive data types 
	  * 1.byte
	  * 2.short
	  * 3.int */
	 
	 //1byte = 8bit range -128 to 127
	 byte b1 = 85;
	 byte b2 = 127; //max value
	 // byte b3 = 130; more than max value not accepted
	  
	 System.out.println("byte data type-->"+b1);
	 System.out.println("byte data type max limit-->"+b2);
	 
	 byte b4 = -85;
	 byte b5 = -128; //min value 
  //byte b6 = -129; less than min value not accepted
	  System.out.println("byte data type-->"+b4);
	  System.out.println("byte data  type min limit-->"+b5);
	  System.out.println("*************************");
	  System.out.println();
	  
	  //2.short = 2 byte = 16 bit range==-32768 to 32767
	  short s1 = 5555;
	  short s2 = 32767; //max short value 
	  //short s3 = 39000; more than max value not allowed
	  
	  System.out.println("short data type-->"+s1);
	  System.out.println("short data type max limit-->"+s2);
	  
	  short s4 = -20503;
	  short s5 = -32768; // min value of short
	  // short s6 = 39258; less than min value not accepted
	  
	  System.out.println("short data type-->"+s4);
	  System.out.println("short data type min limit-->"+s5);
	  System.out.println("**************************");
	  System.out.println();
	  
	  //3.Integer = 4 byte = 32 bit range== -2147483648 to 2147483647
	  
	  int i1 = 4545454;
	  int i2 = 2147483647; //max value of integer
	 // int i3 = 2147483649; more than max value not allowed
	   System.out.println("integer data type-->"+i1);
	   System.out.println("integer data type max limit"+i2);
	   
	   int i4 = -45454545;
	   int i5 = -2147483648; //min integer value
	   //int i6 = -2147483649; less than min value not allowed
	    System.out.println("integer data type-->"+i4);
	    System.out.println("integer data type min limit"+i5);  
	    
	    /*4.long data type
	     * syntax  datatype variablename=value;
	     * long = 8 byte = 64bit;
	    range =-92233720368547758081;*/
	    
	    long l1 = -988556478996314l;
	     long l2 = -9223372036854775808l; //min limit
	     
	      System.out.println("Long data type-->"+l1);
	      System.out.println("Long data type min limit-->"+l2);
	      
	      long l3 = 9223372036854707l;
	       long l4 = 9223372036854708l;
	       
	        System.out.println("long data type-->"+l3);
	        System.out.println("long data type max limit-->"+l4);
	        
	     //char data type 
	        //Syntax data type variable name = value;
	        char c1 = 'f';
	        char c2 = '8';
	        
	        System.out.println("char data type-->"+c1);
	        System.out.println("char data type-->"+c2);
	        
	        //float data type
	    
	    
	    
	     
	    
	    
	   
	  
	  
	  
	  
 }
}
