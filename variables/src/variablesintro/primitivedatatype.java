package variablesintro;

public class primitivedatatype {
	/*primitive data type
	 * 1. byte 2. short 3.int 4.long 5.char 6.float 7.double 8.boolean
	 *  byte data type byte = 8bit range -127 to 128
	 *  syntax  datatype variablename = value;
	 *  
	 *  must not begin with digit
	 *  should not be keywords
	 *  white space is not allowed
	 */
       public static void main(String[]args) {
    	   byte b1= 58;
    	   byte b2=127; // max limit
    	    
    	   System.out.println("byte data type-->"+b1);
    	   System.out.println("byte data type max limit-->"+b2);
    	   
    	   byte b3 = -58;
    	   byte b4 = -128; //min limit
    	   
    	   System.out.println("byte data type-->"+b3);
    	   System.out.println("byte data type min limit-->"+b4);
    	   
    	   
    	   /*2.short data type
    	    * short = 2 byte = 16bit Range = -32768 to 32767
    	    * syntax datatype variable name
    	    */
    	   short s1 = 8975;
    	   short s2 = -32768; //min value
    	   short s3 = 32767; //max value
    	    
    	   System.out.println("short data type-->"+s1);
    	   System.out.println("short data type min value-->"+s2);
    	   System.out.println("short data type max limit-->"+s3);
    	   
    	   
    	   /*int data type
    	    * int = 4byte = 32 bit range = -2147483648 to 2147483647
    	    * syntax datatype variablename = value;
    	    
    	    */
    	   int i1 = 896547;
    	   int i2 = -2147483648;//min limit
    	   int i3 = 2147483647; //max limit
    	   
    	   System.out.println("int data type-->"+i1);
    	   System.out.println("int data type min limit-->"+i2);
    	   System.out.println("int data type max limit-->"+i3);
    	
    	   
    	   long L1 = 589741786254l;
   	    
   	    long l2 = -9223372036854775808l; //min limit
   	    
   	    long l3 = 9223372036854775807l; //max limit
   	    
   	    System.out.println("long data type-->"+ L1);
   	    System.out.println("long data type min limit -->"+ l2);
   	    System.out.println("long data type max limit-->"+ l3);
   	    
    	
    	     
    	    
    	    
    	     
    	     
    	    
    	    
    	   
    	   
    	   
       }
}
